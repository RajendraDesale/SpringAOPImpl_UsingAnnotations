package com.example.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.DAO.EmployeeManager;
import com.example.model.Employee;

public class EmployeeController {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//ApplicationContext appCtx = ApplicationContextUtils.getApplicationContext();
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("com/example/util/ApplicationContext.xml");

		EmployeeManager manager = (EmployeeManager) appCtx.getBean("employeeManager");

		manager.getEmployeeById(1);
		manager.createEmployee(new Employee());
		manager.deleteEmployee(100);
	}
}
