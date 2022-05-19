package controller;

import java.util.ArrayList;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class PrintAllStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		try {
			ArrayList<StudentVO> list = StudentService.getInstance().selectAllStudent();
			
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}

	}

}






