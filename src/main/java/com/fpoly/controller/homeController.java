package com.fpoly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
	@GetMapping("/index")
	public String index() {
		return "index";
	}
}
