package cn.com.do1.dao;

import java.util.List;

import cn.com.do1.entities.Dept;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
