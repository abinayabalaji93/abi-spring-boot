package com.example.springboot;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String initial(HttpServletRequest request, HttpServletResponse response) {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/name")
	public Employee name(HttpServletRequest request, HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(" Request Arrived "+(new Date()));
		return employeeService.getEmployee();
	}
	@PostMapping("/employees")
	public Employee createOrSaveEmployee(@RequestBody Employee newEmployee) {
        return employeeService.createOrUpdate(newEmployee);
    }
 
	@PutMapping("/employees/{id}")
    public Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
         return employeeService.createOrUpdate(newEmployee);
    }
	
 

}
