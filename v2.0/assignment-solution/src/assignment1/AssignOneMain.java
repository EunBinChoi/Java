package assignment1;

public class AssignOneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Q1. ���� �˻� ���α׷�
		 * int year = 2021;
		 * 
		 * �Ʒ��� ���� �� �ϳ��� �����ϸ� ����
		 * 1) 4�� ����̾���ϰ� 100�� ����� �ƴϾ�� ��
		 * 2) 400�� ����� ������ ������ ��  
		 */
		
		int year = 2020;
		boolean isLeapYear 
		= ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		System.out.println(isLeapYear ? "����" : "���");
		
		
		/* Q2. ��� ���� �Ǵ� ���α׷�
		 * int num = -100;
		 * 
		 * �ش� ���� 0���� ũ�� "���"�� ���
		 *         0���� ������ "����"�� ���
		 *         0�̸� "0"�� ��� (**)
		 */
		// 1) (���ǽ�) ? ���� �� ��� : ������ �� ���
		// 2) (���ǽ�) ? ���� �� ��� : ������ �� ���
		
		int num = 0;
		boolean isZero = (num == 0);
		boolean isPositive = (num > 0);
		System.out.println(isZero ? "0" : (isPositive ? "���" : "����"));
		
		
		
		 /* Q3. ������
		 * int a = -1;
		 * int b = 0;
		 * 
		 * a/b�� ������ �����ϸ� ���� ����� ���
		 * a/b�� ������ �Ұ����ϸ� "���� �Ұ����մϴ�"�� ���
		 * 
		 * (* ���������� �и�� 0�� �� �� �����ϴ�!)
		 * (* int -> String, 
		 * String s = Integer.toString(i);
		 * int i = 3;
		 * String s = Integer.toString(i); // "3"
		 * 3 -> "3"
		 * */
		
		int a = -1;
		int b = 2;
		
		boolean isbZero = (b == 0);
		System.out.println(isbZero ? 
				"���� �Ұ���" : "���� ��� : " + ((double)a / b));
		
	}

}
