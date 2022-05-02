package service;

import java.util.ArrayList;

import exception.StudentException;
import vo.StudentVO;
/**
 * StudentService 클래스
 * 추가 삭제 수정 조회 작업 수행
 * @author ITSC
 *
 */
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
	/**
	 * 학생정보 등록하는 메서드
	 * @param vo 학생정보 한건에 해당함
	 * @return true면 학생정보 등록 성공, false면 학생정보 등록 실패
	 * @throws StudentException 학생번호가 중복되었을 때 발생
	 */
	public boolean registerStudent(StudentVO vo) throws StudentException {
		//중복된 데이터가 있는지 체크
		if(list.contains(vo)) {
			throw new StudentException("학번이 중복되었습니다.");
		}
		return list.add(vo); 
	}

	// 학생정보 조회
	public StudentVO searchStudent(String studentNo) throws StudentException {
		StudentVO vo = new StudentVO(studentNo, null, null, 0);
		int i = list.indexOf(vo);
		if(i == -1)
			throw new StudentException("검색한 학생정보 결과가 없습니다.");
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





