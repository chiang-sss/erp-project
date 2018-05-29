package org.chiangleoi.erp.controller;

import org.chiangleoi.erp.pojo.Emp;
import org.chiangleoi.erp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Emp> findAllEmp() {
        System.out.println("empService:" + empService);
        return this.empService.fetchAllEmp();
    }

    @RequestMapping("/findOne")
    @ResponseBody
    public Emp findOneEmp() {
        return this.empService.fetchOne();
    }
}
