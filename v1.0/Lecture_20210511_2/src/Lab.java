import java.util.Scanner;
public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Էº���: �������� �ƴ���, �α��� ��, ������ ��
		
		// Lab1
		boolean isCapital;
		int citizen;
		int riches;
		boolean isMetro;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�����Դϱ�? (true or false) ");
		isCapital = input.nextBoolean();
		
		System.out.print("�α��� �� ? (����: ��) ");
		citizen = input.nextInt();
		
		System.out.print("������ �� ? (����: ��) ");
		riches = input.nextInt();
		
		// 1. �� ������ �����̰�, �α��� 100�� �̻�
		// 2. ������ �α��� 50�� �̻�
		isMetro = ((isCapital == true) && (citizen >= 100)) 
				|| (riches >= 50);
		System.out.println("��Ʈ�������� ���� : " + isMetro);
		
		input.close();
		
		// Lab2
		// 1. 4�� ���, 100�� ����� �ƴϿ��� ��
		// 2. 400�� ���
		
		int year;
		
		System.out.print("������ �Է��Ͻÿ� : "); // 2021, 2000
		year = input.nextInt();
		
//		boolean leapYear = 
//				((year % 4 == 0) && (year % 100 != 0)) ||
		
		// Lab3
		// AC : AE = BC : DE
		// AC / AE = BC / DE
		
		
		
		
		
		
		
		
		
		
		
		boolean leapYear;
		
		
		
		
	}

}
