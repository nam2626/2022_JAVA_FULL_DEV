package service;

import java.util.ArrayList;

import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();

	private ArrayList<StudentVO> list;

	private StudentService() {
		list = new ArrayList<StudentVO>();
		// 학생 데이터를 4건 추가
		list.add(new StudentVO("20201111", "홍길동", "컴퓨터공학과", 3.14));
		list.add(new StudentVO("20201112", "김철수", "경영학과", 4.2));
		list.add(new StudentVO("20201113", "이영히", "경제학과", 2.24));
		list.add(new StudentVO("20201114", "박영수", "생활체육학과", 1.56));
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}
	
	public ArrayList<StudentVO> getList() {
		return list;
	}
	
	public boolean registerStudent(StudentVO vo) {
		//중복된 데이터가 있는지 체크
		if(list.contains(vo)) {
			return false;
		}
		return list.add(vo); 
	}

	// 학생정보 조회
	public StudentVO searchStudent(String studentNo) {
		StudentVO vo = new StudentVO(studentNo, null, null, 0);
		int i = list.indexOf(vo);
		if(i == -1)
			return null;
		return list.get(i);
	}// searchStudent

	public boolean deleteStudent(String studentNo) {
		return list.remove(new StudentVO(studentNo, null, null, 0));
	}

	public ArrayList<StudentVO> maxScoreStudent() {
		if(list.isEmpty()) return null;
		
		StudentVO max = list.get(0);

		for (int i = 1; i < list.size(); i++) {
			if (max.getScore() < list.get(i).getScore())
				max = list.get(i);
		}
		ArrayList<StudentVO> result = new ArrayList<StudentVO>();
		//점수 최대값과 같은 StudentVO를 result에 추가
		for (int i = 1; i < list.size(); i++) {
			if (max.getScore() == list.get(i).getScore())
				result.add(list.get(i));
		}
		return result;
	}

	

}// class





