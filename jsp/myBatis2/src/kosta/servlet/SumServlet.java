package kosta.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SumServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		
		request.setAttribute("result", sum);
		
		RequestDispatcher re =
				request.getRequestDispatcher("/result2.jsp");
		
		re.forward(request, response);
		
	}

}










