package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.Freeboard;
import com.springmvc.repository.FreeboardRepository;

@Service
public class FreeboardServiceImpl implements FreeboardService {

	@Autowired
	private FreeboardRepository freeboardRepository;
	
	@Override
	public List<Freeboard> gettAllFreeboardList() {
		return freeboardRepository.getAllFreeboardList();
	}

	

	



	@Override
	public Freeboard getFreeboardByFnum(int fnum) {
		// TODO Auto-generated method stub
		System.out.println(fnum);
		Freeboard freeboardByFnum=freeboardRepository.getFreeboardByFnum(fnum);
		return freeboardByFnum;
	}







	@Override
	public void setNewFreeboard(Freeboard freeboard) throws Exception {
		System.out.println(freeboard);
		freeboardRepository.setNewFreeboard(freeboard);
		
	}



	

}
