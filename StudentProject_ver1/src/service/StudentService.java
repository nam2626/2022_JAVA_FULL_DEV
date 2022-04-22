package service;

import java.util.Scanner;

import vo.StudentVO;

public class StudentService {
	private StudentVO[] arr;
	private int index;
	
	public StudentService() {
		arr = new StudentVO[10];
		index=0;
		//학생 데이터를 4건 추가
		arr[index++] = new StudentVO("20201111", "홍길동", "컴퓨터공학과", 3.14);
		arr[index++] = new StudentVO("20201112", "김철수", "경영학과", 4.2);
		arr[index++] = new StudentVO("20201113", "이영히", "경제학과", 2.24);
		arr[index++] = new StudentVO("20201114", "박영수", "생활체육학과", 1.56);
	}
	
	public void registerStudent(Scanner sc) {
		System.out.println("학생 정보 등록을 시작합니다...........");
		
		if(index == arr.length) {
			System.out.println("더이상 저장할 공간이 없습니다.");
			return;
		}
		
		//학생정보 입력
		System.out.print("학번 : ");
		String studentNo = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학과 : ");
		String major = sc.nextLine();
		System.out.print("평점 : ");
		double score = sc.nextDouble();
		sc.nextLine();//엔터를 지움
		
		//arr에 입력받은 정보를 이용해서 Student 생성하여 배열에 저장
		arr[index] = new StudentVO(studentNo, name, major, score);
		//index 증가
		index++;
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
	public int searchStudent(Scanner sc) {
		System.out.println("학생번호를 이용해서 학생정보 조회를 시작합니다.............");
		//학번입력
		System.out.print("검색할 학생번호 입력 : ");
		String studentNo = sc.nextLine();
		//반복문
		for(int i=0;i<index;i++) {
		//	배열에 있는 학번을 기준으로 입력 받은 값과 비교
			//if(arr[i].getStudentNo().equals(studentNo)) {
			if(studentNo.equals(arr[i].getStudentNo())) {
				//	일치하면 학생정보 출력 후 종료
				arr[i].printStudentInfo();
				return i;
			}
		}
		//조회 결과가 없으면 '입력한 학번에 대한 학생 정보가 없습니다' 라는 메세지 출력
		System.out.println("입력한 학번에 대한 학생 정보가 없습니다");
		return -1;
	}//searchStudent
	public void updateStudent(Scanner sc) {
		System.out.println("학생정보 수정을 시작합니다......");
		//학번으로 조회 - searchStudent -> 조회 결과를 인덱스로 받음
		int i = searchStudent(sc);
		//조회결과 인덱스 값이 -1 --> 조회결과가 없음, 메서드 종료
		if(i == -1) return;
		//조회결과 인덱스 값이 0 이상이면 --> 조회결과가 있음
		//조회결과가 있으면 --> 이름, 학과, 평점을 새로 입력 받아서 수정
		System.out.print("수정할 이름 : ");
		arr[i].setName(sc.nextLine());
		System.out.print("수정할 학과 : ");
		arr[i].setMajor(sc.nextLine());
		System.out.print("수정할 평점 : ");
		arr[i].setScore(sc.nextDouble());
		sc.nextLine();
		System.out.println("학생 정보 수정이 완료되었습니다.");
	}
	public void deleteStudent(Scanner sc) {
		System.out.println("학생정보 삭제를 시작합니다.........");
		int i = searchStudent(sc);
		if(i == -1) return;
		
		//배열을 i값 기준으로 하나씩 땡겨오기
		while(i < index) {
			arr[i] = arr[i+1];
			i++;
		}
		index--;
		System.out.println("삭제 작업을 완료하였습니다.");
	}
	
}//class







