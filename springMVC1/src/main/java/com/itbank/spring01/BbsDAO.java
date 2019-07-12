package com.itbank.spring01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	DBConnectionMgr dbcp;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	//기본 생성자
	//생성자: 객체 생성시 자동 호출되는 메소드
	//객체생성시 꼭 해주어야하는 초기화 과정
	public BbsDAO() {
		dbcp = DBConnectionMgr.getInstance();
	}
	
	public void insert(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();

		//3. SQL문 객체화
		String sql = "insert into bbs values (?,?,?,?)";
		ps = con.prepareStatement(sql);

		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getWriter());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
	}
	
	public void delete(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();
		
		//3. SQL문 객체화
		String sql = "delete from bbs where id=?";
		ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getId());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
	}
	
	public BbsDTO select(BbsDTO dto) throws Exception {
		
		con = dbcp.getConnection();
		
		String sql = "select * from bbs where id=?";
		ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getId());
		
		ResultSet rs = ps.executeQuery();
		
		BbsDTO dto2 = null;
		while(rs.next()) {
			dto2 = new BbsDTO();
			dto2.setId(rs.getString(1));
			dto2.setTitle(rs.getString(2));
			dto2.setContent(rs.getString(3));
			dto2.setWriter(rs.getString(4));
		}
		return dto2;
	}
	
	public void update(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();
		
		//3. SQL문 객체화
		String sql = "update bbs set title =? where id = ?";
		ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getTitle());
		ps.setString(2, dto.getId());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
	}
}
