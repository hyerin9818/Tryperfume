package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Etc;

public interface EtcService {
	List<Etc> getAllEtcList();
	List<Etc> getEtcListByCate(String cate);
	List<Etc> getEtcListByEbrand(String ebrand);
	Set<Etc> getEtcListByFilter(Map<String, List<String>> filter);
	Etc getEtcByEname(String ename);
	void setNewEtc(Etc etc);
	void setUpdateEtc(Etc etc);
	void setDeleteEtc(String ename);
	

}
