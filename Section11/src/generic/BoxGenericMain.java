package generic;

public class BoxGenericMain {

	public static void main(String[] args) {
		BoxGeneric<Apple> box1 = new BoxGeneric<Apple>();
		box1.setObj(new Apple());
		Apple a = box1.getObj();
		a.printApple();
		
		BoxGeneric<Orange> box2 = new BoxGeneric<Orange>();
		box2.setObj(new Orange());
		Orange o = box2.getObj();
		o.printOrange();
	}

}
