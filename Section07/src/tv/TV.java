package tv;
/*
 * TV 클래스
 */
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
		if(!power) return;
		mute = !mute;
		if(mute)
			System.out.println("음소거 활성화");
		else
			System.out.println("음소거 비활성화");
	}
	void chUp() {
		if(!power) return;
		ch = ch % 567;
		ch++;
		System.out.println("현재 채널 : "+ch);
	}
	void chDown() {
		if(!power) return;
		ch--;
		if(ch < 1) 
			ch = 567;
		System.out.println("현재 채널 : "+ch);
	}
	void volUp() {
		if(!power) return;
		if(mute) muteOnOff();
		if(vol < 40) vol++;
		System.out.println("현재 음량 : "+vol);
	}
	void volDOwn() {
		if(!power) return;
		if(mute) muteOnOff();
		if(vol > 0) vol--;
		System.out.println("현재 음량 : "+vol);
	}
}







