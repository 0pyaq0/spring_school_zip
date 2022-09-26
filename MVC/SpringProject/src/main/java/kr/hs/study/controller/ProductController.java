package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	@GetMapping("/shop")
	public String shop() {
		return "product/list";
	}
	
	@GetMapping("/product/add")
	public String add_form() {
		return "product/add_form";
	}
}
