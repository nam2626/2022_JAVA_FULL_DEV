package ramda;

public class RamdaEx3 {

	public static void main(String[] args) {
		Method<String> m1 = (a) -> System.out.println(a);
		Method<Integer> m2 = (a) -> System.out.println(a*a);
		Method<Double> m3 = (a) -> System.out.println(a*a*3.1415);
		
		m1.run("Hello");
		m2.run(4);
		m3.run(5.0);
		
		//Runnable 객체를 람다식으로 표현
		Thread t1 = new Thread(()->{
			for(int i=0;i<10;i++)
				System.out.println(Thread.currentThread().getName() + " " + i);
		},"김씨");
		t1.start();
	}

}







