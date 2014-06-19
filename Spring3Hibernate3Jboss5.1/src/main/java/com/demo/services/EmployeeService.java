package com.demo.services;

import java.util.List;

import com.demo.Form.EmployeeForm;
import com.demo.Form.SearchForm;
import com.demo.domain.Employee;

public interface EmployeeService {
	public void addEmployee(EmployeeForm employeeForm);

	public List<Employee> displayEmployee(EmployeeForm employeeForm);

	public List<Employee> findEmployee(SearchForm searchForm);

	public void editEmployee(EmployeeForm employeeForm);

	public EmployeeForm findEmployee(int id);

	public void deleteEmployee(int id);

	// public Employee loadEmployee(int id);

}
