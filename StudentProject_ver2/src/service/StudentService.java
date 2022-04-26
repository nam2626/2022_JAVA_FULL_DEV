package service;

import java.util.Scanner;

import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();
	
	private StudentVO[] arr;
	private int index;
	
	private StudentService() {
		arr = new StudentVO[10];
		index=0;
		//학생 데이터를 4건 추가
		arr[index++] = new StudentVO("20201111", "홍길동", "컴퓨터공학과", 3.14);
		arr[index++] = new StudentVO("20201112", "김철수", "경영학과", 4.2);
		arr[index++] = new StudentVO("20201113", "이영히", "경제학과", 2.24);
		arr[index++] = new StudentVO("20201114", "박영수", "생활체육학과", 1.56);
	}
	
	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}

	public void registerStudent(StudentVO vo) {
		if(index == arr.length) {
			System.out.println("더 이상 저장할 공간이 없습니다.");
			return;
		}
		arr[index++] = vo;
		System.out.println("학생정보 등록이 완료되었습니다....");
	}
	//전체 학생 정보 조회
	public void printAllStudentInfo() {
		if(index == 0) {
			System.out.println("학생 정보가 하나도 없습니다.");
			return;
		}
		for(int i=0;i<index;i++) {
			arr[i].printStudentInfo();//한건씩 출력
		}
	}
	//학생정보 조회
	public StudentVO searchStudent(String studentNo) {
		for(int i=0;i<index;i++) {
			if(studentNo.equals(arr[i].getStudentNo())) {
				return arr[i];
			}
		}
		return null;
	}//searchStudent
//	public void updateStudent(Scanner sc) {
//		System.out.println("학생정보 수정을 시작합니다......");
//		//학번으로 조회 - searchStudent -> 조회 결과를 인덱스로 받음
//		int i = searchStudent(sc);
//		//조회결과 인덱스 값이 -1 --> 조회결과가 없음, 메서드 종료
//		if(i == -1) return;
//		//조회결과 인덱스 값이 0 이상이면 --> 조회결과가 있음
//		//조회결과가 있으면 --> 이름, 학과, 평점을 새로 입력 받아서 수정
//		System.out.print("수정할 이름 : ");
//		arr[i].setName(sc.nextLine());
//		System.out.print("수정할 학과 : ");
//		arr[i].setMajor(sc.nextLine());
//		System.out.print("수정할 평점 : ");
//		arr[i].setScore(sc.nextDouble());
//		sc.nextLine();
//		System.out.println("학생 정보 수정이 완료되었습니다.");
//	}
//	public void deleteStudent(Scanner sc) {
//		System.out.println("학생정보 삭제를 시작합니다.........");
//		int i = searchStudent(sc);
//		if(i == -1) return;
//		
//		//배열을 i값 기준으로 하나씩 땡겨오기
//		while(i < index) {
//			arr[i] = arr[i+1];
//			i++;
//		}
//		index--;
//		System.out.println("삭제 작업을 완료하였습니다.");
//	}

	public void maxScoreStudent() {
		StudentVO max = arr[0];
		
		for(int i=0;i<index;i++) {
			if(max.getScore() < arr[i].getScore())
				max = arr[i];
		}
		
		System.out.println("전체석차 1등");
		max.printStudentInfo();
	}
	
}//class







