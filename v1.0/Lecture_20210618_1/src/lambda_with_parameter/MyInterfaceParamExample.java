package lambda_with_parameter;

public class MyInterfaceParamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterfaceParameter fi;
		
		// MyInterfaceParameter �ȿ� �ִ� �߻� �޼ҵ� ���� (����)
		fi = (x) -> System.out.println(x * 5);
		fi.method(2);
		// x = 2;
		
		fi = x -> System.out.println(x * 5);
		fi.method(2);
		
		// ? �Ф�
		fi = x -> {
			System.out.println(x * 5);
			System.out.println(x * 6);
			
		};
		fi.method(2);
		
		// �߻�޼ҵ�: �� ������ �Ű�����
		// �� ������ ���� ���� ����ϴ� ���ٽ��� �ۼ��Ͻÿ�.
		MyInterfaceTwoParameter fii;
		
		// return���� ���� ���, return�� �Բ� �߰�ȣ ��������
		fii = (a, b) -> a + b;
		
		int res = fii.add(3, 5);
		System.out.println(res);
		
		System.out.println(fii.add(3, 5));
		
		fii = (a, b) -> {
			System.out.println("a = " + a 
					+ ", b = " + b);
			return a + b; // return ���� �Ұ�
		};
		System.out.println(fii.add(3, 5));
	}

}
