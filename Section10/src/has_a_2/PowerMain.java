package has_a_2;

public class PowerMain {

	public static void main(String[] args) {
		IotApp app = new IotApp();
		app.addDevice(new TV());
		app.deviceAllPowerOn();
		app.deviceAllPowerOff();
	}

}
