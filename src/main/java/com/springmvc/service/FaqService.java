package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Faq;


public interface FaqService {
	List<Faq> getAllFaqList();
	Faq getFaqByAnum(int anum);
	void setNewFaq(Faq faq) throws Exception;
	void setUpdateFaq(Faq faq);
	void setDeleteFaq(int anum);
}
