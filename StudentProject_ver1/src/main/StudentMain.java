package main;

import java.util.Scanner;

import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		
		service.registerStudent(sc);
		service.registerStudent(sc);
		service.registerStudent(sc);
		service.printAllStudentInfo();
	}

}
