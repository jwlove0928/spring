package com.itbank.mvcSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //해당 컨트롤러를 찾아주는 기능
public class MusicController {

	@Autowired //DI (의존성 주입)
	MusicDAO dao;
	
	@RequestMapping("inputView.do") //맵핑으로 jsp파일 경로설정
	public void insert(MusicDTO musicDTO) {
		dao.insert(musicDTO);
		System.out.println("insert 호출");
	}
	
	@RequestMapping("updateView.do")
	public void update(MusicDTO musicDTO) {
		dao.update(musicDTO);
		System.out.println("update 호출");
	}
	
	@RequestMapping("deleteView.do")
	public void delete(MusicDTO musicDTO) {
		dao.delete(musicDTO);
		System.out.println("delete 호출");
	}
	
	@RequestMapping("selectView.do")
	public void select(MusicDTO musicDTO, Model model) {
		MusicDTO dto = dao.select(musicDTO);
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("selectAllView.do")
	public void selectAll(Model model) {
		List<MusicDTO> list = dao.selectAll();
		model.addAttribute("list", list);
	}
	
}
