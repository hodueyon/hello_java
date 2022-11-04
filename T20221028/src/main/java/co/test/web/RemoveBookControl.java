package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.common.Controller;
import co.test.common.HttpUtil;
import co.test.service.BookService;

public class RemoveBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookCode = request.getParameter("code");
		
		BookService service = new BookService();
		service.removeBook(bookCode);
		
		HttpUtil.forward(request, response, "WEB-INF/result/removeOutput.jsp");

	}

}
