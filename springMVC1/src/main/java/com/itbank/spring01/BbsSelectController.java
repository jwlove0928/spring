package com.itbank.spring01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsSelectController {
	
	@Autowired
	BbsDAO dao;

	@RequestMapping("select")
	public String select(Model model,BbsDTO bbsDTO) throws Exception {
		
		BbsDTO dto2 = dao.select(bbsDTO);
		
		model.addAttribute("bbsDTO", dto2);
		if(dto2 == null) {
			return "selectFailed";
		}else {
			return "select";
		}
	}
}
