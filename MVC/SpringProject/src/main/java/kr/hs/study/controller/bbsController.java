package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class bbsController {
	
	@GetMapping("/board")
	public String board() {
		return "board/bbs_index";
	}
	
	@GetMapping("/write")
	public String write() {
		return "board/write_form";
	}
	
}
