package com.EmployeeManagement.ServiceIMPL;

import com.EmployeeManagement.Model.Employee;
import com.EmployeeManagement.Service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public Employee postEmployee(Employee e) {
        if(employeeList.isEmpty()) {
            employeeList.add(e);
            return employeeList.get(employeeList.size() - 1);
        }
        if(employeeList.stream().filter(o -> o.getId() == e.getId()).findFirst().isPresent()) {
            employeeList.stream().filter(o-> o.getId() == e.getId()).findFirst().get().setName(e.getName());
            employeeList.stream().filter(o-> o.getId() == e.getId()).findFirst().get().setGender(e.getGender());
        } else {
            employeeList.add(e);
        }
        return  employeeList.get(employeeList.size() - 1);
    }

    @Override
    public Employee getEmployee(Long id) {
        for (int i = 0; i < employeeList.size() ; i++) {
            if(employeeList.get(i).getId() == id) {
                return employeeList.get(i);
            }
        }
        return  null;
    }

    @Override
    public List<Employee> getEmployeesByGender(String gender) {
        List<Employee> listToreturn = new ArrayList<Employee>();
        System.out.println(employeeList.size() + "IAM HERE HRERE HERE");
        for (int i = 0; i < employeeList.size() ; i++) {
            if(employeeList.get(i).getGender().equals(gender)) {
                listToreturn.add(employeeList.get(i));
            }
        }
        return listToreturn;
    }
}
