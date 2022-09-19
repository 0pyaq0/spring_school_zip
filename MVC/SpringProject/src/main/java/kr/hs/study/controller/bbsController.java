package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("select")
	public String select(Model model){
		List<boardDTO> list=boardservice.selectAll();
		model.addAttribute("list", list);
		return "board/board_list";
	}
	
	@GetMapping("select/update")
	public String update_form(Model model) {
		list.setHit(list.getHit() + 1);
		model.addAttribute("list", list);
		return "board/update_form";
	}
	
	@PostMapping("select/board_update")
	public String update(boardDTO dto, @RequestParam int idx) {
		dto.setIdx(idx);
		boardservice.update(dto);
		return "redirect:/select";
	}
	
	@GetMapping("select/delete")
	public String delete(@RequestParam int idx) {
		boardservice.delete(idx);
		return "redirect:/select";
	}
}