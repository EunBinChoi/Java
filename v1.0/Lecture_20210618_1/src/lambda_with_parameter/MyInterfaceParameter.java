package lambda_with_parameter;

@FunctionalInterface
public interface MyInterfaceParameter {
	// �߻� �޼ҵ带 �ϳ��� �ۼ��� �� ����
	public void method(int x); // �߻� �޼ҵ� (������ ������ ����� ��)
	//public void otherMethod3(int x);
	public default void otherMethod(int x) {
		// ����Ʈ �޼ҵ� ���� ..
	} 
	// ����Ʈ �޼ҵ� (������ ������)
	
	
	public static void otherMethod2(int x) {
		// ���� �޼ҵ� ���� ..
	}
	
	
}
