package lambda_test;

public class MyInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface fi;
		
		// �͸� ��ü
		fi = () -> {
			// �߻� �޼ҵ带 ����
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
	}

}
