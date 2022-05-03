package anonyumous;

public class PoliceMain {

	public static void main(String[] args) {
		Gun gun = new Gun() {
			private int bullet = 10;
			@Override
			public void shot() {
				if(bullet > 0) {
					bullet--;
					System.out.println("Bang!");
				}else 
					reload();
			}
			
			@Override
			public void reload() {
				bullet = 10;
				System.out.println("reload!");
			}
		};
		for(int i = 0;i<20;i++)gun.shot();
		
		Police police = new Police(gun);
		police.changeGun(new Gun() {
			
			@Override
			public void shot() {
				System.out.println("BangBang");
			}
			
			@Override
			public void reload() {
				System.out.println("reload");
			}
		});
		police.shot();
		police.reload();
	}

}
