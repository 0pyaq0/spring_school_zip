package kr.hs.study.controller;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.dto.DataBean;

@Controller
public class TestController {
	
	@GetMapping("/sum")
	public String sum(Model model) {
		int result = 0;
		for(int i=1; i<=10; i++) {
			result += i;
		}
		model.addAttribute("sum", result);
		return "sum";
	}
	
	@GetMapping("/multi_table")
	public String multiTable() {
		return "multi_table";
	}
	
	@GetMapping("/multi")
	public String multi(@RequestParam int number) {
		for(int i=1; i<=9; i++) {
			System.out.println(i + " * " + number + " = " + (i*number));
		}
		return "result";
	}
	
	@GetMapping("/grade")
	public String grade() {
		return "grade";
	}
	
	@GetMapping("/report")
	public String report(Model model, DataBean bean) {
		bean.setGrsum(bean.getKor()+bean.getEng()+bean.getMath());
		bean.setGravg((bean.getKor()+bean.getEng()+bean.getMath())/3);
		
		model.addAttribute("dto", bean);
		return "report";
	}
}
