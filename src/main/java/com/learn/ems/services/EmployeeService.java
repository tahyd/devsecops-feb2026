package com.learn.ems.services;

import com.learn.ems.entity.Employee;
import com.learn.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee createEmployee(@RequestBody Employee employee) {

          Employee newEmployee = employeeRepository.save(employee);
          return newEmployee;
    }

    @Override
    public List<Employee> employees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee employeeById(int id) {

         Employee employee = employeeRepository.findById(id).get();

        return employee;    
    }
}
