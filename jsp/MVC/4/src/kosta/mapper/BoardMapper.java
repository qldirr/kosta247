package kosta.mapper;

import java.util.List;

import kosta.model.Board;
import kosta.model.Reply;

public interface BoardMapper {
	int insertBoard(Board board);
	List<Board> listBoard();
	Board detailBoard(int seq);
	int insertReply(Reply reply);
	List<Reply> listReply(int seq);
}
