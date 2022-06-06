import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// ���� ������
		// ++a, a++ : a = a + 1
		// --a, a-- : a = a - 1
		
		int x = 1;
		int y = 1;
		
		int nextx = ++x;
		// 1. ++x // x = x + 1
		// 2. nextx = x
		System.out.println("nextx : " + nextx);
		System.out.println("x : " + x);
		
		int nexty = y++;
		// 1. nexty = y
		// 2. y++
		System.out.println("nexty : " + nexty);
		System.out.println("y : " + y);
		
		int a = 1;
		int b = 1;
		
		a ++; // a = a + 1
		++ b; // b = b + 1
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		x = 3;
		y = 2;
		x ++; // ++x;
		y ++; // ++y;
		
		
		Scanner input = new Scanner(System.in);
	
		
		/* 1. ��Ʈ �п� ������ �ôµ� �հ��� �� ������� ?
		 * ���α׷��� ���� �ʱ� / �Ǳ� ������ �Է¹���
		 * - 1) �ʱ⳪ �Ǳ⸦ 90�� �̻� �ްų�
	       - 2) �ʱ�� �Ǳ� ������ ����� 70�� �̻��̰ų�
		 */
		
		int written_score; // 90 80 70 
		int prac_score;
		int avg; // average
		boolean isPass; // true or false
		
		System.out.print("���α׷��� ���� �ʱ� ������ �Է��Ͻÿ� : ");
		written_score = input.nextInt();
		
		System.out.print("���α׷��� ���� �Ǳ� ������ �Է��Ͻÿ� : ");
		prac_score = input.nextInt();
		
		avg = (written_score + prac_score) / 2;
		
		isPass = ((written_score >= 90) || (prac_score >= 90)) 
				|| (avg >= 70);
	
		
		System.out.println("�հݿ��� : " + isPass);
		
		/* 2. ��ġ�� �л� A�� �ִµ�, 
		 * �ʵ��б��� ������ �Ʒ��� ���ǿ� �����ؾ��մϴ�.
		 * - 1) Ű�� 140cm �̻��̰ų�
		 * - 2) ���̰� 8�� �̻��̰ų�
		 * 
		 * �л� A�� �ʵ��б��� �� �� �������?
		 * */
		
		int height, age;
		boolean isSchool;
		
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		height = input.nextInt();
		
		System.out.print("���̸� �Է��Ͻÿ� : ");
		age = input.nextInt();
		
		isSchool = (height >= 140) || (age >= 8);
		
		System.out.println("�л� A�� �ʵ��б� ���� : " + isSchool);
		
		
		/*3. �ﰢ���� �� �� �������?
		 * �� ���� ���̸� �Է¹޾� a, b, c
		 * a + b > c�� �����ϴ��� ���θ� ����غ���!
		 * 
		 * ����, ����ڿ��� �Է¹��� a, b, c�� ������
		 * ���� �ﰢ���� �� �� �ִ��� ����غ���
		 * (���� �ﰢ���� �Ǵ� ���� (��Ÿ���): 
		 *   a * a + b * b == c * c)
		 * 
		 * */
		
		int triA, triB, triC; // ���� �� ��
		boolean isTri, isPytha;
		
		System.out.print("�ﰢ���� A ���̴�? ");
		triA = input.nextInt();
		
		System.out.print("�ﰢ���� B ���̴�? ");
		triB = input.nextInt();
		
		System.out.print("�ﰢ���� C ���̴�? ");
		triC = input.nextInt();
		
		isTri = (triA + triB) > triC;
		System.out.println("�ﰢ�� ���� : " + isTri);
		
		isPytha = (isTri) &&
				(triA * triA + triB * triB 
						== triC * triC);
		System.out.println("���� �ﰢ�� ���� : " + isPytha);
		
		
		
	}
}
