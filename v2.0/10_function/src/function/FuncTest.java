package function;

public class FuncTest {
	// ���� �Լ�: ���α׷� ����� ���� ó������ ȣ��Ǵ� �Լ�
	// �Լ� (function): ���α׷��� ���/������ �����س� ����
	// ex) ���ڿ� �ȿ��� Ư�� ���ڰ� �� �� �ִ��� Ȯ��
	// 'hello' -> 'h', 'l'
	// why?
	// 1) �ڵ� ����
	// 2) �ڵ� ����ȭ (���ȭ)
	// 3) �ڵ� ������ (�Լ� �̸��� �� �ۼ��ϴ� �� �߿�! => ī�� ǥ���, ���� (���)+������ (countAlpha > alphaCount))
	
	// �Լ� �̸� �ۼ���
	// 1) Ư������ �Ұ� (_ ����)
	// 2) ���ں��� �����ϸ� �ȵ�
	// 3) Ű���� ����ϸ� �ȵ�
	// 4) small ī�� ǥ��� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է°� ����� �����Լ����� �ϴ� �� ����!
		String str1 = "hello";
		char target1 = 'h';
		int count1 = countAlpha(str1, target1);
		System.out.println(count1);
		
//		int count = 0;
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == target) {
//				count++;
//			}
//		}
		
		target1 = 'l';
		int s = 0;
		count1 = countAlpha(str1, target1);
		// 1) �Լ� �̸� ��������
		// 2) ���޵Ǵ� ������ ����, Ÿ��, ���� (���� �̸� �������)
		System.out.println(count1);
		
		str1 = "www";
		target1 = 'w';
		count1 = countAlpha(str1, target1); // �������� (�μ�) (argument)
		System.out.println(count1);
		
		str1 = "Hello World";
		int[] countCS = countCapSmallLetter(str1);
		System.out.printf("�빮�� ��: %d, �ҹ��� ��: %d", countCS[0], countCS[1]);
		
		
		
		/////////////////////////////////////////////////////////////////
		int[] arr = {10, 20, 30};
		
		// for-each��
		// �ε����� �迭 �������� �ʰ� �迭�� "���Ұ�" ��ü�� ����
		System.out.println();
		for(int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		changeOneElement(arr);  
		// �ּҰ� ���� (���� ������ ������ �� ����), ��ȯ���� ���� �Լ��� �޾��ִ� ������ �ʿ� ����
		
		for(int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		int value = 10;
		value = changeOneElement2(value); // ������ ���� 
		System.out.println("main �Լ� ���� : " + value); // ?
		
	} // main �Լ� ��	
	// ���� �Լ����� ȣ��Ǵ� �Լ����� public static���� ����
	// int: ��ȯ�� (�����Լ����� ��ȯ�Ϸ��� �ϴ� ���� (count)�� ������Ÿ�� (int))
	public static int countAlpha(String str, char target) { 
		// (String str, char target)
		// �Ű����� (parameter)
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == target) {
				count++;
			}
		}
		return count; // ����� (��ȯ��, �����Լ����� ��ȯ�ϰڴ�!) (** ���� �ϳ�)
		// ��ȯ�� ���� �� �Ϸ��� ��� �ұ��? ������ �ϳ��� �����͸� ���� �� ��� �ִ� ģ�� ..? (�迭!!!!)
	}
	
	public static int[] countCapSmallLetter(String str) {
		int[] count = new int[2];
		// count[0] => �빮�� ���� 
		// count[1] => �ҹ��� ����
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') count[0]++;
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') count[1]++;
		}
		
		return count;
	}
	
	// void: ��ȯ���� ����
	public static void changeOneElement(int[] arrInFunc) {
		arrInFunc[0] = arrInFunc[0] * 10;
	}
	public static int changeOneElement2(int v) {
		v *= 10;
		System.out.println("changeOneElement2 �Լ� ���� : " + v);
		return v; // ��ȯ�� �ؾ߸� �����Լ����� �Լ� ������ ��ȭ�� ���� ���� �� ����!
	}
} // class ��
