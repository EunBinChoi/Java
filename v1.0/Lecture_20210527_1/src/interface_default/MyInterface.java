package interface_default;

public interface MyInterface {
//	int A = 3;
	public void method1(); // abstract method
	
	// �������̽� �߰� �޼ҵ� ����
	// abstract: MyInterface�� implements �޴� ClassA, B�� ����
	// default: MyInterface�� implements �޴� ClassA, B�� �������� �ʾƵ� O
	public default void method2() {
		System.out.println(
				"MyInterface - method2()");
	}
}
