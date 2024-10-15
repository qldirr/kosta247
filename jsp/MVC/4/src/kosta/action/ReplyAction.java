package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.service.BoardService;

public class ReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardService service = BoardService.getInstance();
		ActionForward forward = new ActionForward();
		
		service.insertReplyService(request);
		forward.setRedirect(true);
		forward.setPath("/board/detailAction.do?seq="+request.getParameter("seq"));
		
		return forward;
	}

}
