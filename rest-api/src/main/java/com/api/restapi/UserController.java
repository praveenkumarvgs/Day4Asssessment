package com.api.restapi;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.restapi.entity.Student;
import com.api.restapi.entity.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")  
    public List<Student> getAllUsers(){
	
		List<Student> userList = userRepository.findAll(); 
		
		System.out.println(userList);
		return userList;
	}
	
	@PostMapping("/users")
	public Student createUser(@RequestBody Student student) {
		Student dbUser = userRepository.save(student);
		//return null;
		return dbUser;
	}
	@PutMapping("/users/{id}")
	public Student updateUser(@RequestBody Student student, @PathVariable("id") Long id) {
		
		Student updateUserData = userRepository.getById(id);
		
		updateUserData.setName(student.getName());
		updateUserData.setGender(student.getGender());
		updateUserData.setDept(student.getDept());
		updateUserData.setCollege(student.getCollege());
		updateUserData.setCgpa(student.getCgpa());
		updateUserData.setBacklogs(student.getBacklogs());
		updateUserData.setPlaced(student.getPlaced());
		updateUserData.setIndustry(student.getIndustry());
		updateUserData.setSalary(student.getSalary());
		
		Student dbUser = userRepository.save(updateUserData);
		
		return dbUser;
	}
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable("id") Long id) {
		Student dbUser = userRepository.getById(id);
		userRepository.delete(dbUser);
		return "Student deleted successfully";
	}
			
}
