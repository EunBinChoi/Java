package interface_inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceA ia = new InterfaceA();
		// InterfaceA �ȿ� �߻�ȭ �޼ҵ尡 
		// ���� ��üȭ���� �ʾƼ� ��ü ������ �� ����
		// => new �߻� Ŭ���� (X)
		// => new �������̽�  (X)
		
		ia = new ImplementClass();
		// InterfaceC (extends InterfaceA, B)
		// ��üȭ �Ϸ� --> ��ü ���� ����!
	}

}
