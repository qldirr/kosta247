package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.service.BoardService;

public class InsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardService service = BoardService.getInstance();
		ActionForward forward = new ActionForward();
		
		//비지니스 호출
		service.insertBoardService(request);
		
		//페이지 이동 : 1)insertAction.jsp  2)list.jsp  3) 기타(listAction.do)
		forward.setRedirect(true);
		forward.setPath("/board/listAction.do");
		
		return forward;
	}

}
