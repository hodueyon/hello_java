package co.edu.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.edu.member.MemberVO;
import co.edu.service.MemberDAO;

/**
 * Servlet implementation class MemberListServlet
 */
@WebServlet("/MemberListServlet")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
		response.setContentType("text/json;charset=utf-8");
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.memberList();
		
		//["id":"user1","name":"홍길동","email":"email.com","responsibility":"user"]
		// 3건, 1(0),2(1),3(2)
//		String json ="[";
//		for(int i =0; i<list.size(); i++) {
//				json += "{\"id\":\""+list.get(i).getId()
//						+"\",name\""+list.get(i).getName()
//						+"\"email\":\""+list.get(i).getEmail()
//						+"\",\"responsibility\":\""+list.get(i).getAuth()+"\"}"; 
//				if(i <list.size() - 1) {
//					json +=  ",";
//				}
//		}
//		json += "]";
		
		//위의 과정은 Gson 한방으로 가능함 -> 위의 과정도 이해 필요.
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list));
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("dopost");
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		MemberDAO dao = new MemberDAO();

		String job = request.getParameter("job");
		String id = request.getParameter("id");
		MemberVO vo = new MemberVO();
		//job => 등록, 삭제 구분.
		if(job.equals("delete")) {
			if(dao.deleteMember(id)) {
				response.getWriter().print("success");
			} else {
				response.getWriter().print("fail");
			}
		}else if(job.equals("insert")){
			String pw = request.getParameter("passwd");
			String em = request.getParameter("email");
			String nm = request.getParameter("name");
	 
			vo.setId(id);
			vo.setPasswd(pw);
			vo.setEmail(em);
			vo.setName(nm);
			
			dao.insertMember(vo);
			
			Gson gson = new GsonBuilder().create(); //gson인스턴스 호출.
			//{"id":"user1","passwd":...???}
			
			response.getWriter().print(gson.toJson(vo));
		}
		
		
		
	}

}
