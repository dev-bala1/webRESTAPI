package com.example.web.sigupController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.web.SignupRepository.Signupinterface;
import com.example.web.signupuser.Signup;


@RestController
@RequestMapping("user")
@CrossOrigin(origins = "http://localhost:3000/")
public class SigupController {
     
	@Autowired
	private Signupinterface signupinterface;
	
	@GetMapping("getusers")
	public java.util.List<Signup> printall(){
		return signupinterface.findAll();
	}
	@PostMapping("/signup")
	public ResponseEntity<Signup> signin(@RequestBody Signup sign) {
		return new ResponseEntity<Signup>(signupinterface.save(sign),HttpStatus.OK);
	}

//	@PostMapping("/add")
//	public ResponseEntity<User> add(@RequestBody User user) {
//		return new ResponseEntity<User>(userRepository.save(user),HttpStatus.OK);
//	}
//	

	
}
