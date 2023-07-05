package com.atguigu.crud.test;

import com.atguigu.crud.bean.EmpSalary;
import com.atguigu.crud.dao.SalaryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class SalaryMapperTest {
    @Autowired
    SalaryMapper salaryMapper;

    @Test
    public void getAllEmpSalary(){
        List<EmpSalary> allEmpSalary = salaryMapper.getAllEmpSalary();
        if (allEmpSalary == null) {
            System.out.println("无数据");
        }
        for (EmpSalary empSalary : allEmpSalary) {
            System.out.println(empSalary);
        }
        return;
    }
}
