package interface_default;

public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("MyClassB - method1()");
	}

	// default �޼���� 
	// �����ǰ� �ʼ������� ������ �����ǵ� �� �� ����
	@Override
	public void method2() {
		System.out.println("MyClassB - method2()");
	}
}
