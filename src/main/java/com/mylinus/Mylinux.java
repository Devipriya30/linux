package com.mylinus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Mylinux {
	@GetMapping(value="/sendhi")
	public String hi() {
		return "mylinux is created";
	}

}
