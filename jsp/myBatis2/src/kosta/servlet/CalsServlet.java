package kosta.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalsServlet")
public class CalsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CalsServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		String name = request.getParameter("name");
		
		int result = num1 + num2;
		
		request.setAttribute("result", result);
		request.setAttribute("name", name);
		
		//1. Redirect : 기존 요청과 다른 새로운 요청
		//response.sendRedirect("result.jsp");
		
		//2. Dispatcher : 기존의 요청의 연장선
		RequestDispatcher re =
				request.getRequestDispatcher("/result.jsp");
		re.forward(request, response);
	}

}










