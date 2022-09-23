package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.entity.EmployeeDetails;

public interface EmployeeDetailsService {

	public List<EmployeeDetails> getAllEmployee();
	public EmployeeDetails getEmployeeByID(int empid);
	public String saveEmployee(EmployeeDetails emp);
	public String deleteEmployee(int  empid);
	
}
