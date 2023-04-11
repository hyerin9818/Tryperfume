package com.springmvc.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Requestboard;

public interface RequestboardRepository {
	List<Requestboard> getAllRequestboardList();
	Requestboard getRequestboardByRnum(int rnum);
	void setNewRequestboard(Requestboard requestboard) throws Exception;
	}
