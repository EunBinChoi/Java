
// �ܼ� (����ȭ��)�� ���� ����ڿ��� �Է¹޴� ���
import java.util.Scanner; // ����ڿ��� �Է¹޴� Ŭ����

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// ��ü (object): ���� ���Ǵ� ���� (�ؾ �ϳ�)
		// Ŭ����: �ؾƲ
		// Ŭ����: ���� + �Լ�
		
		// int a = 10;
//		
		int x, y, sum;
//		
////		// �Է� ���� �޽���
		//System.out.print("ù��° ���ڸ� �Է��Ͻÿ� : ");
		x = input.nextInt(); // Scanner Ŭ������ �Լ�
//		
//		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ� : ");
//		y = input.nextInt(); // Scanner Ŭ������ �Լ�
//	
////		x = 100;
////		y = 200;
//		sum = x + y;
//		System.out.printf("�� ���� �� : %d \n", sum);
//		System.out.println("�� ���� �� :" + sum);
//		// ���ڿ� + ���� ���� 
//	
//		
//		
//		
//		// 1.
//		// ���� ������ ���ϴ� ���α׷�
//		// ���� �������� ����ڿ��� �Է¹��� (����, �Ǽ�)
//		
//		// ���� ���� = pi * r * r
//		// ���� �ѷ� = 2 * r * pi
//		
		int radius;
		double area, perimeter;
		final double pi = 3.141592; // ���߿� ������ �ʴ� ���
		//pi = 3.14;
		
		System.out.print("�������� �Է��Ͻÿ� : ");
		radius = input.nextInt();
		
		area = pi * radius * radius;
		System.out.println("���� : " + area);	
		
		perimeter = 2 * pi * radius;
		System.out.println("�ѷ� : " + perimeter);
		
		// pi = ���Ѽ� (3.141592 ....)
//		
//		
//		
//		
//		
//		
//		// 2. �غ��� ���̸� �Է¹޾� �ﰢ���� ���� ���ϴ� ���α׷�
//		
//		int base, height;
//		double triArea;
//		
//		System.out.print("�غ��� �Է��Ͻÿ� : ");
//		base = input.nextInt();
//		System.out.print("������ �Է��Ͻÿ� : ");
//		height = input.nextInt();
//		
//		triArea = (base * height) / 2.0;
//		System.out.println("�ﰢ���� ����: " + triArea);
		
//		// 3. ����ڿ��� �� ���� �Է¹޾� ����, ����, ����, ������
//		int x, y;
//		
//		System.out.print("ù��° ���� �Է��Ͻÿ� : ");
//		x = input.nextInt();
//
//		System.out.print("�ι�° ���� �Է��Ͻÿ� : ");
//		y = input.nextInt();
//		
//		System.out.println("���� : " + (x + y));
//		System.out.println("���� : " + (x - y));
//		System.out.println("���� : " + (x * y));
//		System.out.println("������ : " + ((double)x / y));
//		
		// 4. ������ 10% �����ϰ��� �Ѵ�. 10�⵿�� ����ݾ���?
		// ������ ����ڿ��� �Է¹���
		
		int salary; // ���� (�Էº���)
		double deposit; // �����
		final double rate = 0.1;
		
		// �Է� ���� �޽���
		System.out.print("����� ������ �Է��Ͻÿ� (����) : ");
		salary = input.nextInt();
		
		deposit = salary * rate * 10 * 12;
		System.out.println("������� : " + deposit + "����");
		
		
//		int x = 10;
//		int y = 20;
//		
//		System.out.println(x);
//		System.out.println(y);
	}

}
