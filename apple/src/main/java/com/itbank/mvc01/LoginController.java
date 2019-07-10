package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("loginCheck")
	public void login(@RequestParam String id, @RequestParam String pw) {
		System.out.println("입력한 id : " + id);
		System.out.println("입력한 pw : " + pw);
		System.out.println("로그인 처리 요청됨");
		System.out.println("로그인 처리 완료.");
	}
	
	@RequestMapping("loginCheck2")
	public String login2(String id, String pw) {
		String sId = "root";
		String sPw = "1234";
		if(sId.equals(id) && sPw.equals(pw)) {
			return "loginOk";
		}else {
			return "loginNot";
		}
	}
	
	@RequestMapping("memberDetail")
	public void memberDetail() {
		System.out.println("DAO의 db연동 처리");
		System.out.println("상세 정보 받아옴");
		System.out.println("views 아래로 결과를 넘김");
	}
	@RequestMapping("memberDel")
	public void memberDel() {
		System.out.println("DAO의 db연동 처리");
		System.out.println("회원 정보 삭제");
		System.out.println("views 아래로 결과를 넘김");
	}
}
