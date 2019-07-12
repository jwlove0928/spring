package com.itbank.spring01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsDeleteController {

	@Autowired
	BbsDAO bbsdao;
	
	@RequestMapping("delete")
	public void delete(BbsDTO bbsDTO) throws Exception {
		bbsdao.delete(bbsDTO);
	}
}
