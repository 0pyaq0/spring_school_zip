package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	// GET 방식으로 /로 접속했을 때 아래 home() 함수를 실행하라
	public String home() {
		System.out.println("home");
		return "index";
	}
	
	// GET 방식으로 /test 로 접속했을 때 콘솔에 test 출력, context path(root)
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public String test() {
//		System.out.println("test");
//		return null;
//	}
	
}
