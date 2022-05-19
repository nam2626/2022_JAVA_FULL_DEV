package service;

import java.util.ArrayList;

import dao.StudentDAO;
import exception.StudentException;
import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();
	private StudentDAO dao;
	
	private StudentService() {
		dao = StudentDAO.getInstance();
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}
	
	public ArrayList<StudentVO> selectAllStudent() throws StudentException{
		ArrayList<StudentVO> list = dao.selectAllStudent();
		
		if(list.isEmpty())
			throw new StudentException("학생 데이터가 하나도 없습니다.");
		return list;
	}
	
}










