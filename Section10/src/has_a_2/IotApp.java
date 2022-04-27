package has_a_2;

public class IotApp {
	private PowerOnOff[] arr;
	private int index;
	public IotApp() {
		arr = new PowerOnOff[10];
		arr[index++] = new TV();
		arr[index++] = new TV();
		arr[index++] = new Light();
		arr[index++] = new Aircon();
	}
	//새로운 기기를 받아서 배열에 등록하는 메서드
	public void addDevice(PowerOnOff device) {
		if(index != arr.length) {
			arr[index++] = device;
			System.out.println("디바이스 등록 완료");
		}else {
			System.out.println("더이상 등록할 공간이 없습니다.");
		}
	}
	
	//전체 powerOn
	public void deviceAllPowerOn() {
		for(int i=0;i<index;i++)
			arr[i].powerOn();
	}
	//전체 powerOff
	public void deviceAllPowerOff() {
		for(int i=0;i<index;i++)
			arr[i].powerOff();
	}
	
}





