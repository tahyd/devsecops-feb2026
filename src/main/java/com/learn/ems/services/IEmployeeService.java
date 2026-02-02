package com.learn.ems.services;

import com.learn.ems.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    public Employee createEmployee(Employee employee);
    public List<Employee> employees();
    public  Employee  employeeById(int id);

}
