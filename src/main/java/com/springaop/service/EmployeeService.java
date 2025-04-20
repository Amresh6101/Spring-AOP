package com.springaop.service;

import com.springaop.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author Amresh Ranjan
 */
@Service
public class EmployeeService {
    private List<Employee> employeeList=new ArrayList<>();

    public List<Employee> getAllEmployees(){
        System.out.println("Method getAllEmployees() called");
        return employeeList;
    }

    public Employee getEmployeeById(Long employeeId){
        System.out.println("Method getEmployeeById() called");
        for(Employee employee: employeeList){
            if(employee.getId()==Long.valueOf(employeeId)) {
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee){
        System.out.println("Method addEmployee() called");
        employeeList.add(employee);
    }

    public void updateEmployee(Employee employeeDetails){
        System.out.println("Method updateEmployee() called");
        for(Employee employee: employeeList){
            if(employee.getId()==Long.valueOf(employeeDetails.getId())){
                employeeList.remove(employee);
                employeeList.add(employeeDetails);
            }
        }
    }
    public void deleteEmployee(Long employeeId){
        System.out.println("Method deleteEmployee() called");
        for(Employee employee: employeeList){
            if(employee.getId()==Long.valueOf(employeeId)){
                employeeList.remove(employeeId);
            }
        }
    }
}
