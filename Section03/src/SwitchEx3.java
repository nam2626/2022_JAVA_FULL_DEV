import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("명령어 입력 >>> ");
		String str = sc.nextLine();
		
		switch(str) {
		case "register"://내용을 비교함
			System.out.println("회원 정보 등록 기능을 실행 합니다.");
			break;
		case "delete":
			System.out.println("회원 정보 삭제 기능을 실행 합니다.");
			break;
		case "update":
			System.out.println("회원 정보 수정 기능을 실행 합니다.");
			break;
		default:
			System.out.println("잘못된 명령어를 입력하셨습니다.");
		}
	}

}





