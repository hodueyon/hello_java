package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.board.MemberVO;
import co.edu.common.Control;
import co.edu.common.HttpUtil;
import co.edu.control.MailApp;
import co.edu.service.MemberService;
import co.edu.service.MemberServiceImpl;

public class passwdReConfirm implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		//메일주소 겟
		MemberService service = new MemberServiceImpl();
		MemberVO result = service.findEmail(id);
		
		//그 메일주소
		String email = result.getEmail();
		 
		//새비번 만들기
		
		String newPw = service.getRandomPw();
		String content = "새 비밀번호: "+newPw;
		
		//members테이블에 새비번 업데이트
		result.setPasswd(newPw);
		service.memberUpdate(result);
		
		//메일보내기
		MailApp app = new MailApp();
		app.sendMail("aeegina@naver.com", email , "새 비밀번호 입니다.",content);
		
		HttpUtil.forward(req, resp, "template/home.tiles");
	}

}
