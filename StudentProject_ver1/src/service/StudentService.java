package service;

import java.util.Scanner;

import vo.StudentVO;

public class StudentService {
	private StudentVO[] arr;
	private int index;
	
	public StudentService() {
		arr = new StudentVO[10];
		index=0;
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
		
		//arr에 입력받은 정보를 이용해서 Student 생성하여 배열에 저장
		arr[index] = new StudentVO(studentNo, name, major, score);
		//index 증가
		index++;
		System.out.println("학생정보 등록이 완료되었습니다....");
	}
}







