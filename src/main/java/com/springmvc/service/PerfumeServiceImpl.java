package com.springmvc.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import com.springmvc.domain.Perfume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.springmvc.repository.PerfumeRepository;

@Service
public class PerfumeServiceImpl implements PerfumeService {
	
	@Autowired
	private PerfumeRepository perfumeRepository ;
	

	@Override
	//perfume 테이블 데이터 불러오기
	public List<Perfume> getAllPerfumeList() {
		// TODO Auto-generated method stub
		return perfumeRepository.getAllPerfumeList();
	}


	@Override
	public List<Perfume> getPerfumeListByPbrand(String pbrand) {
		// TODO Auto-generated method stub
		List<Perfume> perfumeByPbrand=perfumeRepository.getPerfumeListByPbrand(pbrand);
		return perfumeByPbrand;
	}


	@Override
	public Set<Perfume> getPerfumeListByFilter(Map<String, List<String>> filter) {
		// TODO Auto-generated method stub
		Set<Perfume> perfumesByFilter=perfumeRepository.getPerfumeListByFilter(filter);
		return perfumesByFilter;
	}


	@Override
	//perfume 이름에 따라 상세페이지 불러오기
	public Perfume getPerfumeByPname(String pname) {
		// TODO Auto-generated method stub
		Perfume perfumeByPname=perfumeRepository.getPerfumeByName(pname);
		return perfumeByPname;
	}


	@Override
	//perfume 테이블에 데이터 추가하기
	public void setNewPerfume(Perfume perfume) {
		// TODO Auto-generated method stub
		System.out.println(perfume);
		
		//데이터베이스에 이름 뽑아오기
		MultipartFile ppicmain=perfume.getPpicmain();
		MultipartFile ppicsub1=perfume.getPpicsub1();
		MultipartFile ppicsub2=perfume.getPpicsub2();
		MultipartFile ppicsub3=perfume.getPpicsub3();
		String savemain=ppicmain.getOriginalFilename();
		String savesub1=ppicsub1.getOriginalFilename();
		String savesub2=ppicsub2.getOriginalFilename();
		String savesub3=ppicsub3.getOriginalFilename();
		perfume.setPpicmainname(savemain);
		perfume.setPpicsub1name(savesub1);
		perfume.setPpicsub2name(savesub2);
		perfume.setPpicsub3name(savesub3);
		
		//이미지 업로드 경로 설정
		File mainFile=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\perfume",savemain);
		File sub1File=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\perfume",savesub1);
		File sub2File=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\perfume",savesub2);
		File sub3File=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\perfume",savesub3);
		
		try {
			ppicmain.transferTo(mainFile);
			ppicsub1.transferTo(sub1File);
			ppicsub2.transferTo(sub2File);
			ppicsub3.transferTo(sub3File);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		perfumeRepository.setNewPerfume(perfume);
		
	}


	@Override
	public void setUpdatePerfume(Perfume perfume) {
		// TODO Auto-generated method stub
		System.out.println(perfume);
		
		MultipartFile ppicmain=perfume.getPpicmain();
		MultipartFile ppicsub1=perfume.getPpicsub1();
		MultipartFile ppicsub2=perfume.getPpicsub2();
		MultipartFile ppicsub3=perfume.getPpicsub3();
		String savemain=ppicmain.getOriginalFilename();
		String savesub1=ppicsub1.getOriginalFilename();
		String savesub2=ppicsub2.getOriginalFilename();
		String savesub3=ppicsub3.getOriginalFilename();
		perfume.setPpicmainname(savemain);
		perfume.setPpicsub1name(savesub1);
		perfume.setPpicsub2name(savesub2);
		perfume.setPpicsub3name(savesub3);
		
		//이미지 업로드 경로 설정
		File mainFile=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\perfume",savemain);
		File sub1File=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\perfume",savesub1);
		File sub2File=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\perfume",savesub2);
		File sub3File=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\perfume",savesub3);
		
		try {
			ppicmain.transferTo(mainFile);
			ppicsub1.transferTo(sub1File);
			ppicsub2.transferTo(sub2File);
			ppicsub3.transferTo(sub3File);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		perfumeRepository.setUpdatePerfume(perfume);
		
	}


	@Override
	public void setDeletePerfume(String pname) {
		// TODO Auto-generated method stub
		System.out.println(pname);
		perfumeRepository.setDeletePerfume(pname);
		
	}

}
