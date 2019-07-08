package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/day.do")
public class MyDay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyDay() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String date = request.getParameter("date");
		String title = request.getParameter("title");
		
		response.setContentType("text/html; charset=utf8");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title></title></head>");
		out.println("<body>");
		out.println("<div style=color:blue;>===============</div>");
		out.println("<p style=color:red;> 오늘은 " + date + " 입니다." + "</h2>");
		out.println("<p style=color:red;> 오늘 나는 " + title + " 을 배우는 중입니다." + "</h2>");
		out.println("<div style=color:blue;>===============</div>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
