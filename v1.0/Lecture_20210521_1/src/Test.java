import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candfreq = new int[10];
		
		// �ĺ���: 10��
		// �ε��� (0 1 2 3 ....  9) : �ĺ��� ��ȣ (1 ~ 10) - 1
		// ����: �ĺ����� ��ǥ��
		
		// 0�� �ĺ��� �󵵼�
		// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		// new �� 0���� �ʱ�ȭ�Ǿ�����
		Scanner input = new Scanner(System.in);
		
		while(true) {
			for(int i = 0; i < 10; i ++) {
				System.out.print((i + 1) + " ");
				System.out.print(candfreq[i] + " ");
				System.out.println();
			}
			System.out.print("�ĺ����� ��ȣ�� �Է��Ͻÿ� : (���� -1) ");
			int choice = input.nextInt();
			if (choice == -1) break;
			candfreq[choice - 1]++; // **
		}
		
	}

}
