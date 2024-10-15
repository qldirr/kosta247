package kosta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kosta.model.Board;
import kosta.model.BoardDao;
import kosta.model.Reply;

public class BoardService {
	private static BoardService service = new BoardService();
	private static BoardDao dao;
	
	public static BoardService getInstance() {
		dao = BoardDao.getInstance();
		return service;
	}
	
	public int insertBoardService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		Board board = new Board();
		board.setTitle(request.getParameter("title"));
		board.setWriter(request.getParameter("writer"));
		board.setContents(request.getParameter("contents"));
		
		return dao.insertBoard(board);
	}
	
	public List<Board> listBoardService(){
		return dao.listBoard();
	}
	
	public Board detailBoardService(HttpServletRequest request) {
		int seq = Integer.parseInt(request.getParameter("seq"));
		
		return dao.detailBoard(seq);
	}
	
	public int insertReplyService(HttpServletRequest request)throws Exception {
		Reply reply = new Reply();
		request.setCharacterEncoding("utf-8");
		reply.setR_title(request.getParameter("r_title"));
		reply.setR_writer(request.getParameter("r_writer"));
		reply.setR_contents(request.getParameter("r_contents"));
		reply.setSeq(Integer.parseInt(request.getParameter("seq")));
		
		return dao.insertReply(reply);
	}

}







