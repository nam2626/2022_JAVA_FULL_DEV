package service;

import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();

	private StudentVO[] arr;
	private int index;

	private StudentService() {
		arr = new StudentVO[10];
		index = 0;
		// 학생 데이터를 4건 추가
		arr[index++] = new StudentVO("20201111", "홍길동", "컴퓨터공학과", 3.14);
		arr[index++] = new StudentVO("20201112", "김철수", "경영학과", 4.2);
		arr[index++] = new StudentVO("20201113", "이영히", "경제학과", 2.24);
		arr[index++] = new StudentVO("20201114", "박영수", "생활체육학과", 1.56);
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

	public void registerStudent(StudentVO vo) {
		if (index == arr.length) {
			System.out.println("더 이상 저장할 공간이 없습니다.");
			return;
		}
		arr[index++] = vo;
		System.out.println("학생정보 등록이 완료되었습니다....");
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





