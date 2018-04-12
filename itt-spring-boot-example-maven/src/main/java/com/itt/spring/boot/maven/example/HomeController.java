package com.itt.spring.boot.maven.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/home", method = {RequestMethod.GET})
	public String hello() {
		return "Hello hello bol ke, tere aaju baju dol ke !!!";
	}
}
