package org.chiangleoi.erp.mapper;

import org.chiangleoi.erp.pojo.Emp;

import java.util.List;

public interface EmpMapper {

    List<Emp> selectAll();

    Emp selectOne();
}
