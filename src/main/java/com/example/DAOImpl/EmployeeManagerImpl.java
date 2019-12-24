package com.example.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import com.example.DAO.EmployeeManager;
import com.example.model.Employee;

public class EmployeeManagerImpl implements EmployeeManager {

	public Employee getEmployeeById(Integer employeeId) {
		System.out.println("Method getEmployeeById() called");
		return new Employee();
	}

	public List<Employee> getAllEmployee() {
		System.out.println("Method getAllEmployee() called");
		return new ArrayList<Employee>();
	}

	public void createEmployee(Employee employee) {
		System.out.println("Method createEmployee() called");
		throw new NullPointerException("ID not found");
	}

	public void deleteEmployee(Integer employeeId) {
		System.out.println("Method deleteEmployee() called");
	}

	public void updateEmployee(Employee employee) {
		System.out.println("Method updateEmployee() called");
	}
}