package tv;

public class TV {
	int ch;//채널
	int vol;//음량
	boolean power;//전원
	boolean mute;//음소거
	//기본 생성자
	public TV() {
		ch = 7;
		vol = 10;
		power = false;
		mute = false;
	}
	
	void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("TV 전원 On");
		else
			System.out.println("TV 전원 Off");
	}
	
	void muteOnOff() {
		mute = !mute;
		if(mute)
			System.out.println("음소거 활성화");
		else
			System.out.println("음소거 비활성화");
	}
	
}







