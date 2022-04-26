package has_a_1;
/*
 * Gun 상속 받아서 has a 관계를 구현했기 때문에
 * 확장성에서 떨어지고,
 * 다른 종류의 Gun 클래스를 받을 수가 없다.
 */
public class Police1 extends Gun {
	public void shot() {
		super.shot();
	}
	public void reload() {
		super.reload();
	}
}
