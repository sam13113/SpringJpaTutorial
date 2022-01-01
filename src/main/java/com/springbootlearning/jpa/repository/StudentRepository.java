/**
 * 
 */
package com.springbootlearning.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootlearning.jpa.entity.Student;

/**
 * Repo class for {@link Student} entity
 * 
 * @author Sarat
 *
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

}
