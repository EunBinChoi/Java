package class_cast_exception;

public class ClassCastExceptionTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Object o = new Integer(3); // ������
			System.out.println((String) o); // Class Cast Exception (Ŭ���� ��ȯ �Ұ�)
			// ���� ��ü�� Integer���̱� ������ String���� ����ȯ�� �Ұ���
			
			// 15_interface problem package
			Shape s = new Circle(); // ������
			Rectangle r = (Rectangle)s;
			// ���� ��ü�� Circle���̱� ������ Rectangle���� ����ȯ �Ұ���
		} catch (ClassCastException e) {
			System.out.println(e);
		}
		
		
		
		
	}

}
