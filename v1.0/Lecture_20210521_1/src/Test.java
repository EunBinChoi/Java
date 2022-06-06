import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candfreq = new int[10];
		
		// 후보자: 10명
		// 인덱스 (0 1 2 3 ....  9) : 후보자 번호 (1 ~ 10) - 1
		// 원소: 후보자의 득표수
		
		// 0번 후보자 빈도수
		// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		// new 값 0으로 초기화되어있음
		Scanner input = new Scanner(System.in);
		
		while(true) {
			for(int i = 0; i < 10; i ++) {
				System.out.print((i + 1) + " ");
				System.out.print(candfreq[i] + " ");
				System.out.println();
			}
			System.out.print("후보자의 번호를 입력하시오 : (종료 -1) ");
			int choice = input.nextInt();
			if (choice == -1) break;
			candfreq[choice - 1]++; // **
		}
		
	}

}
