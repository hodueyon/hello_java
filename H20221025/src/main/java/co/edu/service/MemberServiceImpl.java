package co.edu.service;

import java.util.List;

import co.edu.board.MemberVO;
import co.edu.dao.MemberDAO;

public class MemberServiceImpl implements MemberService {
	MemberDAO dao = new MemberDAO();

	@Override
	public MemberVO insertMember(MemberVO vo) {
		return dao.insertMember(vo);
	}

	@Override
	public List<MemberVO> pageList() {
		return null;
	}

	@Override
	public List<MemberVO> memberList() {
		return dao.memberList();
	}

	@Override
	public MemberVO login(String id, String passwd) {
		return dao.login(id, passwd);
	}

	@Override
	public MemberVO findEmail(String id) {
		return dao.findEmail(id);
	}

	@Override
	public String getRandomPw() {
		return dao.getRandomPw();
	}

	@Override
	public void memberUpdate(MemberVO vo) {
		dao.memberUpdate(vo);
	}
 
}
