package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DBManager;
import vo.StudentVO;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();
	private DBManager manager;
	private StudentDAO() {
		manager = DBManager.getInstance();
	}

	public static StudentDAO getInstance() {
		if(instance == null)
			instance = new StudentDAO();
		return instance;
	}
	public StudentVO selectStudent(String sno) {
		StudentVO vo = null;
		String sql = "select s.sno, s.sname, m.major_name, s.score "
				+ "from STUDENT s, MAJOR m where s.major_no = m.major_no and s.sno like ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = manager.getConn().prepareStatement(sql);
			pstmt.setString(1, sno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String sname = rs.getString(2);
				String majorName = rs.getString(3);
				double score = rs.getDouble(4);
				vo = new StudentVO(sno, sname, 0, majorName, score);						
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	public ArrayList<StudentVO> selectAllStudent(){
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		String sql = "select s.sno, s.sname, m.major_name, s.score "
				+ "from STUDENT s, MAJOR m where s.major_no = m.major_no";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = manager.getConn().prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String sno = rs.getString(1);
				String sname = rs.getString(2);
				String majorName = rs.getString(3);
				double score = rs.getDouble(4);
				list.add(new StudentVO(sno, sname, 0, majorName, score));				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			manager.close(pstmt, rs);
		}	
		
		return list;
	}

	public int insertStudent(StudentVO vo) {
		int count = 0;
		
		PreparedStatement pstmt = null;
		String sql = "insert into student values(?,?,?,?)";
		
		try {
			pstmt = manager.getConn().prepareStatement(sql);
			pstmt.setString(1, vo.getSno());
			pstmt.setString(2, vo.getSname());
			pstmt.setInt(3, vo.getMajorNo());
			pstmt.setDouble(4, vo.getScore());
			count = pstmt.executeUpdate();
			manager.getConn().commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			manager.close(pstmt, null);
		}
		
		return count;
	}
	
}










