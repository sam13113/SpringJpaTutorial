/**
 * 
 */
package com.springbootlearning.jpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springbootlearning.jpa.entity.Student;

/**
 * @author Sarat
 *
 */
@SpringBootTest
public class TestStudentRepository {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testInsertStudentEntry() {
		Student student = Student.builder().firstName("Sam").lastName("Witwicky").email("sam@hotmail.com").build(); 
		
		studentRepository.save(student);
	}
	
	@Test
	public void testFindStudentById() {
		
		Student student = studentRepository.findById(1L).get();
		
		System.out.println("Student = "+student);
	}

}
