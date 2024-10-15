package kosta.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.Board;
import kosta.model.Reply;
import kosta.service.BoardService;

public class DetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardService service = BoardService.getInstance();
		ActionForward forward = new ActionForward();
		
		Board board = service.detailBoardService(request);
		List<Reply> replys = service.listReplyService(request);		
		
		request.setAttribute("board", board);
		request.setAttribute("replys", replys);
		
		forward.setRedirect(false);
		forward.setPath("/view/detail.jsp");
		
		return forward;
	}

}
