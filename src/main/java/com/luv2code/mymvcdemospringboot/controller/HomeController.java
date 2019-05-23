package com.luv2code.mymvcdemospringboot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.luv2code.mymvcdemospringboot.model.Employee;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public String welcome() {

		return "hello";
	}

}
