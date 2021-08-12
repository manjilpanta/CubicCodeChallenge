package com.EmployeeManagement.Controller;

import com.EmployeeManagement.Model.Employee;
import com.EmployeeManagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/employee")
@ComponentScan
public class EmployeeController {
    @Autowired
    EmployeeService es;

// POST EMPLOYEE
    @PostMapping
    public Employee postEmplployee(@RequestBody Employee em) {
        return  es.postEmployee(em);
    }

// GET EMPLOYEE
    @GetMapping("/{id}")
    public Employee getEmplployee(@PathVariable(name = "id") Long id) throws Exception {
        return es.getEmployee(id);
    }

// FILTER EMPLOYEE BY GENDER
    @GetMapping("/getEmployeesByGender")
    public List<Employee> getEmplployeeByGender(@PathParam(value = "gender") String gender) throws Exception {
        return es.getEmployeesByGender(gender);
    }
}
