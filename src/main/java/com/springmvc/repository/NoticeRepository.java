package com.springmvc.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Notice;

public interface NoticeRepository{
	//페이지 뿌리기
	List<Notice> getAllNoticeList();
	//페이지 매핑
	Notice getNoticeByWnum(int wnum);
	//글 추가
	void setNewNotice(Notice notice) throws Exception;
	//글 수정
	void setUpdateNotice(Notice notice);
	//글 삭제
	void setDeleteNotice(int wnum);

	
}
