package problem;

class A {}

class B extends A {}

class C extends A {}

class D extends B {}

class E extends C {}

public class ProblemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 왜 오류가 나는지 생각해보세요!
		
		// A가 B, C, D, E의 부모 클래스이기 때문에 자식 클래스를 포함할 수 있음!
		// 다형성 개념
		A a1;
		a1 = new B();
		a1 = new C();
		a1 = new D();
		a1 = new E();

		B b1;
		b1 = new A();
		b1 = new C();
		b1 = new D(); // B는 D의 부모 클래스이기 때문
		b1 = new E();

		C c1;
		c1 = new A();
		c1 = new B();
		c1 = new D();
		c1 = new E(); // C는 E의 부모 클래스이기 때문

		D d1; // 마지막 클래스 (누군가에게 부모가 아님)
		d1 = new A();
		d1 = new B();
		d1 = new C();
		d1 = new E();

		E e1; // 마지막 클래스 (누군가에게 부모가 아님)
		e1 = new A();
		e1 = new B();
		e1 = new C();
		e1 = new D();
	}

}
