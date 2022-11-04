package co.edu.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.book.BookVO;
import co.edu.common.BookDAO;


@WebServlet("/BookAddServlet")
public class BookAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public BookAddServlet() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		BookDAO dao = new BookDAO();
		String bookCode = request.getParameter("bookCode");
		String bookName = request.getParameter("bookName");
		String author = request.getParameter("author");
		String press = request.getParameter("press");
		int price = Integer.parseInt(request.getParameter("price"));
		
		BookVO vo = new BookVO();
		vo.setBookCode(bookCode);
		vo.setBookName(bookName);
		vo.setAuthor(author);
		vo.setPress(press);
		vo.setPrice(price);
		
		dao.inputList(vo);
		
	}

}
