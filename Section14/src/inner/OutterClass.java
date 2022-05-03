package inner;

public class OutterClass {
	private int outter;

	public OutterClass(int outter) {
		this.outter = outter;
	}
	
	public void printOutter() {
		System.out.println(outter);
	}
	
	public class InnerClass{
		private int inner;

		public InnerClass(int inner) {
			this.inner = inner;
		}
		
		public int sum() {
			return outter+inner;
		}
	}
}






