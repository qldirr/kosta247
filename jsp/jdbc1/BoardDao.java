package kosta.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDao {
	private static BoardDao dao = new BoardDao();
	
	public static BoardDao getInstance() {
		return dao;
	}
	
	//JNDI DBCP 구현
	//DataSource(Connection Pool) => jdbc/oracle(JNDI)
	public Connection getDBCPConnection() {
		DataSource ds = null;
		try {
			Context ctx = new InitialContext();
			ds =(DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
			
			return ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Board detailBoard(int seq) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Board board = new Board();
		String sql = "select * from board where seq=?";
		
		try {
			conn = getDBCPConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContents(rs.getString("contents"));
				board.setRegdate(rs.getString("regdate"));
				board.setHitcount(rs.getInt("hitcount"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {}
			}
		}
		
		return board;
	}
	
	public List<Board> listBoard(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Board> list = null;
		
		String sql  = "select * from board order by seq desc";
		
		try {
			conn = getDBCPConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList<Board>();
			
			while(rs.next()) {
				Board board = new Board();
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContents(rs.getString("contents"));
				board.setRegdate(rs.getString("regdate"));
				board.setHitcount(rs.getInt("hitcount"));
				
				list.add(board);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {}
			}
		}
		
		return list;
	}
	
	
	
	public int insertBoard(Board board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		//url, user, password
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "kosta247";
		String password = "1234";
		
		String sql = "insert into board values(board_seq.nextval, ?, ?, ?, sysdate, 0)";
		int re = -1;
		
		try {
			//1단계 : JDBC 드라이버 로딩 => 어떤 DB?
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계 : DB연결 (Connection객체 생성)
			conn = DriverManager.getConnection(url, user, password);
			//System.out.println("conn: " + conn);
			
			//3단계 : PreparedStatement 객체 생성 (SQL문 준비)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContents());
			
			//4단계 : SQL문 실행 (re => 실행된 row 개수)
			re = pstmt.executeUpdate();//insert, udpate, delete 쿼리문
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e3) {}
			}
		}
		
		return re;
		
	}
}







