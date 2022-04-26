package has_a_2;

public class Aircon extends PowerOnOff {
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
		power = true;
		System.out.println("에어컨 전원 On");
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("에어컨 전원 Off");
	}

}
