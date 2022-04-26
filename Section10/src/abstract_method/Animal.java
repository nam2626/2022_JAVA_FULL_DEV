package abstract_method;
/*
 * 추상 메서드(Abstract Method)
 * 		- 메서드 구현부가 없음
 * 		- 상속 받는 클래스가 생성이 될려면 반드시 재정의
 * 		- 만약 추상메서드를 자식클래스가 재정의 하지 않으면 
 * 		  자식 클래스도 추상클래스로 만들어야됨
 * 		- 추상 메서드를 만들려면 반드시 추상 클래스에서만 정의할 수 있음
 */
public abstract class Animal {
	public abstract void eat();
}
