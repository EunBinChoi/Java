package interface_inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceA ia = new InterfaceA();
		// InterfaceA 안에 추상화 메소드가 
		// 아직 구체화되지 않아서 객체 생성할 수 없음
		// => new 추상 클래스 (X)
		// => new 인터페이스  (X)
		
		ia = new ImplementClass();
		// InterfaceC (extends InterfaceA, B)
		// 구체화 완료 --> 객체 생성 가능!
	}

}
