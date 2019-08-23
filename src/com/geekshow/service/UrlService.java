package com.geekshow.service;

import java.util.List;

import com.geekshow.pojo.Url;

public interface UrlService {
	List<Url> selByRid(int rid);
	
	List<Url> showAll();
}
