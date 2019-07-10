package com.itbank.mvc01;

public class MemberDAO {
	
	public void insert(MemberDTO memberDTO) {
		System.out.println("DB연동해서 insert sql문 실행");
		System.out.println("저장된 id : " + memberDTO.getId());
		System.out.println("저장된 pw : " + memberDTO.getPw());
		System.out.println("저장된 tel : " + memberDTO.getTel());
		System.out.println("저장된 etc : " + memberDTO.getEtc());
	}
	
	public void insert2(MemberDTO memberDTO) {
		System.out.println("DB연동해서 insert2 sql문 실행");
		System.out.println("암호화해서 저장된 id : " + memberDTO.getId());
		System.out.println("암호화해서 저장된 pw : " + memberDTO.getPw());
		System.out.println("저장된 tel : " + memberDTO.getTel());
		System.out.println("저장된 etc : " + memberDTO.getEtc());
	}
}
