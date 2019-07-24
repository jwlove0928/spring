package com.itbank.mvc09;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberSelectController {

	@Autowired
	//@Qualifier("dao1") //Autowired로 객체타입을 기준으로 검색했을때 dao가 두개일 경우 Qualifier를 이용해 이름을 가지고 다시검색
	MemberDAO dao;
	
	@RequestMapping("select.do")
	public void select(Model model, MemberDTO memberDTO) {
		MemberDTO dto = dao.select(memberDTO);
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("selectAll.do")
	public void selectAll(Model model) {
		List<MemberDTO> list = dao.selectAll();
		model.addAttribute("list", list);
	}
}
