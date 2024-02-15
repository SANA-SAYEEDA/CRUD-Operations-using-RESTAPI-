package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/data")
public class CrudController {
	
	@PostMapping("/per")
	public String postData(@RequestParam String name,@RequestParam double num1, @RequestParam double  num2, @RequestParam double  num3, @RequestParam double num4) {
		double percentage=((num1+num2+num3+num4)/4);
		return ("Hey "+name+", your percentage is "+percentage+"%");
	}

}
