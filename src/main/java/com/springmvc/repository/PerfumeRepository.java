package com.springmvc.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;


import com.springmvc.domain.Perfume;

public interface PerfumeRepository {
	//향수 전제페이지 불러오기
	List<Perfume> getAllPerfumeList();
	List<Perfume> getPerfumeListByPbrand(String pbrand);
	Set<Perfume> getPerfumeListByFilter(Map<String, List<String>> filter);
	//향수 상세 페이지 이동
	 Perfume getPerfumeByName(String pname);
	 // 향수 목록 추가
	 void setNewPerfume(Perfume perfume);
	 // 수정
	 void setUpdatePerfume(Perfume perfume);
	 // 삭제
	 void setDeletePerfume(String pname);
}
