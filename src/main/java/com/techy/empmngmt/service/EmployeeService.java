package com.techy.empmngmt.service;


import com.techy.empmngmt.dao.EmployeeDAO;
import com.techy.empmngmt.exception.EmployeeNotFoundException;
import com.techy.empmngmt.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeService {

    @Autowired
    public EmployeeDAO employeeDAO;


    public Employee addEmployee(Employee employee) {
        return employeeDAO.save(employee);
    }

    public List<Employee> getEmployees() {
        return employeeDAO.findAll();
    }

    public Employee getEmployee(int empId) {

        Optional<Employee> optionalEmployee = employeeDAO.findById(empId);

        if(!optionalEmployee.isPresent())
            throw new EmployeeNotFoundException("Employee Record is not available...");

       return optionalEmployee.get();
    }

    public Employee updateEmployee(int empId, Employee employee) {
        employee.setEmpId(empId);
        return employeeDAO.save(employee);
    }

    public void deleteEmployee(int empId) {
        employeeDAO.deleteById(empId);
    }

}
