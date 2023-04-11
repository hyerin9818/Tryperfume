package com.springmvc.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.springmvc.domain.Etc;
import com.springmvc.repository.EtcRepository;

@Service
public class EtcServiceImpl implements EtcService {
	
	@Autowired
	private EtcRepository etcRepository;
	
	@Override
	public List<Etc> getAllEtcList() {
		// TODO Auto-generated method stub
		return etcRepository.getAllEtcList();
	}

	@Override
	public List<Etc> getEtcListByCate(String cate) {
		// TODO Auto-generated method stub
		List<Etc> etcByCate=etcRepository.getEtcListByCate(cate);
		return etcByCate;
	}
	
	@Override
	public List<Etc> getEtcListByEbrand(String ebrand) {
		// TODO Auto-generated method stub
		List<Etc> etcByEbrand=etcRepository.getEtcListByEbrand(ebrand);
		return etcByEbrand;
	}
	
	@Override
	public Set<Etc> getEtcListByFilter(Map<String, List<String>> filter) {
		// TODO Auto-generated method stub
		Set<Etc> etcsByFilter=etcRepository.getEtcListByFilter(filter);
		return etcsByFilter;
	}

	@Override
	public Etc getEtcByEname(String ename) {
		// TODO Auto-generated method stub
		Etc etcByEname=etcRepository.getEtcByName(ename);
		return etcByEname;
	}

	@Override
	//etc 제품 추가
	public void setNewEtc(Etc etc) {
		// TODO Auto-generated method stub
		System.out.println(etc);
		
		//데이터베이스 파일 이름 집어넣기
		MultipartFile epicmain=etc.getEpicmain();
		MultipartFile epicsub1=etc.getEpicsub1();
		MultipartFile epicsub2=etc.getEpicsub2();
		MultipartFile epicsub3=etc.getEpicsub3();
		String savemain=epicmain.getOriginalFilename();
		String savesub1=epicsub1.getOriginalFilename();
		String savesub2=epicsub2.getOriginalFilename();
		String savesub3=epicsub3.getOriginalFilename();
		etc.setEpicmainname(savemain);
		etc.setEpicsub1name(savesub1);
		etc.setEpicsub2name(savesub2);
		etc.setEpicsub3name(savesub3);
		
		//이미지 업로드 경로 설정
		File mainFile=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\etc",savemain);
		File sub1File=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\etc",savesub1);
		File sub2File=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\etc",savesub2);
		File sub3File=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\etc",savesub3);
		
		try {
			epicmain.transferTo(mainFile);
			epicsub1.transferTo(sub1File);
			epicsub2.transferTo(sub2File);
			epicsub3.transferTo(sub3File);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		etcRepository.setNewEtc(etc);

	}

	@Override
	public void setUpdateEtc(Etc etc) {
		// TODO Auto-generated method stub
		System.out.println(etc);
		
		//데이터베이스 파일 이름 집어넣기
		MultipartFile epicmain=etc.getEpicmain();
		MultipartFile epicsub1=etc.getEpicsub1();
		MultipartFile epicsub2=etc.getEpicsub2();
		MultipartFile epicsub3=etc.getEpicsub3();
		String savemain=epicmain.getOriginalFilename();
		String savesub1=epicsub1.getOriginalFilename();
		String savesub2=epicsub2.getOriginalFilename();
		String savesub3=epicsub3.getOriginalFilename();
		etc.setEpicmainname(savemain);
		etc.setEpicsub1name(savesub1);
		etc.setEpicsub2name(savesub2);
		etc.setEpicsub3name(savesub3);
		
		//이미지 업로드 경로 설정
		File mainFile=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\etc",savemain);
		File sub1File=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\etc",savesub1);
		File sub2File=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\etc",savesub2);
		File sub3File=new File("C:\\Users\\UserK\\Desktop\\Tryperfume 수정본\\src\\main\\webapp\\resources\\images\\etc",savesub3);
		
		try {
			epicmain.transferTo(mainFile);
			epicsub1.transferTo(sub1File);
			epicsub2.transferTo(sub2File);
			epicsub3.transferTo(sub3File);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		etcRepository.setUpdateEtc(etc);
		
	}

	@Override
	public void setDeleteEtc(String ename) {
		// TODO Auto-generated method stub
		System.out.println(ename);
		etcRepository.setDeleteEtc(ename);
		
	}

	

}
