package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.boardDTO;
import kr.hs.study.service.boardService;

@Controller
public class bbsController {
	
	@Autowired
	boardService boardservice;
	
	@GetMapping("/board")
	public String board() {
		return "board/bbs_index";
	}
	
	@GetMapping("/write")
	public String write_form() {
		return "board/write_form";
	}
	
	@PostMapping("/board_register")
	public String board_register(boardDTO dto) {
		boardservice.insert(dto);
		return "redirect:/select";
	}
	
	@GetMapping("/select")
	public String select(Model model){
		List<boardDTO> list=boardservice.selectAll();
		model.addAttribute("list", list);
		return "board/board_list";
	}
}
