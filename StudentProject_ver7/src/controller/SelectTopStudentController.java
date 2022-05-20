package controller;

import java.util.ArrayList;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class SelectTopStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		try {
			ArrayList<StudentVO> list = StudentService.getInstance().selectRankOne();
			
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}

}
