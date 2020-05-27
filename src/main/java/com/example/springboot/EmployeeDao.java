 /**
 * 
 */
package com.example.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dell
 *
 */
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {
	
	public static String getConcodinatedValue(String args1, String args2) {
		return args1 + args2;
	}

}
