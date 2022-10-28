package co.edu.service;

import java.util.List;

import co.edu.board.MemberVO;

public interface MemberService {
	public MemberVO insertMember(MemberVO vo);
	public List<MemberVO> pageList();
	public List<MemberVO> memberList();
	public MemberVO login(String id, String passwd);
	public MemberVO findEmail(String id);
	public String getRandomPw();
	public void memberUpdate(MemberVO vo);
	
}
