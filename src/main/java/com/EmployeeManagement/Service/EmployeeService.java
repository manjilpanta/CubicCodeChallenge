package com.EmployeeManagement.Service;

import com.EmployeeManagement.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Employee postEmployee(Employee e);
    Employee getEmployee(Long id) throws Exception;
    List<Employee> getEmployeesByGender(String gender);
}
