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

import com.springmvc.domain.Etc;

@Repository
public class EtcRepositoryImpl implements EtcRepository {
	
	private List<Etc> listOfEtcs=new ArrayList<Etc>();
	
	private JdbcTemplate template;
	
	@Autowired
	public void setJdbctemplate(DataSource dataSource) {
		this.template=new JdbcTemplate(dataSource);
	}
	@Override
	public List<Etc> getAllEtcList() {
		// TODO Auto-generated method stub
		String SQL="select*from etc";
		List<Etc> listOfEtc=template.query(SQL, new EtcRowMapper());
		return listOfEtc;
	}

	@Override
	public List<Etc> getEtcListByCate(String cate) {
		// TODO Auto-generated method stub
		List<Etc> etcsByCate=new ArrayList<Etc>();
		String SQL="select*from etc where cate like '%"+cate+"%'";
		etcsByCate=template.query(SQL, new EtcRowMapper());
		return etcsByCate;
	}
	
	@Override
	public List<Etc> getEtcListByEbrand(String ebrand) {
		// TODO Auto-generated method stub
		List<Etc> etcsByEbrand=new ArrayList<Etc>();
		String SQL="select*from etc where cate like '%"+ebrand+"%'";
		etcsByEbrand=template.query(SQL, new EtcRowMapper());
		return etcsByEbrand;
	}
	@Override
	public Set<Etc> getEtcListByFilter(Map<String, List<String>> filter) {
		// TODO Auto-generated method stub
		Set<Etc> etcsByBrand=new HashSet<Etc>();
		Set<Etc> etcsByName=new HashSet<Etc>();
		Set<String> criterias=filter.keySet();
		
		if(criterias.contains("ename")) {
			for(int j=0; j<filter.get("ename").size();j++) {
				String etcName=filter.get("ename").get(j);
				String SQL="select*from etc where ename like '%"+etcName+"%'";
				etcsByName.addAll(template.query(SQL, new EtcRowMapper()));
			}
		}
		
		if(criterias.contains("ebrand")) {
			for(int i=0; i<filter.get("ebrand").size();i++) {
				String etcbrand=filter.get("ebrand").get(i);
				String SQL="select*from etc where ebrand like '%"+etcbrand+"%'";
			}
		}
		etcsByBrand.retainAll(etcsByName);
		return etcsByBrand;
	}
	@SuppressWarnings("deprecation")
	@Override
	public Etc getEtcByName(String ename) {
		// TODO Auto-generated method stub
		Etc etcInfo=null;
		String SQL="select count(*) from etc where ename=?";
		int rowCount=template.queryForObject(SQL, Integer.class,ename);
		if(rowCount !=0) {
			SQL="select*from etc where ename=?";
			etcInfo=template.queryForObject(SQL, new Object[] {ename},new EtcRowMapper());
		}
		if(etcInfo==null) {}
			
		return etcInfo;
	}

	@Override
	// 제품 추가
	public void setNewEtc(Etc etc) {
		// TODO Auto-generated method stub
		
		String SQL="insert into etc(enumber,ename,cate,ebrand,emoney,edes,esmell,egram,epicmainname,epicsub1name,epicsub2name,epicsub3name)"
					+"values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		System.out.println(etc);
		
		template.update(SQL, etc.getEnumber(),etc.getEname(),etc.getCate(),etc.getEbrand(),etc.getEmoney(),etc.getEdes(),
						etc.getEsmell(),etc.getEgram(),etc.getEpicmainname(),etc.getEpicsub1name(),etc.getEpicsub2name(),etc.getEpicsub3name());
					
	}
	@Override
	public void setUpdateEtc(Etc etc) {
		// TODO Auto-generated method stub
		System.out.println(etc);
		String SQL="update etc set ename=?,cate=?,ebrand=?,emoney=?,edes=?,esmell=?,egram=?,epicmainname=?,epicsub1name=?,epicsub2name=?,epicsub3name=? where enumber=?";
		template.update(SQL,etc.getEname(),etc.getCate(),etc.getEbrand(),etc.getEmoney(),etc.getEdes(),etc.getEsmell(),etc.getEgram(),etc.getEpicmainname(),etc.getEpicsub1name(),etc.getEpicsub2name(),etc.getEpicsub3name(),etc.getEnumber());
	}
	@Override
	public void setDeleteEtc(String ename) {
		// TODO Auto-generated method stub
		System.out.println(ename);
		String SQL="delete from etc where ename=?";
		this.template.update(SQL,ename);
	}
	

}
