package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

	public static void main(String[] args) {
		System.out.println("我搞的玩的");
		System.out.println("我真的是搞的玩的，闲的没事干--");
		System.out.println("我真的是搞的玩的，闲的没事干--2");
		System.out.println("主干添加");
		System.out.println("分支添加");
		System.out.println("config.user is changed");
	}

}
