package has_a_1;

public class Police2 {
	private Gun gun;

	public Police2(Gun gun) {
		this.gun = gun;
	}
	
	public void shot() {
		gun.shot();
	}
	
	public void reload() {
		gun.reload();
	}
	
	public void changeGun(Gun gun) {
		this.gun = gun;
		System.out.println("총기 교체 완료");
	}
}




