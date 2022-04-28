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

	public StudentVO[] getArr() {
		return arr;
	}

	public int getIndex() {
		return index;
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
		for (int i = 0; i < index; i++) {
			if (studentNo.equals(arr[i].getStudentNo())) {
				return arr[i];
			}
		}
		return null;
	}// searchStudent

	public boolean deleteStudent(String studentNo) {
		boolean flag = false;

		for (int i = 0; i < index; i++) {
			if (studentNo.equals(arr[i].getStudentNo())) {
				flag = true;
				while (i < index) {
					arr[i] = arr[i + 1];
					i++;
				}
				index--;
			}
		}
		return flag;
	}

	public StudentVO maxScoreStudent() {
		if(index == 0) return null;
		
		StudentVO max = arr[0];

		for (int i = 0; i < index; i++) {
			if (max.getScore() < arr[i].getScore())
				max = arr[i];
		}
		
		return max;
	}

}// class





