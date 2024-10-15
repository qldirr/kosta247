package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.Board;
import kosta.service.BoardService;

public class DetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardService service = BoardService.getInstance();
		ActionForward forward = new ActionForward();
		
		Board board = service.detailBoardService(request);
		request.setAttribute("board", board);
		
		forward.setRedirect(false);
		forward.setPath("/view/detail.jsp");
		
		return forward;
	}

}
