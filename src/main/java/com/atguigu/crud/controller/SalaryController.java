package com.atguigu.crud.controller;

import com.atguigu.crud.bean.EmpSalary;
import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.service.EmployeeService;
import com.atguigu.crud.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SalaryController {

    @Autowired
    SalaryService salaryService;


    // 查询
    /**
     * 查询所有员工的工资信息
     * @return
     */
    @RequestMapping("/salary/all")
    public Msg findAllEmpSalary(){
        List<EmpSalary> allEmpSalary = salaryService.getAllEmpSalary();
        return Msg.success().add("OK", allEmpSalary);
    }

    /**
     * 根据 id 查询某项工资信息
     * @param id
     * @return
     */
    @RequestMapping("/salary/get/{id}")
    public Msg findEmpSalaryById(@PathVariable("id")Integer id){
        EmpSalary empSalary = salaryService.findEmpSalaryById(id);
        return Msg.success().add("OK", empSalary);
    }

    /**
     * 查询员工id某个员工的所有工资信息
     * @param empId
     * @return
     */
    @GetMapping( value = "/salary/preson/{empId}")
    public Msg findSalaryByEmpId(@PathVariable("empId")Integer empId) {
        List<EmpSalary> empSalaryByEmpId = salaryService.findEmpSalaryByEmpId(empId);
        return Msg.success().add("OK",empSalaryByEmpId);
    }

    // 增加
    /**
     * 增加一项工资信息
     * @param empSalary
     * @return
     */
    @PostMapping(value = "/salary/add")
    public Msg addEmpSalary(EmpSalary empSalary){
        salaryService.addEmpSalary(empSalary);
        return Msg.success();
    }


    //删除

    /**
     * 根据id查询删除某项记录
     * @param
     * @return  id
     */
    @DeleteMapping(value="/salary/delete/{id}")
    public Msg deleteEmp(@PathVariable("id")Integer id){
        salaryService.deleteEmpSalary(id);
        return Msg.success();
    }

    // 修改

    /**
     * 根据 id 修改某项工资信息
     */
    @PostMapping(value = "/salary/save/{id}")
    public Msg saveEmpSalary(@PathVariable("id") Integer id,
                             EmpSalary empSalary) {
        salaryService.saveEmpSalary(id,empSalary);
        return Msg.success();
    }

}
