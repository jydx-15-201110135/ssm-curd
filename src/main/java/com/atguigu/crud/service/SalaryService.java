package com.atguigu.crud.service;

import com.atguigu.crud.bean.EmpSalary;
import com.atguigu.crud.bean.EmployeeExample;
import com.atguigu.crud.dao.SalaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {

    @Autowired
    SalaryMapper salaryMapper;

    public List<EmpSalary> getAllEmpSalary(){
        List<EmpSalary> allEmpSalary = salaryMapper.getAllEmpSalary();
        return allEmpSalary;
    }

    public EmpSalary findEmpSalaryById(Integer id) {
        EmpSalary empSalary = salaryMapper.getEmpSalaryById(id);
        return empSalary;
    }

    public List<EmpSalary> findEmpSalaryByEmpId(Integer empId) {
        EmpSalary empSalary = new EmpSalary();

        return salaryMapper.getEmpSalaryByEmpId(empId);
    }

    public void addEmpSalary(EmpSalary empSalary){
        salaryMapper.addEmpSalary(empSalary);

    }

    public void deleteBatch(List<Integer> ids) {
        // TODO Auto-generated method stub

    }

    public void deleteEmpSalary(Integer id) {
        salaryMapper.deleteEmpSalary(id);
    }

    public void saveEmpSalary(Integer id,EmpSalary empSalary) {
        salaryMapper.updataEmpSalaryById(id, empSalary);
    }

}
