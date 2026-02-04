package com.learn.ems.controllers;

import com.learn.ems.entity.Employee;
import com.learn.ems.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ems")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    @GetMapping("/hello")
    public  String hello(){
        return "Jenkins Pipeline Demo!";
    }
    @PostMapping("/employee")
    public Employee newEmployee(@RequestBody Employee employee){
  return  employeeService.createEmployee(employee);
    }
  @GetMapping("/employee/{eid}")
    public Employee getEmployee(@PathVariable("eid") int eid){
        return employeeService.employeeById(eid);
    }
    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return  employeeService.employees();
    }
}
