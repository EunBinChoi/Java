import java.util.Scanner;
public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int int;
		// double double;
		// 1��
		int money; // �޴� ��
		int total; // ��ǰ �Ѿ�
		double tax;
		int change;
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �� : ");
		money = input.nextInt();
		
		System.out.print("��ǰ �Ѿ� : ");
		total = input.nextInt();
		
		tax = total * 0.1;
		change = money - total;
		
	}

}
