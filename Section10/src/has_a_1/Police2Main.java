package has_a_1;

public class Police2Main {

	public static void main(String[] args) {
		Gun gun = new Gun();
		
		Police2 police2 = new Police2(gun);
		
		police2.shot();
		police2.shot();
		police2.shot();
		police2.shot();
		police2.shot();
		police2.shot();
		police2.changeGun(new AK47());
		police2.shot();
		police2.shot();
		police2.shot();
		police2.shot();
		police2.shot();
		police2.shot();
		police2.shot();
		police2.shot();
		police2.shot();
	}

}
