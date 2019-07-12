package com.itbank.spring01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO bbsDao;
	
	@RequestMapping("bbsInsert")
	public void insert(BbsDTO bbsDTO) {
		try {
			bbsDao.insert(bbsDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
