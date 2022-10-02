package com.api.restapi.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.restapi.entity.Student;

@Repository
public interface UserRepository extends JpaRepository<Student, Long> {
	
	Student findByName(String name);

}
