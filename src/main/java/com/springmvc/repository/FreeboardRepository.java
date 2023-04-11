package com.springmvc.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Freeboard;

public interface FreeboardRepository {
	List<Freeboard> getAllFreeboardList();
	Freeboard getFreeboardByFnum(int fnum);
	void setNewFreeboard(Freeboard freeboard) throws Exception;
	
}