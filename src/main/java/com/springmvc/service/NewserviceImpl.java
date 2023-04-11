package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.News;
import com.springmvc.repository.NewsRepository;

@Service
public class NewserviceImpl implements NewsService {

	@Autowired
	private NewsRepository newsRepository;
	
	@Override
	public List<News> gettAllNewsList() {
		return newsRepository.gettAllNewsList();
	}

	
	@Override
	public void setNewNews(News news) throws Exception {
		System.out.println(news);
		newsRepository.setNewNews(news);
	}


	@Override
	public News getNewsBySnum(int snum) {
		// TODO Auto-generated method stub
		System.out.println(snum);
		News newsBySnum=newsRepository.getNewsBySnum(snum);
		return newsBySnum;
	}


	@Override
	public void setUpdateNews(News news) {
		// TODO Auto-generated method stub
		System.out.println(news);
		newsRepository.setUpdateNews(news);
		
	}


	@Override
	public void setDeleteNews(int snum) {
		// TODO Auto-generated method stub
		System.out.println(snum);
		newsRepository.setDeleteNews(snum);
		
	}

}
