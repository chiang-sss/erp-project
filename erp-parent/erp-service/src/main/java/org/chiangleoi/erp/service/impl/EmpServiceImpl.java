package org.chiangleoi.erp.service.impl;

import org.chiangleoi.erp.mapper.EmpMapper;
import org.chiangleoi.erp.pojo.Emp;
import org.chiangleoi.erp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("empService")
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> fetchAllEmp() {
        return this.empMapper.selectAll();
    }

    @Override
    public Emp fetchOne() {
        return this.empMapper.selectOne();
    }

}
