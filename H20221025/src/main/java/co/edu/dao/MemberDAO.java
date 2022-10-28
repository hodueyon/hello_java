package co.edu.dao;

import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;

import co.edu.board.MemberVO;
import co.edu.common.DAO;
import oracle.sql.CHAR;

public class MemberDAO extends DAO {
	
	//회원가입
	public MemberVO insertMember(MemberVO vo) {
		conn = getConnect();
		String sql = "insert into members(id, passwd, name, email, responsibility) values(?, ?, ?, ?, 'user')";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPasswd());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getEmail());
			
			int r = psmt.executeUpdate();
			if(r>0) {
				return vo;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return null;
	}
	
	
//	public List<MemberVO> pageList(){
//		
//		
//	}
	
	
	//회원목록 출력하기 for member/memberList.jsp에서 jstl이용
	public List<MemberVO> memberList(){
		List<MemberVO> list = new ArrayList<>();
		conn = getConnect();
		String sql = "select * from members";
			
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			
			while(rs.next()){
				MemberVO vo = new MemberVO();
				
				vo.setId(rs.getString("id"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				
				list.add(vo);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	
	
	//로그인
	public MemberVO login(String id, String passwd) {
		conn = getConnect();
		String sql = "select * from members where id=? and passwd =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, passwd);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setAuth(rs.getString("responsibility"));
				
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//변경할 비밀번호 보내기위해 입력받은 아이디로 메일 주소 조회....?
	public MemberVO findEmail(String id) {
		conn = getConnect();
		String sql = "select * from members where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setAuth(rs.getString("responsibility"));
				
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return null;
	}
	
	//랜덤 비번 만들기(될진 모름)
	public String getRandomPw() {
		String newPw = RandomStringUtils.randomAlphabetic(8);
		return newPw;
	}
	
	//랜덤 비번을.. 테이블에 업데이트 해주기
	public void memberUpdate(MemberVO vo) {
		conn = getConnect();
		String sql = "update members set passwd =?, name =?, email =?, responsibility = ? where id = ?";

		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, vo.getPasswd());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getAuth());
			psmt.setString(5, vo.getId());

			int r= psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}

}
