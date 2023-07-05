package com.atguigu.crud.dao;


import com.atguigu.crud.bean.EmpSalary;

import java.util.List;

public interface SalaryMapper {

    List<EmpSalary> getAllEmpSalary();

    EmpSalary getEmpSalaryById(Integer id);

    List<EmpSalary> getEmpSalaryByEmpId(Integer empId);

    Integer addEmpSalary(EmpSalary empSalary);

    Integer deleteEmpSalary(Integer id);

    Integer updataEmpSalaryById(Integer id, EmpSalary empSalary);

}
