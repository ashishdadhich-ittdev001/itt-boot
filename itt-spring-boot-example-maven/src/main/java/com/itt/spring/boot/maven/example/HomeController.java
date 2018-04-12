package com.itt.spring.boot.maven.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/home")
	public String hello() {
		return "Hello hello bol ke, tere aaju baju dol ke !!!";
	}
}
