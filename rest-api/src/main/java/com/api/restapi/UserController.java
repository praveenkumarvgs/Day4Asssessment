package com.api.restapi;

import org.springframework.web.bind.annotation.RestController;

import com.api.restapi.entity.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
	
	@GetMapping("/users")  
    public List<User> getAllUsers(){
	
		List<User> userList= new ArrayList<>();
		User u1 = new User(1l,"Arjun","Male","CSE",8.7,"Yes","IT",25000,"GCE","No");
		User u2 = new User(2l,"Aravind","Male","CSE",8.2,"Yes","IT",20000,"GCE","No");
		User u3 = new User(3l,"Bharat","Male","CSE",8.5,"No",null,null,"GCE","No");
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		
		
		return userList;
	}
			
}
