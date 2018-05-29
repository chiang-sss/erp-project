package org.chiangleoi.erp.service;

import org.chiangleoi.erp.pojo.Emp;

import java.util.List;

public interface EmpService {

    List<Emp> fetchAllEmp();

    Emp fetchOne();
}
