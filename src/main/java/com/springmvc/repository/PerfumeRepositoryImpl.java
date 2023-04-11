package com.springmvc.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;


import com.springmvc.domain.Perfume;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import javax.sql.DataSource;

@Repository
public class PerfumeRepositoryImpl implements PerfumeRepository {
	
	private List<Perfume> listOfPerfumes = new ArrayList<Perfume>();
	
	private JdbcTemplate template;
	
	@Autowired
	public void setJdbctemplate(DataSource dataSource) {
		this.template=new JdbcTemplate(dataSource);
	}
	@Override
	//향수 페이지에 뿌리기
	public List<Perfume> getAllPerfumeList() {
		// TODO Auto-generated method stub
		String SQL="select*from perfume";
		List<Perfume> listOfPerfume=template.query(SQL,new PerfumeRowMapper());
		return listOfPerfume;
	}
	@Override
	public List<Perfume> getPerfumeListByPbrand(String pbrand) {
		// TODO Auto-generated method stub
		List<Perfume> perfumesByPbrand=new ArrayList<Perfume>();
		String SQL="select*from perfume where pbrand like '%"+pbrand+"%'";
		perfumesByPbrand=template.query(SQL, new PerfumeRowMapper());
		return perfumesByPbrand;
	}
	@Override
	public Set<Perfume> getPerfumeListByFilter(Map<String, List<String>> filter) {
		// TODO Auto-generated method stub
		Set<Perfume> perfumesByBrand=new HashSet<Perfume>();
		Set<Perfume> perfumesByName=new HashSet<Perfume>();
		Set<String> criterias=filter.keySet();
		
		if(criterias.contains("pname")) {
			for(int j=0;j<filter.get("pname").size();j++) {
				String productName=filter.get("pname").get(j);
				String SQL="select*from perfume where pname Like '%" + productName + "%'";
				perfumesByName.addAll(template.query(SQL,new PerfumeRowMapper()));
			}
		}
		
		if(criterias.contains("pbrand")) {
			for(int i=0; i<filter.get("pbrand").size();i++) {
				String pbrand=filter.get("pbrand").get(i);
				String SQL="select*from perfume where pbrand like '%"+pbrand+"%'";
				
			}
		}
		perfumesByBrand.retainAll(perfumesByName);
		return perfumesByBrand;
	}
	@SuppressWarnings("deprecation")
	@Override
	//향수 상세페이지 이동
	public Perfume getPerfumeByName(String pname) {
		// TODO Auto-generated method stub
		Perfume perfumeInfo=null;
		String SQL="select count(*) from perfume where pname=?";
		int rowCount=template.queryForObject(SQL, Integer.class, pname);
		if(rowCount !=0) {
			SQL="select*from perfume where pname=?";
			perfumeInfo=template.queryForObject(SQL, new Object[] {pname}, new PerfumeRowMapper());
		}
		if(perfumeInfo==null)
			
;		return perfumeInfo;
	}
	@Override
	//향수 제품 추가하기
	public void setNewPerfume(Perfume perfume) {
		// TODO Auto-generated method stub
		
		
		 String SQL="insert into perfume(pnum,pname,pbrand,pmoney,pdes,psmell,pgram,ppicmainname,ppicsub1name,ppicsub2name,ppicsub3name)"
				 +"values(?,?,?,?,?,?,?,?,?,?,?)"; //쿼리문 작성
		 
		 System.out.println(perfume);
		 
		 template.update(SQL,perfume.getPnum(), perfume.getPname(),perfume.getPbrand(),perfume.getPmoney()
				 ,perfume.getPdes(),perfume.getPsmell(),perfume.getPgram(),perfume.getPpicmainname(),perfume.getPpicsub1name(),perfume.getPpicsub2name(),perfume.getPpicsub3name()
		);
		 
	}
	@Override
	public void setUpdatePerfume(Perfume perfume) {
		// TODO Auto-generated method stub
		System.out.println(perfume);
		String SQL="update perfume set pname=?,pbrand=?,pmoney=?,pdes=?,psmell=?,pgram=?,ppicmainname=?,ppicsub1name=?,ppicsub2name=?,ppicsub3name=? where pnum=?";
		template.update(SQL,perfume.getPname(),perfume.getPbrand(),perfume.getPmoney(),perfume.getPdes(),perfume.getPsmell(),perfume.getPgram(),perfume.getPpicmainname(),perfume.getPpicsub1name(),perfume.getPpicsub2name(),perfume.getPpicsub3name(),perfume.getPnum());
	}
	@Override
	public void setDeletePerfume(String pname) {
		// TODO Auto-generated method stub
		System.out.println(pname);
		String SQL="delete from perfume where pname=?";
		this.template.update(SQL,pname);
		
	}

	

}
