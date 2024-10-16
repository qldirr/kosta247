package kosta.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter({"/session/main.jsp", "/session/logout.jsp"})
public class LoginFilter implements Filter {

    public LoginFilter() {}

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//session객체 구하기 => session 체크
		HttpServletRequest request2 = (HttpServletRequest)request;
		HttpServletResponse response2 = (HttpServletResponse)response;
		HttpSession session = request2.getSession();
		
		String name = (String)session.getAttribute("name");
		if(name == null) {
			response2.sendRedirect("loginForm.jsp");
		}
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {}

}






