package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.client.support.HttpAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3(HttpServletRequest request) {
		request.setAttribute("data1", 300);
		request.setAttribute("data2", 400);
		return "test3";
	}
}
