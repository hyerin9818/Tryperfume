package com.springmvc.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Faq;


public interface FaqRepository {
	List<Faq> getAllFaqList();
	Faq getFaqByAnum(int anum);
	void setNewFaq(Faq faq) throws Exception;
	void setUpdateFaq(Faq faq);
	void setDeleteFaq(int anum);
	
}	
