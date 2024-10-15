package kosta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.action.Action;
import kosta.action.ActionForward;
import kosta.action.InsertFormAction;

@WebServlet("/board/*")
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public MyController() {
        super();
    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	//http://localhost:8081/board/insertForm.do
    	//url 식별
    	String requestURI = request.getRequestURI().trim(); //   /board/insertForm.do
    	String command =requestURI.substring(7);  //    insertForm.do
    	
    	Action action = null;
    	ActionForward forward = null;
    	
    	if(command.equals("insertForm.do")) {    		;
    		action = new InsertFormAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("insertAction.do")) {
    		
    	}
    	
    	
    	if(forward != null) {
    		if(forward.isRedirect()) {//redirect(새로운 요청) : .do
    			response.sendRedirect(forward.getPath());
    		}else {//Dispatcher(기존 요청의 연장) : .jsp
    			RequestDispatcher dispatcher =
    					request.getRequestDispatcher(forward.getPath());
    			dispatcher.forward(request, response);
    		}
    	}
    	
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}




