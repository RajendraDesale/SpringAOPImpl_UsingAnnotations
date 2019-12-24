package com.example.DAO;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeManager{

	public Employee getEmployeeById(Integer employeeId);
	 
    public List<Employee> getAllEmployee();
 
    public void createEmployee(Employee employee);
 
    public void deleteEmployee(Integer employeeId);
 
    public void updateEmployee(Employee employee);
}
