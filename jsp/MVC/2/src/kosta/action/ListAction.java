package kosta.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.Board;
import kosta.service.BoardService;

public class ListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardService service = BoardService.getInstance();
		ActionForward forward = new ActionForward();
		
		List<Board> list = service.listBoardService();
		request.setAttribute("list", list);
		
		forward.setRedirect(false);
		forward.setPath("/view/list.jsp");
		
		return forward;
	}

}
