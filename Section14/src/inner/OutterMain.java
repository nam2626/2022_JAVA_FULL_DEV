package inner;

import inner.OutterClass.InnerClass;

public class OutterMain {

	public static void main(String[] args) {
		OutterClass outter = new OutterClass(100);
		InnerClass inClass = outter.new InnerClass(20);
		System.out.println(inClass.sum());
		inClass = outter.new InnerClass(40);
		System.out.println(inClass.sum());
		
		OutterStaticClass out = new OutterStaticClass(100);
		OutterStaticClass.InnerStaticClass in = new OutterStaticClass.InnerStaticClass(5);
		System.out.println(in.sum());
	}

}
