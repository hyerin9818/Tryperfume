package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Requestboard;


public interface RequestboardService {
	
	List<Requestboard> getAllRequestboardList();
	Requestboard getRequestboardByRnum(int rnum);
	void setNewRequestboard(Requestboard requestboard) throws Exception;
	
}
