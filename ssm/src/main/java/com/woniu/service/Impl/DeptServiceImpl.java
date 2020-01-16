package com.woniu.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.DeptMapper;
import com.woniu.domain.Dept;
import com.woniu.service.IDeptService;

@Service
public class DeptServiceImpl implements IDeptService {

	@Autowired
	private DeptMapper deptMapper;
	
	@Transactional
	@Override
	public void save(Dept dept) {
		deptMapper.insertSelective(dept);
	}
	
	@Transactional
	@Override
	public void delete(Integer did) {
		deptMapper.deleteByPrimaryKey(did);
	}
	
	@Transactional
	@Override
	public void update(Dept dept) {
		deptMapper.updateByPrimaryKeySelective(dept);
	}

	@Override
	public Dept findone(Integer did) {
		
		return deptMapper.selectByPrimaryKey(did);
	}
	
	@Override
	public List<Dept> findAll() {
			return deptMapper.selectByExample(null);
		}
		
	}


