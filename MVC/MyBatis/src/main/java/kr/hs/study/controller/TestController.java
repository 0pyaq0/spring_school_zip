package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
	@GetMapping("input_data")
	public String input() {
		return "input";
	}
	
	
}
