package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.dto.memberDTO;
import kr.hs.study.dto.scoreDTO;
import kr.hs.study.service.memberService;

@Controller
public class TestController {
	@Autowired
	private memberService memberservice;
	
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
	public String multi(@RequestParam int number, Model model) {
		String result = "";
		for(int i=1; i<=9; i++) {
			result += number + " * " + i + " = " + (i*number) + "<br>";
		}
		model.addAttribute("result", result);
		return "result";
	}
	
	@GetMapping("/score")
	public String score() {
		return "score";
	}
	
	@GetMapping("/score_result")
	public String report(Model model, scoreDTO bean) {
		bean.setGrsum(bean.getKor()+bean.getEng()+bean.getMath());
		bean.setGravg((bean.getKor()+bean.getEng()+bean.getMath())/3);
		
		model.addAttribute("dto", bean);
		return "score_result";
	}
	
	@GetMapping("/register")
	public String login_form() {
		return "member/login_form";
	}
	
	@PostMapping("/register")
	public String register(memberDTO dto) {
		memberservice.insert(dto);
		return "member/result";
	}
	@GetMapping("member")
	public String  list(Model model){
		List<memberDTO> list=memberservice.selectAll();
		model.addAttribute("list", list);
		return "member/list";
	}
	//  tbl_member에 있는 모든 데이터 출력
	@GetMapping("member/update")
	public String update_form(Model model , @RequestParam String userid) {
		memberDTO list=memberservice.read(userid);
		model.addAttribute("list", list);
		return "/member/update_form";
	}
	
	@PostMapping("member/update_form")
	public String update(memberDTO dto) {
		memberservice.update(dto);
		return "redirect:/member";
	}
	
	@GetMapping("member/delete")
	public String delete(@RequestParam String userid) {
		memberservice.delete(userid);
		return "redirect:/member";
	}
	
	
	
	@GetMapping("/bbs")
	public String bbs() {
		return "bbs";
	}
	
	@GetMapping("/write")
	public String write() {
		return "write_form";
	}
	
}





