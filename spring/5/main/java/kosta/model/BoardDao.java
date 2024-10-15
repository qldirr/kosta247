package kosta.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kosta.mapper.BoardMapper;

@Repository
public class BoardDao {
	
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	
	public void insert(Board board) {
		sqlTemplate.getMapper(BoardMapper.class).insertBoard(board);
	}

}
