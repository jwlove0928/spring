package com.itbank.mvcSpring;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MusicDAO {

	@Autowired
	SqlSessionTemplate music;
	
	public void insert(MusicDTO musicDTO) {
		music.insert("mDAO.insert", musicDTO);
		System.out.println("myBatis 호출");
	}
	
	public void update(MusicDTO musicDTO) {
		music.update("mDAO.update", musicDTO);
		System.out.println("myBatis 호출");
	}
	
	public void delete(MusicDTO musicDTO) {
		music.delete("mDAO.delete", musicDTO);
		System.out.println("myBatis 호출");
	}
	
	public MusicDTO select(MusicDTO musicDTO) {
		return music.selectOne("mDAO.select", musicDTO);
	}
	
	public List<MusicDTO> selectAll(){
		return music.selectList("mDAO.selectAll");
	}
	
}
