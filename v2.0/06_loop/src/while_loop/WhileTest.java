package while_loop;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* �ݺ���: � ������ �ݺ��Ǵ� ����
		 * ex) 30�� ���� �Է¹ް� ���� ��
		 * ex) 1 ~ 45 �ζǰ� 6��
		 * 
		 * while, do while, for
		 * 
		 * sysout("hello");
		 * 
		 * while(���ǽ�){
		 * 		����;
		 * }
		 * : ���ǽ��� ���� �� ���� ������ ����ȴ�.
		 * : ���ǽ��� �ѹ��̶� �����̵Ǹ� �ݺ����� ����ȴ�.
		 * */
		
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		
//		int i = 0; // �ݺ����� ���� �ӽú��� (�ݺ� Ƚ�� ����)
//		while(i < 5) {
//			System.out.println("hello! " + i);
//			i++; // i = i + 1
//		}
//		//
//		System.out.println("while�� ����� i = " + i); // 5
//		// i < 5 ���ǽ��� ������ �Ǵ� ������ i == 5�� ��
//		
		
//		i = 1;
//		while(i <= 5) { // 1 <= 5
//			System.out.println("hello! " + i);
//			i++; // i = i + 1
//			// ++i;
//		}
//		System.out.println("while�� ����� i = " + i); // 6
		
		/* while
		 * 1) �ʱ�ȭ (i = 1,  i = 0)
		 * 2) ���ǽ� (i <= 5, i < 5)
		 * 3) ������ (i++, ++i) (**)
		 * * ���� �������� ������ ���� �ݺ��� (���� ����)�� ������ ��
		 * 
		 * * ���� �ݺ��� Ȱ��
		 * while(true){
		 * 
		 * }
		 * */
		Scanner sc = new Scanner(System.in); 
		// ctrl + shift + o: �ʿ��� Ŭ������ �ڵ����� import
		
		// Q1. ����ڿ��� ���� �ϳ��� �Է¹޾Ƽ� ���ĺ��� �ƴϸ� ��� �Է�
		
//		char ch = 0;	
//		
//		while(true) {
//			System.out.print("���� �ϳ� �Է�: ");
//			ch = sc.next().toLowerCase().charAt(0); //
//			
//			if(ch >= 'a' && ch <= 'z') break; // �ݺ��� ��������
//			else System.out.println("[���] ���ĺ��� �Է�!");
//		} // while���� ����
//		//
//		System.out.println("break�� ���� �ݺ��� �������� " + ch); //?
		
		// Q2. ����ڿ��� ������ �ܼ� (2 ~ 9��)�� �Է¹޾� 
		// ������ ��� ���α׷�
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// ...
		// 2 * 9 = 18
		
		
		// 1) ����ڰ� ����ε� ���� �Է��� ������ ��� �޴� ���
		// 2) �߸� �Է����� ��� �ٷ� �����ϴ� ���
		
		
		// 1)
//		int n = 0;
//		while(true) {
//			System.out.print("������ �ܼ� �Է�: "); // 2 ~ 9
//			n = sc.nextInt();
//			
//			if(n >= 2 && n <= 9) break;
//			else {
//				System.out.println("[����] 2 ~ 9 ������ �� �Է����ּ���!");
//			}
//		}
//		
//		// 2)
////		if(!(n >= 2 && n <= 9)) {
////			System.out.println("[����] �ܼ��� ��ȿ���� ����!");
////			return;
////		}
//		
//		int i = 1;
//		while(i <= 9) {
//			System.out.printf("%d x %d = %d\n", n, i, n*i);
//			i ++;
//		}
		
		// Q3. 5���� ��ǻ�� ���� (����)�� �Է¹޾� 
		// ������ �հ�� ����� ���ϴ� ���α׷�
		// 80, 85, 90, 100, 95
		
		// total: 80 + 85 + 90 + 100 + 95
		
//		int i = 0;
//		int score = 0;
//		int total = 0;
//		
//		while(i < 5) {
//			System.out.printf("%d��° �л��� ���� �Է� : ", i + 1);
//			score = sc.nextInt();
//			
//			total += score;
//			i++;
//		}
//		System.out.println(total); // �л� ���� ����
//		System.out.printf("���: %f", total / 5.0); // �л� ���� ���
		
		// 5 / 2 ==> 2
		// 5 / 2.0 ==> 2.5
		
		/* totalScore = 0;
		 * 
		 * i == 0
		 * score: 95
		 * totalScore = 0 + 95
		 * 
		 * i == 1
		 * score: 85
		 * totalScore = (0 + 95) + 85
		 * 
		 * i == 2
		 * score: 80
		 * totalScore = (0 + 95 + 85) + 80
		 * 
		 * i == 3
		 * score = 60
		 * totalScore = (0 + 95 + 85 + 80) + 60
		 * 
		 * i == 4
		 * score = 50
		 * totalScore = (0 + 95 + 85 + 80 + 60) + 50
		 * 
		 * */
		
		// Q4. 5���� ���� (����)�� �Է¹޾� �ִ�, �ּڰ��� ���ϴ� ���α׷�
		// 1) ����ڰ� ù��°�� �Է��� ���� max, min�� �ʱⰪ ����
		// if (i == 0) max = n; min = n
		
		// 2) max: ��û ���� ��, min: ��û ū ���� �־
		// i == 0�� �� ������ �ʱ�ȭ �� �� �ְ� ����
//		int max = Integer.MIN_VALUE; // -2^31 // �ִ� ���� ����
//		int min = Integer.MAX_VALUE; // 2^31-1 // �ּڰ� ���� ����
//		int n = 0; // ����� �Է� ������
//		int i = 0; // �ݺ� Ƚ��
//		
//		while(i < 5) {
//			System.out.print("���� �Է�: ");
//			n = sc.nextInt();
////			if(i == 0) {
////				max = n;
////				min = n;
////			}
//			
////			// ����ڰ� ���� ó�� �����͸� �Է����� ��
//			if(max < n) max = n;
//			//if(min > n) min = n;
//			i++;
//		}
//		System.out.println(max);
//		System.out.println(min);
		
		// Q5. 1 ~ 10 �߿��� 3�� ����� ����ϴ� ���α׷�
//		int i = 1;
//		
//		while(i < 11) {
//			if(i % 3 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		int i = 1;
		
		while(i < 11) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		// Q6. ����ڿ��� ���� �ϳ� (���ĺ�, ����, Ư������ ��� ����)�� 
		// �Է¹޾� 'q' ���ڰ� ������ ������ �Է¹��� ���ڸ� �ϳ��� 
		// ���ڿ��� �ٲٴ� ���α׷� (while(true) + break ����)
		// ex) 'a' 'b' 'c' '1' 'd' 'q' => "abc1d"
		// �߰����� 1) ���ڿ��� �������� �����ϰ� �� �� �������?
		// 'a' 'b' 'c' '1' 'd' 'q' => "d1cba"
		
		// Q7. ����ڿ��� n�� �Է¹޾� n! (factorial)�� ���ϴ� ���α׷�
		// (n! = 1 x 2 x 3 x 4 ... n)
		// ex) 1
		// 1! = 1
		// ex) 3
		// 1 x 2 x 3
		
		
		
	}

}
