package com.example.web.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.web.usertable.User;

import com.example.web.userRepositoryss.UserRepository;
import java.util.*;

import antlr.collections.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000/")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	
//	public @ResponseBody List getnames() {
//		return userRepository.findAll();	
//	}
	@GetMapping("/get")
	public java.util.List<User> getAllEmployee(){
		return userRepository.findAll();
		}
	
//	
//	@PostMapping("/add")
//	public @ResponseBody String adduser(@RequestBody User user) {
//		userRepository.save(user);
//		return "saved";
//	}
	
	@PostMapping("/add")
	public ResponseEntity<User> add(@RequestBody User user) {
		return new ResponseEntity<User>(userRepository.save(user),HttpStatus.OK);
	}
	
//	
//	@Autowired
//	 private BookRepository bookRepository;
//	        //Add a Book
//	 @PostMapping("/books")
//	 public ResponseEntity<Book> addBooks(@RequestBody Book book) {
//	  return new ResponseEntity<Book>(bookRepository.save(book), HttpStatus.OK);
//	 }
	
	

}
