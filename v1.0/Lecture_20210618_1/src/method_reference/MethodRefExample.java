package method_reference;

// API
import java.util.function.IntBinaryOperator;

public class MethodRefExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� ���� int�� ������ ���� �� �ִ� Ŭ����
		IntBinaryOperator operator;
		
		operator 
		= (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("��� 1: " 
		+ operator.applyAsInt(1, 2));
		
		// ���� �޼ҵ� ����
		// Ŭ���� �̸� :: ���� �޼ҵ� �̸�
		operator = Calculator :: staticMethod;
		System.out.println("��� 2: " 
				+ operator.applyAsInt(1, 2));
		
		
		// ��ü �޼ҵ� ����
		// ��ü �̸� :: ��ü �޼ҵ� �̸�
		Calculator c = new Calculator();
		operator 
		= (x, y) -> c.instanceMethod(x, y);
		System.out.println("��� 3: " 
				+ operator.applyAsInt(3, 4));
		
		operator = c :: instanceMethod;
		System.out.println("��� 4: " 
				+ operator.applyAsInt(3, 4));
		
	}

}
