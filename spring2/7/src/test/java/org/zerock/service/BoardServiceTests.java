package org.zerock.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapperTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	@Autowired
	private BoardService service;

//	@Test
//	public void testRegister() {
//		BoardVO board = new BoardVO();
//		board.setTitle("Spring");
//		board.setContent("잘 하자");
//		board.setWriter("user01");
//		
//		service.register(board);
//		
//		log.info("생성된 글번호: " + board.getBno());
//	}
	
//	@Test
//	public void testGet() {
//		log.info(service.get(1L));
//	}

//	@Test
//	public void testUpdate() {
//		BoardVO board = service.get(1L);
//		
//		if(board == null) {
//			return;
//		}
//		
//		board.setTitle("제목을 수정했음");
//		log.info("modify result: " + service.modify(board));
//	}
	
//	@Test
//	public void testDelete() {
//		log.info("remove result: " + service.remove(2L));
//	}
	
//	@Test
//	public void testGetList() {
//		service.getList().forEach(board -> log.info(board));
//	}
	
	@Test
	public void testGetList() {
		service.getList(new Criteria(2, 10)).forEach(board -> log.info(board));
	}
}












