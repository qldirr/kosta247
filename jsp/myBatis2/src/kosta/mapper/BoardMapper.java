package kosta.mapper;

import java.util.List;
import java.util.Map;

import kosta.bean.Board;
import kosta.bean.Search;

public interface BoardMapper {
	List<Board> listBoard(Map map);
	Board detailBoard(int seq);
	int insertBoard(Board board);
	int updateBoard(Board board);
}
