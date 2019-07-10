package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class memberController {
	
	@RequestMapping("insert2")
	public void insert(MemberDTO memberDTO, MemberDAO memberDAO) {
		memberDAO.insert2(memberDTO);
	}
//	@RequestMapping("delete")
//	public void delete(MemberDTO memberDTO, MemberDAO memberDAO) {
//		memberDAO.delete(memberDTO);
//	}
}
