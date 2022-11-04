package co.edu.service;

import java.sql.SQLException;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.edu.common.DAO;
import co.edu.member.MemberVO;
import co.edu.member.ScheduleVO;

public class MemberDAO extends DAO{
	//스케줄 등록
	public void inputSchedule(ScheduleVO vo) {
		conn = getConnect();
		
		String sql = "insert into full_calandar(title, start_date,end_date)\r\n"
				+ "values(?, ?, ?)";
		
		try {
			psmt= conn.prepareStatement(sql);
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getStart());
			psmt.setString(3, vo.getEnd());
			
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
	//스케줄삭제
	public void delSchedule() {
		conn = getConnect();
		
		String sql = "delete from full_calandar where start_date =?";
	}
	//전체스케쥴목록
	public List<ScheduleVO> scheduleList(){
		conn = getConnect();
		List<ScheduleVO> list = new ArrayList<>();
		
		String sql = "select * from full_calandar";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				ScheduleVO vo = new ScheduleVO();
				vo.setTitle(rs.getString("title"));
				vo.setStart(rs.getString("start_date"));
				vo.setEnd(rs.getString("end_date"));
				list.add(vo);
				
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	
	//부서명, 부서인원 .
	public Map<String, Integer> getEmpByDept(){
		conn = getConnect();
		Map<String, Integer> map = new HashMap<>();
		String sql = "select d.department_name, count(1) "
					+ " from hr.employees e "
					+ " join hr.departments d "
					+ " on e.department_id = d.department_id "
					+ "group by d.department_name";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs=psmt.executeQuery();
			while(rs.next()) {
				map.put(rs.getString(1), rs.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return map;
	}
	
	//한건 삭제
	public boolean deleteMember(String id) {
		conn = getConnect();
		String sql = "delete from members where id =?";
		try {
			psmt= conn.prepareStatement(sql);
			psmt.setString(1, id);
			int r = psmt.executeUpdate();
			if(r>0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return false;
	}
	//한건등록.
	public void insertMember(MemberVO vo) {
		System.out.println(vo);
		conn = getConnect();
		String sql = "insert into members (id, passwd, email, name, responsibility) "
					+ " values(?,?,?,?,'user')";
	
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPasswd());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getName());
			
			psmt.executeUpdate();
			
			vo.setAuth("user");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
		//전체목록
	public List<MemberVO> memberList(){
		conn = getConnect();
		List<MemberVO> list = new ArrayList<>();
		String sql = "select * from members";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setAuth(rs.getString("responsibility"));
				
				list.add(vo);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list; 
	}
}
