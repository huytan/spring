package com.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.Form.EmployeeForm;
import com.demo.Form.SearchForm;
import com.demo.services.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;

	/* Loading Home Page */
	@RequestMapping("/indexpage.htm")
	public String loadIndexPage() {
		return "home";
	}

	/* Loading Employee Page */
	@RequestMapping("/employeeForm.htm")
	public String loadEmployeeForm(Map model, EmployeeForm employeeForm) {
		model.put("employeeForm", employeeForm);
		return "employeePage";
	}

	/* Add new Employee */
	@RequestMapping("/displayemployee.htm")
/*	public String saveEmployee(Map model, @Valid EmployeeForm employeeForm,*/
	public String saveEmployee(Map model,  @Valid EmployeeForm employeeForm,
			BindingResult result) {
		if (result.hasErrors()) {
			return "employeePage";
		} else {
			if (employeeForm.getId() >= 0) {
				service.editEmployee(employeeForm);
			} else {
				service.addEmployee(employeeForm);
			}
			return "redirect:/display.htm";
		}
	}

	/* Display employee record */
	@RequestMapping("/display.htm")
	public String displayForm(Map model, EmployeeForm employeeForm) {
		model.put("employee", service.displayEmployee(employeeForm));

		return "displayForm";
	}

	/* Load Search Form */
	@RequestMapping("/searchemployeeform.htm")
	public String loadSearchForm(Map model, SearchForm searchForm) {
		model.put("search", searchForm);
		return "searchForm";
	}

	/* Display searched employee details */
	@RequestMapping("/searchemployee.htm")
	public String findEmployee(Map model, SearchForm searchForm) {
		model.put("employee", service.findEmployee(searchForm));
		return "displayForm";
	}
	
	/* Edit record of employee */
	@RequestMapping("/editdata.htm")
	public String searchForEdit(Map model, EmployeeForm employeeForm,
	HttpServletRequest request) {
	model.put("employeeForm", service.findEmployee(new Integer(request
	.getParameter("id"))));
	return "employeePage";
	}
	
	/* Delete Employee Record */
	@RequestMapping("/deletedata.htm")
	public String delete(Map model, HttpServletRequest request) {
	System.out.println("delete..");
	service.deleteEmployee(new Integer(request.getParameter("id")));
	return "redirect:/display.htm";
	}
}
