/**
 * 
 */
package com.example.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Dell
 *
 */

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee getEmployee() {
		Optional<Employee
		> emp = employeeDao.findById(1l);
		if(emp.isPresent()) {
			return emp.get();			
		}
		return new Employee(1l);
	}
	

	public List<Employee> getAllEmployee() {
		Iterable<Employee> empList = employeeDao.findAll();
		List<Employee> result = new ArrayList<Employee>();
		empList.forEach(result::add);
		return result;
	}
	
	//@Scheduled(fixedDelayString = "1000", initialDelayString = "2000")
	public void doMeRepeately() {
		System.out.println("I am doing this work "+ (new java.util.Date()));
	}


	public Employee createOrUpdate(Employee newEmployee) {
		return employeeDao.save(newEmployee);
	}
	
	
	public static String getConcodinatedValue(String args1, String args2) {
		return EmployeeDao.getConcodinatedValue(args1, args2);
	}
	

}
