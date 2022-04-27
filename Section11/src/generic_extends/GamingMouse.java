package generic_extends;

public class GamingMouse implements Mouse{

	@Override
	public void click(int n) {
		switch(n) {
		case 0:
			System.out.println("게이밍 마우스 왼쪽 버튼 클릭");
			break;
		case 1:
			System.out.println("게이밍 마우스 휠 버튼 클릭");
			break;
		case 2:
			System.out.println("게이밍 마우스 오른쪽 버튼 클릭");
			break;
		case 3:
			System.out.println("DP 값 변경");
			break;
		}
	}

	@Override
	public void wheel() {
		System.out.println("화면 스크롤 이동");
	}

}






