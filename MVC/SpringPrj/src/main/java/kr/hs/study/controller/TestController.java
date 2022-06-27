package kr.hs.study.controller;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	//1. 1부터 10까지의 합
	@GetMapping
	public void result() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		System.out.println("단을 입력하시오 : " + dan);
	}
}
