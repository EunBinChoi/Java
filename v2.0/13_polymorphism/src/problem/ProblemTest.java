package problem;

class A {}

class B extends A {}

class C extends A {}

class D extends B {}

class E extends C {}

public class ProblemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� ������ ������ �����غ�����!
		
		// A�� B, C, D, E�� �θ� Ŭ�����̱� ������ �ڽ� Ŭ������ ������ �� ����!
		// ������ ����
		A a1;
		a1 = new B();
		a1 = new C();
		a1 = new D();
		a1 = new E();

		B b1;
		b1 = new A();
		b1 = new C();
		b1 = new D(); // B�� D�� �θ� Ŭ�����̱� ����
		b1 = new E();

		C c1;
		c1 = new A();
		c1 = new B();
		c1 = new D();
		c1 = new E(); // C�� E�� �θ� Ŭ�����̱� ����

		D d1; // ������ Ŭ���� (���������� �θ� �ƴ�)
		d1 = new A();
		d1 = new B();
		d1 = new C();
		d1 = new E();

		E e1; // ������ Ŭ���� (���������� �θ� �ƴ�)
		e1 = new A();
		e1 = new B();
		e1 = new C();
		e1 = new D();
	}

}
