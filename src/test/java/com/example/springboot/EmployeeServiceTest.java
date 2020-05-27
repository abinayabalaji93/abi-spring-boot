/**
 * 
 */
package com.example.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author Dell
 *
 */
@SpringBootTest
public class EmployeeServiceTest {
	
	@Mock
	EmployeeDao employeeDao;
	
	@InjectMocks
    private EmployeeService employeeService = new EmployeeService();
	
	@Test
	public void testgetEmployee() {	
		Employee employeeExpected = new Employee();
		when(employeeDao.findById(anyLong())).thenReturn(Optional.of(employeeExpected));		
		Employee employeeActual =employeeService.getEmployee();		
		assertEquals(employeeExpected, employeeActual);		
	}
	
	
	@Test
	public void testgetAllEmployee() {	
		List employeeExpected = new ArrayList<>();
		List employeeDaoReturn = new ArrayList<>();
		employeeDaoReturn.add(new Employee());
		employeeExpected.add(new Employee());		
		when(employeeDao.findAll()).thenReturn(employeeDaoReturn);
		
		List employeeActual =employeeService.getAllEmployee();		
		assertEquals(employeeExpected, employeeActual);		
	}
	
	@Test
	public void testgetConcodinatedValue() {
		
		String output = employeeService.getConcodinatedValue("Mohan", "Kumar");
		
		System.out.println(output);
	}

}
