package co.edu.common;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.book.BookVO;

public class BookDAO extends DAO {
	public List<BookVO> bookList() {
		List<BookVO> list = new ArrayList<>();
		BookVO vo = new BookVO();
		
		conn=getConnect();
		String sql = "select * from tbl_book";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				vo.setBookCode(rs.getString("book_code"));
				vo.setBookName(rs.getString("book_name"));
				vo.setAuthor(rs.getString("author"));
				vo.setPress(rs.getString("press"));
				vo.setPrice(rs.getInt("price"));
				
				list.add(vo);
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}//end bookList
	
	public void inputList(BookVO vo) {
		conn = getConnect();
		
		String sql = "insert into tbl_book(book_code, book_name, author, press, price) values(?, ?, ?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBookCode());
			psmt.setString(2, vo.getBookName());
			psmt.setString(3, vo.getAuthor());
			psmt.setString(4, vo.getPress());
			psmt.setInt(5, vo.getPrice());
			
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
			
	}// end inputList;
	
	//한건 삭제
	public void delList(String bookCode) {
		conn = getConnect();
		String sql = "delete from tbl_book where book_code =?";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, bookCode);
			
			psmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			disconnect();
		}

	}
}
