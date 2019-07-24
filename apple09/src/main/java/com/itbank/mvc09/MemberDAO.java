package com.itbank.mvc09;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component 는 Service와 Repository의 부모(상속관계)
//@Service
@Repository //DB용 bean?
public class MemberDAO {

	@Autowired
	SqlSessionTemplate myBatis; //이름이 아닌 타입으로 값을 찾는다 ex) SqlSessionTemplate
	
	public void insert(MemberDTO memberDTO) {
		myBatis.insert("mDAO.insert", memberDTO);
		System.out.println("myBatis 호출");
	}
	
	public void delete(MemberDTO memberDTO) {
		myBatis.delete("mDAO.delete", memberDTO);
	}
	
	public void update(MemberDTO memberDTO) {
		myBatis.update("mDAO.update", memberDTO);
	}
	
	public MemberDTO select(MemberDTO memberDTO) {
		return myBatis.selectOne("mDAO.select", memberDTO);
	}
	
	public List<MemberDTO> selectAll(){
		return myBatis.selectList("mDAO.selectAll");
	}
}
