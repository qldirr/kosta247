package kosta.mapper;

import java.util.List;
import kosta.model.Board;

public interface BoardMapper {
	int insertBoard(Board board);
	List<Board> listBoard();
	Board detailBoard(int seq);
}
