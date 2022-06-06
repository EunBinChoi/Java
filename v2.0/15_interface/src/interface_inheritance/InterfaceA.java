package interface_inheritance;

/* 인터페이스끼리 상속이 가능함 (인터페이스끼리는 다중 상속 가능함)
 * 
 * 인터페이스C extends 인터페이스A, 인터페이스B (o)
 * 클래스C extends 클래스A, 클래스B (x)
 * 
 * => 클래스 implements 인터페이스C
 * 
 * */

public interface InterfaceA {
	public void methodA();
}
