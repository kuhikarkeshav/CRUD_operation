package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.entity.EmployeeDetails;
import net.javaguides.springboot.repository.EmployeeDetailsRepository;
@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

	@Autowired
	private EmployeeDetailsRepository emprepo;
	@Override
	public List<EmployeeDetails> getAllEmployee() {
		// TODO Auto-generated method stub
		
		return emprepo.findAll();
	}

	@Override
	public EmployeeDetails getEmployeeByID(int empid) {
		// TODO Auto-generated method stub
		return emprepo.findById(empid).get();
	}

	@Override
	public String saveEmployee(EmployeeDetails emp) {
		// TODO Auto-generated method stub
		try {
			emprepo.save(emp);
			return "saved success";
		}
		catch(Exception e){
			System.out.println("Error is" + e.getMessage());
			return "Failed";
		}
		
	}

	@Override
	public String deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		try {
			emprepo.deleteById(empid);
			return "delete success";
		}
		catch(Exception e){
			System.out.println("Error is" + e.getMessage());
			return "delete Failed";
		}
	}

	

}
