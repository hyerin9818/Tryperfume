package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Freeboard;


public interface FreeboardService {
	
	List<Freeboard> gettAllFreeboardList();
	Freeboard getFreeboardByFnum(int fnum);
	void setNewFreeboard(Freeboard freeboard) throws Exception;
	
}
