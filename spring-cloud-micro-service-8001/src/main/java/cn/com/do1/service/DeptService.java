package cn.com.do1.service;

import cn.com.do1.entities.Dept;

import java.util.List;



public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
