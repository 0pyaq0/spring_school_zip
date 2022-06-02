package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value = "/test1", method=RequestMethod.GET)
	public String test1() {
		return "result";
	}
	
	@RequestMapping(value = "/test2", method=RequestMethod.GET)
	public String test2() {
		return "result";
	}
	
	@RequestMapping(value = "/test3", method={RequestMethod.GET, RequestMethod.POST})
	public String test3() {
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4() {
		return "result";
	}
	
	@PostMapping("/test5")
	public String test5() {
		return "result";
	}
}
