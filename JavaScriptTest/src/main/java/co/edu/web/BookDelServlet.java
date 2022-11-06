package co.edu.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.BookDAO;


@WebServlet("/BookDelServlet")
public class BookDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BookDelServlet() {
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
		
		if(dao.delList(bookCode)) {
			response.getWriter().print("O");
		}else {
			response.getWriter().print("X");
		}
		doGet(request, response);
	}

}
