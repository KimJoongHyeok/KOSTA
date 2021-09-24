package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextTest1
 */
public class ContextTest1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public ContextTest1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8"); // 응답시 한글처리를 위해 charset utf-8을 지정
		PrintWriter out = response.getWriter();
		String name = getServletConfig().getServletName();
		out.println("<h3>" + name + " 에서 ServletContext를 테스트 </h3>");
		String info = getServletConfig().getServletContext().getInitParameter("security");
		out.println("ServletContext로부터 정보를 가져옴 : " + info);
		out.close();
	}
}
