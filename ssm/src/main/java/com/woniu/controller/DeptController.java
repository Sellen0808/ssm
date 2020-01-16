package com.woniu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.woniu.domain.Dept;
import com.woniu.service.IDeptService;

@Controller
@RequestMapping("depts")
public class DeptController {

	@Autowired
	private IDeptService service;
	
	@RequestMapping(method=RequestMethod.POST)
	private String save(Dept dept) {
		service.save(dept);
		return "list";
	}
	@RequestMapping(method=RequestMethod.POST)
	private String delete(Integer did) {
		service.delete(did);
		return "list";
	}
	@RequestMapping(method=RequestMethod.POST)
	private String update(Dept dept) {
		service.update(dept);
		return "list";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	private String findAll() {
		service.findAll();
		return "list";
	}
}
