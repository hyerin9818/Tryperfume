package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.News;

public interface NewsService {
	List<News> gettAllNewsList();
	News getNewsBySnum(int snum);
	void setNewNews(News news) throws Exception;
	void setUpdateNews(News news);
	void setDeleteNews(int snum);
}
