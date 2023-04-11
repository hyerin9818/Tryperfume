package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.Freeboard;
import com.springmvc.domain.Requestboard;
import com.springmvc.repository.RequestboardRepository;


@Service
public class RequestboardServiceImpl implements RequestboardService {

	@Autowired
	private RequestboardRepository requestboardRepository;
	
	
	@Override
	//게시판 뿌리기
	public List<Requestboard> getAllRequestboardList() {
		return requestboardRepository.getAllRequestboardList();
	}

	

	@Override
	//게시판 추가
	public void setNewRequestboard(Requestboard requestboard) throws Exception {
		System.out.println(requestboard);
		requestboardRepository.setNewRequestboard(requestboard);

	}

	


	@Override
	public Requestboard getRequestboardByRnum(int rnum) {
		// TODO Auto-generated method stub
		System.out.println(rnum);
		Requestboard requestboardByRnum=requestboardRepository.getRequestboardByRnum(rnum);
		return requestboardByRnum;
	}





}
