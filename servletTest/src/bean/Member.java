package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class Member extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Member() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String saveId = "root";
		String savePw = "1234";
		
		response.setContentType("text/html; charset=utf8");
		PrintWriter out = response.getWriter();
		
		if(saveId.equals(id) && savePw.equals(pw)) {
			out.println("<h1>로그인 OK</h1>");
		}else {
			out.println("<h1>로그인 NOT</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
