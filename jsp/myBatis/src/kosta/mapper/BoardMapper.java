package kosta.mapper;

import java.util.List;

import kosta.bean.Board;

public interface BoardMapper {
	List<Board> listBoard();
	Board detailBoard(int seq);
	int insertBoard(Board board);
	int updateBoard(Board board);
}
