package com.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.demo.Form.EmployeeForm;
import com.demo.Form.SearchForm;
import com.demo.dao.daoImpl.EmployeeDaoImpl;
import com.demo.domain.Employee;
import com.demo.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDaoImpl employeeDao;

	public void setEmployeeDao(EmployeeDaoImpl employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void addEmployee(EmployeeForm employeeForm) {

		employeeDao.addEmployee(employeeForm);
	}

	public List<Employee> findEmployee(SearchForm seachForm) {

		return employeeDao.findEmployee(seachForm);
	}

	@Override
	public List<Employee> displayEmployee(EmployeeForm employeeForm) {
		// TODO Auto-generated method stub
		return employeeDao.displayEmployee(employeeForm);
	}

	@Override
	public void editEmployee(EmployeeForm employeeForm) {
		// TODO Auto-generated method stub
		employeeDao.editEmployee(employeeForm);
	}

	public EmployeeForm findEmployee(int id) {
		return employeeDao.findEmployee(id);
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(id);
	}


}
