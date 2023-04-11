package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Perfume;

public interface PerfumeService {
	List<Perfume> getAllPerfumeList();
	List<Perfume> getPerfumeListByPbrand(String pbrand);
	Set<Perfume> getPerfumeListByFilter(Map<String, List<String>> filter);
	Perfume getPerfumeByPname(String pname);
	void setNewPerfume(Perfume perfume);
	void setUpdatePerfume(Perfume perfume);
	void setDeletePerfume(String pname);
}
