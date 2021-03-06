package com.woniu.service;

import java.util.List;

import com.woniu.domain.Dept;

public interface IDeptService {
	
	void save(Dept dept);
	void delete(Integer did);
	void update(Dept dept);
	Dept findone(Integer did);
	List<Dept> findAll();
	
}
