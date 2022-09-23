package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entity.EmployeeDetails;
import net.javaguides.springboot.service.EmployeeDetailsService;



@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDetailsService empservice;
	@GetMapping("/Employee")
    public List<EmployeeDetails> GetMessageFromController()
    {
        return empservice.getAllEmployee();
    }
	@GetMapping("/Employee/{id}")
    public EmployeeDetails GetMessageFromController2(@PathVariable("id") int empid)
    {
        return empservice.getEmployeeByID(empid);
    }
	@PostMapping("/Employee")
	public String GetMessageFromController3(@RequestBody EmployeeDetails emp) {
		return empservice.saveEmployee(emp);
	}
	@DeleteMapping("/Employee/{id}")
	public String GetMessageFromController4(@PathVariable("id") int empid) {
		return empservice.deleteEmployee(empid);
	}
	
}
