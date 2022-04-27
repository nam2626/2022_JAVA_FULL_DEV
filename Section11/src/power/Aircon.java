package power;

public class Aircon implements PowerOnOff {
	private boolean power;
	@Override
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("에어컨 전원 On");
		else
			System.out.println("에어컨 전원 Off");
	}

	@Override
	public void powerOn() {
		power = POWER_ON;
		System.out.println("에어컨 전원 On");
	}

	@Override
	public void powerOff() {
		power = POWER_OFF;
		System.out.println("에어컨 전원 Off");
	}

}
