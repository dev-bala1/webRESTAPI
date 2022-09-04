package com.example.web.SignupRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.signupuser.Signup;

public interface Signupinterface extends JpaRepository<Signup, Long>{

}
