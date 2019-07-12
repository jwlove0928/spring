package com.itbank.spring01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsUpdateController {

	@Autowired
	BbsDAO dao;
	
	@RequestMapping("update")
	public void update(BbsDTO bbsDTO) throws Exception {
		dao.update(bbsDTO);
	}
}
