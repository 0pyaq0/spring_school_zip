package kr.hs.study.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.Databean;
import kr.hs.study.service.serviceInterface;
import kr.hs.study.service.serviceImpl;

@Controller
public class TestController {
	@Autowired
	private serviceInterface service;
	
	@GetMapping("/input_data")
	public String input() {
		return "input";
	}
	
	@GetMapping("/read_data")
	public String read_data(Model model) {
		List<Databean> list = service.select();
		model.addAttribute("list", list);
		return "result2";
	}
	
	@GetMapping("/update_data")
	public String update() {
		return "update";
	}
	
	@PostMapping("/re_input")
	public String re_input(Databean bean) { // ModelAttribute 사용, 생략가능.
		service.insert(bean);
		return "result";
	}
	
	@PostMapping("/re_update")
	public String re_update(Databean bean) {
		service.update(bean);
		return "result";
	}
	
	
}
