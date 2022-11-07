package co.micol.prj.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.book.command.BookList;
import co.micol.prj.common.Command;
import co.micol.prj.main.MainCommand;

/**
 * 모든 요청을 받아들이는 컨트롤러
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//명령을 저장할 map Collection, HashMap - key값과 value값으로 이루어짐
    private HashMap<String, Command> map = new HashMap<String, Command>();
    public FrontController() {
        super();
    }

	//요청한 것을 실행하는 명령을 모아두는 곳
	public void init(ServletConfig config) throws ServletException{
		map.put("/main.do", new MainCommand()); //처음 보여줄 페이지 명령 //main.do가 들어오면 MainCommand 호출시킴
		map.put("/bookList.do", new BookList());
	}

	//요청을 분석하고 실행, 결과를 돌려주는 곳
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //한글 깨짐 방짐
		String uri = request.getRequestURI(); //요청한 uri를 구함.
		String contextPath = request.getContextPath(); //루트를 구함., context path구함 
		String page = uri.substring(contextPath.length()); //실제수행할 요청을 구함 , uri에서 context 뒤부분 잘라오느거
		
		Command command = map.get(page); //init 메소드에서 수행할 명령을 가져온다.(넣을때는 put)		
//		== Command command = new MainCommand(); 초기화
		
		String viewPage = command.exec(request, response); //명령을 수행하고 결과를 돌려받음.
		//viewPage - 보여줄 페이지
		
		//viewResolve 파트
		if(!viewPage.endsWith(".do") && viewPage != null) {
			//리턴되는 문자열에서 .do가 포함되어있지 않다면
			//ajax처리 startswith(ajax)
			//tiles 돌아가는곳..endswith(.tiles)이런식으로 추가하면 될듯함.
			viewPage = "/WEB-INF/views/"+ viewPage +".jsp"; //web-inf/view/에서 viewPage.jsp를 찾게끔
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request,response);
		} else {
			response.sendRedirect(viewPage); //*.do로 들어올때 돌아가는 곳
		}
		
		
	}
}
