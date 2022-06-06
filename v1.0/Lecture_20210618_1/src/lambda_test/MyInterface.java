package lambda_test;

@FunctionalInterface
public interface MyInterface {
	// �߻� �޼ҵ� (abstract method)
	// : �޼ҵ尡 ���� �Ǿ��ְ� �����Ǿ����� ���� �Լ�
	// : ���� ������ ? ����ϴ� ���� ���߾� �����ϸ� ��
	//int x = 3; // ��� ���� 
	
	public void method(); // �߻� �޼ҵ�
	//public void otherMethod(); // ������ ����
	
	/*
	 * ���ٽĿ��� ����Ϸ��� �߻� �޼ҵ尡 ���� 1���� �� �� ����
	 * 
	 * 
	 * why?
	 * ��ü�� �ʿ���� �Լ����� �������ϴ� ���� ��������
	 * 
	 * ���ٽĿ��� ����ϱ� ���� �ۼ��� �������̽�
	 * => �Լ��� �������̽� (Functional Interface)
	 * 
	 * */
	
	// �������̽�
	// 1. ��� (static final) => ��������
	// 2. �߻� �޼ҵ� (abstract) => ��������
	// 3. ����Ʈ �޼ҵ� (default)
	// 4. ���� �޼ҵ� (static)
	
	
	// �߻� Ŭ���� (abstract class)
	// �ϳ� �̻��� �߻� �޼ҵ带 ���� Ŭ����
}
