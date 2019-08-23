package com.geekshow.service;

import java.util.List;

import com.geekshow.pojo.Element;

public interface ElementService {
	List<Element> selByRid(int rid);
}
