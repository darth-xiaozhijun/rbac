package com.geekshow.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.geekshow.service.UrlService;


@Controller
public class UrlController {
	@Resource
	private UrlService urlService;
	
	@RequestMapping("showAllUrl")
	public String showAll(){
		return "redirect:/main.jsp";
	}
}
