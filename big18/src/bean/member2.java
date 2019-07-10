package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class member2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String admin;
	
    public member2() {
    }

	public void init(ServletConfig config) throws ServletException {
		
		admin = config.getInitParameter("admin");
		
		System.out.println(" 서블릿 시작 admin id = " + admin);
	}

	public void destroy() {
		super.destroy();
		System.out.println("서블릿 종료");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		response.setContentType("text/html; charset=utf8");
		PrintWriter out = response.getWriter();
		
		out.println("<p> 가입된 아이디는" + id + " 입니다.<p>");
		out.println("<p> 가입된 비밀번호는" + pw + " 입니다.<p>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
