package com.studentmanagement.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagement.beans.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	Optional<Student> findByEmail(String email);

}
