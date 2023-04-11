package com.springmvc.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;


import com.springmvc.domain.Etc;

public interface EtcRepository {
	List<Etc> getAllEtcList();
	List<Etc> getEtcListByCate(String cate);
	List<Etc> getEtcListByEbrand(String ebrand);
	Set<Etc> getEtcListByFilter(Map<String, List<String>> filter);
	 Etc getEtcByName(String ename);
	 void setNewEtc(Etc etc);
	 void setUpdateEtc(Etc etc);
	 void setDeleteEtc(String ename);
}
