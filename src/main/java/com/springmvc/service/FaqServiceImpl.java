package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.Faq;
import com.springmvc.repository.FaqRepository;

@Service
public class FaqServiceImpl implements FaqService {

	@Autowired
	private FaqRepository faqRepository;
	
	@Override
	public List<Faq> getAllFaqList() {
		return faqRepository.getAllFaqList();
	}

	

	@Override
	public void setNewFaq(Faq faq) throws Exception {
		System.out.println(faq);
		faqRepository.setNewFaq(faq);

	}



	@Override
	public Faq getFaqByAnum(int anum) {
		// TODO Auto-generated method stub
		System.out.println(anum);
		Faq faqByAnum=faqRepository.getFaqByAnum(anum);
		return faqByAnum;
	}



	@Override
	public void setUpdateFaq(Faq faq) {
		// TODO Auto-generated method stub
		System.out.println(faq);
		faqRepository.setUpdateFaq(faq);
	}



	@Override
	//글 삭제
	public void setDeleteFaq(int anum) {
		// TODO Auto-generated method stub
		System.out.println(anum);
		faqRepository.setDeleteFaq(anum);
	}


}
