package tv;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.powerOnOff();
		tv.ch = 565;
		for(int i=0;i<10;i++)
			tv.chUp();
		for(int i=0;i<10;i++)
			tv.chDown();
		for(int i=0;i<20;i++)
			tv.volDOwn();
	}

}
