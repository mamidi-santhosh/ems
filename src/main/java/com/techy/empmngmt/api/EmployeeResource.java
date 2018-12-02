package com.techy.empmngmt.api;

import com.techy.empmngmt.model.Employee;
import com.techy.empmngmt.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeResource {

    @Autowired
    public EmployeeService employeeService;

    @PostMapping(value="addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping(value = "/{empId}")
    public Employee getEmployee(@PathVariable("empId") int empId) {
        return employeeService.getEmployee(empId);
    }

    @PutMapping(value = "/{empId}")
    public Employee updateEmployee(@PathVariable("empId") int empId, @RequestBody Employee employee) {
        return employeeService.updateEmployee(empId, employee);
    }

    @DeleteMapping(value = "/{empId}")
    public void deleteEmployee(@PathVariable("empId") int empId) {
        employeeService.deleteEmployee(empId);
    }
}
