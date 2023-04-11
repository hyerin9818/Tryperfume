package com.springmvc.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.domain.Faq;
import com.springmvc.domain.Review;

@Repository
public class FaqRepositoryImpl implements FaqRepository {

	private List<Faq> listofFaq = new ArrayList<Faq>();
	
	private JdbcTemplate template;
	
	@Autowired
	public void setJdbctemplate(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}
	
	@Override
	//글 목록 뿌리기
	public List<Faq> getAllFaqList() {
		String SQL = "select * from faq";
		List<Faq> listofFaq = template.query(SQL, new FaqRowMapper());
		return listofFaq;
	}

	
	@Override
	//글 추가
	public void setNewFaq(Faq faq) throws Exception {
		String SQL="insert into faq(anum,atname,memId,adate,atmain,aviews)"
				+"values(?,?,?,?,?,?)";
		
		System.out.println(faq);
		
		Object[] params = new Object[] {
		        null, // nnum
		        faq.getAtname(), // ntname
		        faq.getMemId(), // memId
		        faq.getAdate(), // ndate
		        
		        faq.getAtmain(), // ntmain
		        null // views
		    };
		
		template.update(SQL,params);
	}

	@Override
	//상세페이지 매핑
	public Faq getFaqByAnum(int anum) {
		// TODO Auto-generated method stub
		System.out.println(anum);
		Faq faqInfo=null;
		String SQL="select count(*) from faq where anum=?";
		int rowCount=template.queryForObject(SQL, Integer.class,anum);
		if(rowCount != 0) {
			SQL="select*from faq where anum=?";
			faqInfo=template.queryForObject(SQL, new Object[] {anum},new FaqRowMapper());
		}
			
		return faqInfo;
	}

	@Override
	//글 수정
	public void setUpdateFaq(Faq faq) {
		// TODO Auto-generated method stub
		if(faq.getAtname()!=null) {
			String SQL="update faq set atname=?,adate=?,atmain=?,aview=? where atname=?";
			template.update(SQL,faq.getAtname(),null,faq.getAtmain(),null,faq.getAtname());
		}
	}

	@Override
	//글 삭제
	public void setDeleteFaq(int anum) {
		// TODO Auto-generated method stub
		String SQL="delect from faq where anum=?";
		System.out.println(anum);
		this.template.update(SQL,anum);
	}

	
}

