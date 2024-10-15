package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//board/insert_form.jsp 이동
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/view/insert_form.jsp");
		
		return forward;
	}

}
