package power;

public interface PowerOnOff {
	public static final boolean POWER_ON = true;
	public static final boolean POWER_OFF = false;
	
	public abstract void powerOnOff();
	public abstract void powerOn();
	public abstract void powerOff();
}
