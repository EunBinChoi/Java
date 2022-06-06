package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class Array2dTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이차원 배열
		// ex) 학생 5명 존재하고 각 학생당 성적 (국, 수, 사, 과, 영)들을 저장한다고 가정
		
		int[][] scores = new int[5][5];
//		int[][] scores = {{10, 20, 30}, 
//						{10, 20, 30}, 
//						{10, 20, 30}};
		// 사용자한테 입력받기
		// 행의 길이: scores.length
		// 열의 길이: scores[i].length
		
		// scores[0].length == scores[1].length == scores[2].length
		// == scores[3].length == scores[4].length
		
		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i < scores.length; i++) {
////			System.out.printf("학생 %d번의 성적을 순서대로 입력 (국 수 사 과 영) : ", i+1);
//			for(int j = 0; j < scores[i].length; j++) {
//				scores[i][j] = sc.nextInt();
//			}
//		}
//		// 학생 1 ~ 5번, 과목 (국, 수, 사, 과, 영) 
//		
//		// Q1. 학생별 성적 평균
//		// 1) scores.length (행)
//		// 2) scores[0].length (열)
//		double[] stuAvg = new double[scores.length];
//		int sum = 0; // 학생별 성적 누적하기 위한 임시 변수
//		for(int i = 0; i < scores.length; i++) { // 학생 번호 돌면서
//			sum = 0; // sum 초기화
//			for(int j = 0; j < scores[i].length; j++) { // 과목 돌면서
//				sum += scores[i][j];
//			}
//			stuAvg[i] = (double)sum / scores[i].length;
//		}
//		
//		for(int i = 0; i < stuAvg.length; i++) {
//			System.out.printf("%d번 학생 평균: %.2f점\n", i+1, stuAvg[i]);
//		}
//		
//		// Q2. 학생 3번의 영어성적 출력
//		System.out.printf("학생 3번의 영어성적: %d\n", scores[2][4]);
//		
//		// Q3. 과목별 학생의 평균
//		// 1) scores.length (행, 학생 수)
//		// 2) scores[0].length (열, 과목 개수)
//		double[] courAvg = new double[scores[0].length];
//		for(int j = 0; j < scores[0].length; j++) {
//			sum = 0;
//			for(int i = 0; i < scores.length; i++) {
//				sum += scores[i][j];
//			}
//			courAvg[j] = (double)sum / scores.length;
//		}
//
////		String cour = "국어 수학 사회 과학 영어";
//		String[] courName = {"국어", "수학", "사회", "과학", "영어"};
//		for(int i = 0; i < courAvg.length; i++) {
//			System.out.printf("%s 과목 평균: %.2f점\n", courName[i], courAvg[i]);
//		}
//		
//		// Q4. 과목별 최고 성적 받은 학생 번호, 점수 출력
//		// scores.length: 행의 길이 (학생 수)
//		// scores[0].length: 열의 길이 (과목 수)
//		int[] courMax = new int[scores[0].length];
//		// 과목별 최고 성적을 받은 학생 점수
//		int[] courMaxIndex = new int[scores[0].length];
//		// 과목별 최고 성적을 받은 학생 인덱스 번호
//		
//		for(int j = 0; j < scores[0].length; j++) { // 과목을 돌면서
//			courMax[j] = scores[0][j]; 
//			// j번째 과목에서 최대 성적 저장 (초기값: 0번째 학생 성적 최댓값 가정)
//			courMaxIndex[j] = 0;
//			// j번째 과목에서 최대 성적을 가진 학생 인덱스 번호 저장 (초기값: 0번째 학생 가정)
//			for(int i = 1; i < scores.length; i++) { // 학생을 돌면서
//				if(courMax[j] < scores[i][j]) {
//					courMax[j] = scores[i][j];
//					courMaxIndex[j] = i;
//				}
//			}
//			System.out.printf("%s 과목에 대한 최고 성적: %d (학생 번호: %d)\n", 
//					courName[j], courMax[j], courMaxIndex[j]+1);
//		}
		
			
		
		// Q5. 두 배열의 원소가 동일한지 확인
//		Arrays.deepEquals(arr1, arr2);
		// 1) 두 배열의 형태가 동일한지 확인 (행의 길이, 열의 길이)
		// 2) 두 배월의 원소가 동일한지 확인
		int[][] arr1 = {{10, 30, 30}, {40, 50, 60}, {70, 80, 90}};
		int[][] arr2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		
		if(arr1.length != arr2.length) return; // 행의 길이 동일한지 확인
		if(arr1[0].length != arr2[0].length) return; // 열의 길이 동일한지 확인
		
		boolean isEquals = true; // 두 배열의 원소가 같다고 가정
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
//				if(arr1[i][j] == arr2[i][j]) {
//					isEquals = true;
//				}
//				else {
//					isEquals = false;
//					break;
//				}
				if(arr1[i][j] != arr2[i][j]) {
					isEquals = false;
					break; // 내부 반복문만 종료 (1번으로 나감)
				}
			}
			// 1
			if(!isEquals) break; // 외부 반복문도 종료 (2번으로 나감)
		}
		System.out.println(isEquals ? "두 행렬은 같습니다." : "두 행렬은 다릅니다.");
		// 2
		
		
		// Q6. 두 배열의 덧셈 결과 저장하는 배열 (addArr)
		if(arr1.length != arr2.length) return; // 행의 길이 동일한지 확인
		if(arr1[0].length != arr2[0].length) return; // 열의 길이 동일한지 확인
		
		
		int[][] addArr = new int[arr1.length][arr1[0].length];
		for(int i = 0; i < addArr.length; i++) {
			for(int j = 0; j < addArr[i].length; j++) {
				addArr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		// 이차원 배열 형태에 맞게 출력
		for(int i = 0; i < addArr.length; i++) {
			for(int j = 0; j < addArr[i].length; j++) {
				System.out.printf("%3d  ", addArr[i][j]); 
			}
			System.out.println(); // 엔터
		}
		
		// Q7. 두 배열의 뺄셈 결과 저장하는 배열 (subArr)
		if(arr1.length != arr2.length) return; // 행의 길이 동일한지 확인
		if(arr1[0].length != arr2[0].length) return; // 열의 길이 동일한지 확인
		
		int[][] subArr = new int[arr1.length][arr1[0].length];
		for(int i = 0; i < subArr.length; i++) {
			for(int j = 0; j < subArr[i].length; j++) {
				subArr[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		// 이차원 배열 형태에 맞게 출력
		for(int i = 0; i < subArr.length; i++) {
			for(int j = 0; j < subArr[i].length; j++) {
				System.out.printf("%3d  ", subArr[i][j]); 
			}
			System.out.println(); // 엔터
		}
		
		// Q8. 사용자에게 행의 길이, 열의 길이를 입력받아 다음과 같은 1차원 배열을 2차원 배열로 바꿔보세요!
		int row = sc.nextInt(); // 3
		int col = sc.nextInt(); // 3
		int[] arr1d = new int[row * col];
		int[][] arr2d = new int[row][col];
		
		for(int i = 0; i < arr1d.length; i++) {
			arr1d[i] = i * 10;
		}
		for(int i = 0; i < arr1d.length; i++) {
			System.out.printf("%3d  ", arr1d[i]);
		}
		
		// 0 10 20 30 40 50 60 70 80
		System.out.println();
		for(int i = 0; i < arr2d.length; i++) {
			for(int j = 0; j < arr2d[0].length; j++) {
				arr2d[i][j] = arr1d[i * col + j];
			}
		}
		for(int i = 0; i < arr2d.length; i++) {
			for(int j = 0; j < arr2d[0].length; j++) {
				System.out.printf("%3d  ", arr2d[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
