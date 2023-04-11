package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.Notice;
import com.springmvc.domain.Review;
import com.springmvc.repository.NoticeRepository;


@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeRepository noticeRepository;
	
	
	@Override
	public List<Notice> getAllNoticeList() {
		return noticeRepository.getAllNoticeList();
	}

	

	@Override
	public void setNewNotice(Notice notice) throws Exception{
		System.out.println(notice);
		noticeRepository.setNewNotice(notice);

	}



	@Override
	public Notice getNoticeByWnum(int wnum) {
		// TODO Auto-generated method stub
		System.out.println(wnum);
		Notice noticeByWnum=noticeRepository.getNoticeByWnum(wnum);
		return noticeByWnum;
	}



	@Override
	public void setUpdateNotice(Notice notice){
		// TODO Auto-generated method stub
		System.out.println(notice);
		noticeRepository.setUpdateNotice(notice);
		
	}



	@Override
	public void sepDeleteNotice(int wnum) {
		// TODO Auto-generated method stub\
		System.out.println(wnum);
		noticeRepository.setDeleteNotice(wnum);
		
	}


	



}
