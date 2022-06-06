package sms;

import java.util.Scanner;

public class SMSTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[5];
		// 5명의 성적을 저장할 수 있는 배열 (자바 스타일)
		// 여기서 대괄호는 scores라는 변수가 일반 int형 변수가 아니고
		// int[]형 변수 (int형 데이터를 여러개 저장할 수 있는 배열)
		
//		int scores[] = new int[5]; 
		// C언어 스타일 배열 선언
		
		// new int[5]: 메모리 공간 (힙)에 int형 할당할 수 있는 5칸을 만듦
		// new는 배열의 원소가 다음과 같이 초기화 됨
		// - int: 0
		// - double/float: 0.0/0.0f
		// - boolean: false
		// - char: null
		
		// 배열에서 각 원소를 접근하는 방법
		// 인덱스 (index): 원소의 순번 (0번부터 시작)
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("%d번 학생 성적 입력: ", i+1);
			scores[i] = sc.nextInt();
		}
//		scores[0] = 90;
//		scores[1] = 85;
//		scores[2] = 95;
//		scores[3] = 60;
//		scores[4] = 70;
//		scores[5] = 60; // ArrayIndexOutOfBounds
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) { // 인덱스 접근
			sum += scores[i];
		}
		System.out.println("평균 : " 
		+ (double)sum / scores.length);
		
		// Q1. 성적 중에 최댓값, 최솟값
		
		// 학생 성적을 저장
		int min = scores[0]; // 최솟값을 scores[0]이라고 가정
		int max = scores[0]; // 최댓값을 scores[0]이라고 가정
		
		// 학생 번호를 저장
		int min_index = 0; // 최소 성적을 가진 학생 번호가 0이라고 가정
		int max_index = 0; // 최대 성적을 가진 학생 번호가 0이라고 가정
		for(int i = 1; i < scores.length; i++) {
//			score = sc.nextInt();
//			if(i == 0) {
//				min = score;
//				max = score;
//			}
			
			if(max < scores[i]) {
				max = scores[i]; 
				max_index = i;
			}
			if(min > scores[i]) {
				min = scores[i]; 
				min_index = i;
			}
		}
		System.out.printf("[최저 점수] 학생 번호: %d, 점수: %d입니다.\n", 
				min_index+1, min);
		System.out.printf("[최고 점수] 학생 번호: %d, 점수: %d입니다.\n", 
				max_index+1, max);
		
		// Q2. 성적 중에 TOP3
		// 1) TOP3 학생 번호도 같이 출력
		// 2) 이중 반복문으로 바꿔보기
		
		// 1)
//		int[] top = new int[3]; // 0: top1, 1: top2, 2: top3
//		int[] top_index = new int[3];
//		top[0] = max; // top1의 성적
//		top[1] = min; // top2의 성적
//		top[2] = min; // top3의 성적
//		top_index[0] = max_index; // top1의 성적을 가진 학생 번호
//		top_index[1] = min_index; // top2의 학생 번호
//		top_index[2] = min_index; // top3의 학생 번호
//		
//		// top2
//		for(int i = 0; i < scores.length; i++) {
//			if(top[1] < scores[i] && scores[i] != top[0]) {
//				top[1] = scores[i];
//				top_index[1] = i;
//			}
//		}
//		
//		// top3
//		for(int i = 0; i < scores.length; i++) {
//			if(top[2] < scores[i] 
//					&& scores[i] != top[0] 
//							&& scores[i] != top[1]) {
//				top[2] = scores[i];
//				top_index[2] = i;
//			}
//		}	
		
		// 2)
		int[] top = new int[scores.length];
		int[] top_index = new int[scores.length];
		int[] scores_copy = new int[scores.length]; 
		
		for(int i = 0; i < top.length; i++) {
			scores_copy[i] = scores[i];
		}
		
		for(int i = 0; i < top.length; i++) {
			// 첫번째 학생의 성적이 가장 클 것이라고 가정
			top[i] = scores_copy[0]; // top 성적
			top_index[i] = 0; // top 학생 번호
			
			// 나머지 학생 성적이랑 비교를 하면서
			// 첫번째 학생보다 더 큰 놈이 있으면
			// top을 업데이트
			for(int j = 1; j < scores_copy.length; j++) {
				if(top[i] < scores_copy[j]) {
					top[i] = scores_copy[j];
					top_index[i] = j;
				}
			}
			scores_copy[top_index[i]] = -1;
		}
		
		for(int i = 0; i < scores_copy.length; i++) {
			System.out.print(scores_copy[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < top.length; i++) {
			System.out.printf("[ranking %d] "
					+ "학생번호: %d 성적: %d\n", 
					i+1, top_index[i]+1, top[i]);
		}
		
//		 Q3. 학점 계산
//		 90점 이상 => 'A'
//		 80점 이상 ~ 90점 미만 => 'B'
//		 70점 이상 ~ 80점 미만 => 'C'
//		 60점 이상 ~ 70점 미만 => 'D'
//		 이외 성적 => 'F'
		
		char[] grades = new char[scores.length]; // 5명 학생의 학점 저장
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 90) {
				grades[i] = 'A';
			}
			else if(scores[i] >= 80) {
				grades[i] = 'B';
			}
			else if(scores[i] >= 70) {
				grades[i] = 'C';
			}
			else if(scores[i] >= 60) {
				grades[i] = 'D';
			}
			else {
				grades[i] = 'F';
			}
			System.out.printf("[%d번째 학생] 성적: %d, 학점: %c\n",
					i+1, scores[i], grades[i]);
		}
	}

}
