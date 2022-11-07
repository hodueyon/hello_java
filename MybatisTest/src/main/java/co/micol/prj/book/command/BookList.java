package co.micol.prj.book.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.book.service.BookService;
import co.micol.prj.book.service.impl.BookServiceImpl;
import co.micol.prj.book.vo.BookVO;
import co.micol.prj.common.Command;

public class BookList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 책목록 가져오기
		BookService dao = new BookServiceImpl();
		// interface는 자기자신을 초기화하지 못하기때문에 BookServiceImpl이라는 구현체로 초기화 하는거
		List<BookVO> books = new ArrayList<>(); 
		books = dao.bookSelectList(); //전체목록
		request.setAttribute("books", books); //결과를 request 객체에 books란 이름으로 list 형태로 담음
		
		return "book/bookList";
	}

}