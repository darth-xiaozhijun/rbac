package com.geekshow.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.geekshow.mapper.ElementMapper;
import com.geekshow.pojo.Element;
import com.geekshow.service.ElementService;

@Service
public class ElementServiceImpl implements ElementService {
	@Resource
	private ElementMapper elementMapper;
	@Override
	public List<Element> selByRid(int rid) {
		return elementMapper.selByRid(rid);
	}

}
