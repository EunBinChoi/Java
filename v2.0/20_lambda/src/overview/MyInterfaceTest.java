package overview;

public class MyInterfaceTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface f1; // ���� ������ �ȵ� �߻� �޼��� 1�� ������
		// �ʿ�� �� �� �߻� �޼��带 �������ϰ� ȣ��
		f1 = () -> { System.out.println("hello lambda!"); };
		f1 = () -> System.out.println("hello lambda!");
		// �Ű������� ���� ��쿡�� �Ұ�ȣ ������ �Ұ���
		// ������ ������ �ϳ��� ��� �߰�ȣ ������ ����
		f1.method();
		
		MyInterfaceParam f2;
		f2 = (a) -> { System.out.println(a); };
		f2 = a -> System.out.println(a);
		// �Ű������� �ϳ��� ��� �Ұ�ȣ ������ ����
		// ������ ������ �ϳ��� ��� �߰�ȣ ������ ����
		f2.methodWithParam(100);
		
		MyInterfaceReturn f3;
		f3 = (a, b) -> { return a * b; };
		f3 = (a, b) -> a * b;
		// �Ű������� �� �� �̻��� ��� �Ұ�ȣ ������ �Ұ���
		// ������ ������ �ϳ��� ��� �߰�ȣ ������ ���� 
		// => ������ ������ return�� ���Ե� ��� return ���� ������ �ؾ���
		int res = f3.methodWithReturn(10, 3);
		System.out.println(res);
		
		
		f3 = (a, b) -> a + b;
		res = f3.methodWithReturn(3, 5);
		

		//f2 = (a) -> System.out.println(a);
		f2.methodWithParam(res);
		
	}

}

