package aircon;

/**
 * 에어컨 클래스
 *
 */
public class Aircon {
	private boolean power;
	private int wind;
	private int temp;
	private int mode;
	
	private final int MAX_TEMP = 32;
	private final int MIN_TEMP = 18;
	
	public Aircon() {
		wind = 2;
		temp = 24;
		mode = 1;		
	}

	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("에어컨 전원 On");
		else
			System.out.println("에어컨 전원 Off");
	}
	/**
	 * 에어컨 희망 온도를 올리는 메서드<br>
	 * 최대 온도 32도를 넘어갈수는 없음
	 */
	public void tempUp() {
		if(!power) return;
		if(mode != 1) return; //운전 모드가 냉방일때만 실행 
		if(temp < MAX_TEMP) temp++;
		System.out.println("희망 온도 : "+temp);
		
	}
	public void tempDown() {
		if(!power) return;
		if(mode != 1) return; 
		if(temp > MIN_TEMP) temp--;
		System.out.println("희망 온도 : "+temp);
	}
	public void changeWind() {
		wind = wind % 4;
		wind++;
		
		switch(wind) {
		case 1:
			System.out.println("약풍");
			break;
		case 2:
			System.out.println("중풍");
			break;
		case 3:
			System.out.println("강풍");
			break;
		default:
			System.out.println("자동");
		}
	}
	
	public void selectMode() {
		mode = mode % 3;
		mode++;
		
		switch(mode) {
		case 1:
			System.out.println("냉방 운전 설정");
			break;
		case 2:
			System.out.println("송풍 운전 설정");
			break;
		default:
			System.out.println("제습 운전 설정");
		}
	}
}










