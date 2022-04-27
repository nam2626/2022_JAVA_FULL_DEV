package generic_extends;

public class ImportMouse<T extends Mouse> {
	private T mouse;

	public ImportMouse(T mouse) {
		this.mouse = mouse;
	}
	
	public void click(int n) {
		mouse.click(n);
	}
	
	public void wheel() {
		mouse.wheel();
	}
	
}
