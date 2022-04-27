package generic_extends;

public class OfficeMouse {
	public void click(int n) {
		switch(n) {
		case 0:
			System.out.println("마우스 왼쪽 버튼 클릭");
			break;
		case 1:
			System.out.println("마우스 휠 버튼 클릭");
			break;
		case 2:
			System.out.println("마우스 오른쪽 버튼 클릭");
			break;
		}
	}
	public void wheel() {
		System.out.println("화면 스크롤 이동");
	}
}
