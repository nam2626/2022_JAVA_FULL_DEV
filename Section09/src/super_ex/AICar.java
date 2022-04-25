package super_ex;

public class AICar extends Car{
	private boolean mode;
	
	@Override
	public void driving() {
		if(mode)
			System.out.println("자율 주행을 시작합니다.");
		else
			super.driving();//부모 클래스에 구현된 driving 호출 
	}
	
	public void changeMode() {
		mode = !mode;
		driving();
	}
}





