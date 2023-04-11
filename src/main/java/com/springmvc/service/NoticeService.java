package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Notice;


public interface NoticeService {
	
	List<Notice> getAllNoticeList();
	
	Notice getNoticeByWnum(int wnum);
	
	void setNewNotice(Notice notice) throws Exception;
	
	void setUpdateNotice(Notice notice);
	
	void sepDeleteNotice(int wnum);
	
}
