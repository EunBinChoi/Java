import java.util.Scanner;
public class ArrayTest {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		
		/*
		 * 데이터 타입
		 * - 기본 타입: int, double, float, char, boolean ..
		 * - 참조 타입: 배열, String, 클래스 ..
		 * 	(변수에는 주소값을 담고 있음)
		 * 
		 * 배열: "동일한 자료형"을 같은 이름으로 참조하고 싶을 때
		 * cf) String, int, double 그룹핑 => 클래스의 객체
		 * 
		 * ex) int[] scores = new int[40]; // 배열의 크기
		 * 
		 * scores[0] // 0번째 원소 ~ scores[39] // 39번째 원소
		 * scores (배열 이름): 주소값 (scores[0]의 주소값)
		 * 
		 * scores1, scores2, scores3, scores4, scores5
		 * 
		 * 
		 * */
		
		// 1. 5명의 성적을 입력받아 배열에 저장하고 
		// 5명의 성적 평균을 구하는 프로그램
		
		// 2. 성적 중에 최댓값, 최솟값을 구하는 프로그램
		
		// 3. 성적 중에 top 3를 구하는 프로그램
		// (학생의 성적 중에 동일한 성적은 없다고 가정)
		
		// 4. 90점 이상 => 'A'
		//    80점 이상 => 'B'
		//    70점 이상 => 'C'
		//    60점 이상 => 'D'
		//    이외 성적 =>  'F'
		// 판단하는 프로그램을 작성하고
		// A ~ F 학점을 받을 학생은 각각 몇 명인지 출력하시오.
		
		
	//	final int STUDENT = 5;
//		
//		// 1. new 사용하는 방법
	//	int[] scores = new int[STUDENT];
//		
//		
//		// 2. 배열을 선언하자마자 데이터를 초기화하는 경우 (new 사용 x)
//		// {}를 이용하셔서 데이터를 초기화할 수 있음
//		// 데이터가 정해져있는 경우 (입력변수 x)
//		String[] month = {"jan", "feb", "mar"};
//		month[0] = "Jan";
//		
//		// for-each 루프
////		for(String str : month) {
////			System.out.println(str);
////		}
//		
		Scanner input = new Scanner(System.in);
////		scores[0] = 10;
////		scores[1] = 20;
////		scores[2] = 30;
////		scores[3] = 40;
////		scores[4] = 50;
////		score
//		
//		for(int i = 0; i < scores.length; i++) {
//			System.out.printf("학생 %d의 성적을 입력하시오: ", i);
//			scores[i] = input.nextInt();
//		}
////		System.out.println(scores[0]);
////		System.out.println(scores[3]);
////		System.out.println(scores[5]);
////		System.out.println(scores[10]); // 0 ~ 9
//		for(int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
//		// scores 데이터의 합계, 평균
//		int sum = 0;
//		for(int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + (double)sum / scores.length);
//	
//		// 배열이 없는 버전
//		// 1  2  3  4  5
//		// 10 20 30 40 50
//		int grade, total = 0;
//		for(int i = 0; i < STUDENT; i++) {
//			System.out.print("학생의 성적을 입력하시오 : ");
//			grade = input.nextInt();
//			total += grade;
//		}
//		//System.out.println(grade);
//		
//		System.out.println("합계 : " + total);
//		System.out.println("평균 : " + (double)total / STUDENT);
//	
		// 로또 자동 생성기
		// 6개 1 ~ 45
//		int[] lotto = new int[6];
//		// lotto[0] ~ lotto[5]
//		// Math.random() 
//		// Math, Random
//		// 클래스 = 데이터 + 함수
//		// 클래스 이름.함수 이름
//		// 버전 1
//		for(int i = 0; i < lotto.length; i ++) {
//			lotto[i] = (int)(Math.random() * 45) + 1;
//			System.out.println(lotto[i]);
//		}
//		
//		// 버전 2
//		// 데이터를 0 ~ lotto.length-1 할당해주고
//		for(int i = 0; i < lotto.length; i ++) {
//			lotto[i] = (int)(Math.random() * 45) + 1;
//		}
//		// 한꺼번에 출력
//		for(int i = 0; i < lotto.length; i ++) {
//			System.out.println(lotto[i]);
//		}
//		
//		// 각 원소끼리 덧셈, 뺄셈한 결과를 배열에 저장하고 이를 출력해주세요!
//		int[] a = {10, 20, 30};
//		int[] b = {30, 40, 50};
//		int[] add = new int[a.length];
//		int[] sub = new int[a.length];
//		
//		for(int i = 0; i < a.length; i ++) {
//			add[i] = a[i] + b[i];
//			sub[i] = a[i] - b[i];
//		}
//		
//		for(int i = 0; i < a.length; i ++) {
//			System.out.printf("add[%d] = %d\n", i, add[i]);
//		}
//		
//		for(int i = 0; i < a.length; i ++) {
//			System.out.printf("sub[%d] = %d\n", i, sub[i]);
//		}
		
		
		// 이차원 배열
//		int[][] scores = new int[3][5];
//		Scanner input = new Scanner(System.in);
//		String[] subject = {"국어", "수학", "사회", "과학", "영어"};
//		
//		for(int i = 0; i < scores.length; i++) {
//			System.out.printf("=== 학생 %d 성적 입력 ===\n", i);
//			
//			for(int j = 0; j < scores[i].length; j++) {
//				System.out.printf("%s 과목의 성적을 입력하시오 : ", 
//						subject[j]);
//				scores[i][j] = input.nextInt();
//			}
//		}
		
		int row, col;
		System.out.print("행 입력 : ");
		row = input.nextInt();
		
		System.out.print("열 입력 : ");
		col = input.nextInt();
		
//		int[] arr_1d = new int[row * col];
//		int[][] arr_2d = new int[row][col];
//		
//		for(int i = 0; i < row * col; i ++) {
//			arr_1d[i] = i + 1;
//		}
//		for(int i = 0; i < row * col; i ++) {
//			System.out.println(arr_1d[i]);
//		}
		// arr_1d 값을 이용해서 => arr_2d 바꿔보세요
		
		
		
		// 두 이차원 배열 (arr1, arr2)의 비교
		// 1. arr1.length == arr2.length
		//    arr1[0].length == arr2[0].length
		
		// 2. 각각의 내용물이 동일해야함
		
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		
		// arr1 데이터 초기화
		// 행의 길이
		for(int i = 0; i < arr1.length; i++) {
			// 열의 길이
			for(int j = 0; j < arr1[i].length; j ++) {
				arr1[i][j] = i + j;
			}
		}
		// arr2 데이터 초기화
		// 행의 길이
		for(int i = 0; i < arr2.length; i++) {
			// 열의 길이
			for(int j = 0; j < arr2[i].length; j ++) {
				arr2[i][j] = i + j;
			}
		}
		
		// 배열 비교
		System.out.println(arr1 == arr2); 
		// 배열 이름끼리 비교 (주소값의 비교)
		
		// 1. 배열의 내용물끼리 비교
		// 두 배열이 동일한지 비교
		// boolean compare(int[][] arr1, int[][] arr2)
		
		// 2. 두 배열의 덧셈 (addArray), 뺄셈 (subArray)을 한 결과 저장
		// int[][] add(int[][] arr1, int[][] arr2)
		// int[][] sub(int[][] arr1, int[][] arr2)
		
		
		// 3. 두 배열의 곱셈 (mulArray)한 결과 저장 (**)
		// int[][] mul(int[][] arr1, int[][] arr2)
		// (2 x 3)(3 x 2) => (2 x 2)
		
//		// 이차원 배열 덧셈, 뺄셈
//		int[][] a = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
//		int[][] b = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
//		int[][] add = new int[a.length][a[0].length];
//		int[][] sub = new int[a.length][a[0].length];
//		int[][] mul = new int[a.length][b[0].length];
//		
//		// a = (i * k)
//		// b = (k * j)
//		// c = (i * j)
//		
//		// 곱셈의 결과
//		for(int i = 0; i < a.length; i ++) { // mul 행렬의 행
//			for(int j = 0; j < b[0].length; j++) { // mul 행렬의 열
//				for(int k = 0; k < a[0].length; k++) {
//					mul[i][j] += (a[i][k] * b[k][j]);
//				}
//				// mul[0][0] = a[0][0] * b[0][0]
//				//           + a[0][1] * b[1][0]
//				//           + a[0][2] * b[2][0]
//				
//				// mul[0][1] = a[0][0] * b[0][1]
//				//           + a[0][1] * b[1][1]
//				//           + a[0][2] * b[2][1]
//			}
//		}
//		
//		for(int i = 0; i < mul.length; i++) {
//			for(int j = 0; j < mul[i].length; j++) {
//				System.out.printf("%5d ", mul[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		for(int i = 0; i < a.length; i ++) {
//			for(int j = 0; j < a[0].length; j ++) {
//				add[i][j] = a[i][j] + b[i][j];
//				sub[i][j] = a[i][j] - b[i][j];
//			}
//		}
//		// 덧셈의 결과
//		for(int i = 0; i < add.length; i ++) {
//			for(int j = 0; j < add[0].length; j ++) {
//				System.out.println(add[i][j]);
//			}
//		}
//		// 뺄셈의 결과
//		for(int i = 0; i < sub.length; i ++) {
//			for(int j = 0; j < sub[0].length; j ++) {
//				System.out.println(sub[i][j]);
//			}
//		}
//		
//		// 배열의 복사
//		// 배열의 이름에는 데이터의 저장위치 (주소)가 저장
//		int[] ma = {10, 20, 30};
//		int[] mb = ma; // 주소값의 복사
//		System.out.println(ma);
//		System.out.println(mb);
//		
//		// 내용의 복사
//		// 각 원소를 대입
//		// mc = ma (x, 주소값의 복사)
//		int[] mc = new int[ma.length];
//		System.out.println(mc);
//		
//		for(int i = 0; i < ma.length; i ++) {
//			mc[i] = ma[i];
//			System.out.print(mc[i] + " ");
//		}
		
		/*
		 * 참조변수에서 ==, !=
		 * ma == mc: 주소가 같다
		 * ma != mc: 주소가 다르다
		 * 
		 * 그럼 주소값이 아니라 내용물이 같은지 확인하려면?
		 * 그럼 주소값이 아니라 내용물이 다른지 확인하려면?
		 * 
		 * */
//		System.out.println();
//		int[][] matrixA = {{1, 2, 3}, {4, 5, 6}}; // 2 X 3
//		int[][] matrixB = {{1, 2, 3}, {4, 5, 6}}; // 2 X 3
//		int[][] matrixC = {{1, 2, 4}, {5, 6, 7}}; // 2 X 3
//		
//		// 1) matrixA와 matrixB가 내용물이 같은지 확인해주세요!
//		boolean checker = true;
//		int i, j;
//		for(i = 0; i < matrixA.length; i++) {
//			for(j = 0; j < matrixA[0].length; j++) {
//				if(matrixA[i][j] != matrixB[i][j]) {
//					checker = false;
//					break; // 내부 for문 종료
//				}
//				
//			} // 내부 for
//			if (j < matrixA[0].length) {
//				break; // 외부 for문 종료
//			}
//		} // 외부 for
//		
//		System.out.println((checker == true)? 
//				"두 행렬은 같습니다." : "두 행렬은 다릅니다." );
////		if(checker == true) {
////			System.out.println("두 행렬은 같습니다.");
////		}
////		else {
////			System.out.println("두 행렬은 다릅니다.");
////		}
//		
//		
//		// 2) matrixA와 matrixC가 내용물이 다른지 확인해주세요!
//		
//		// 3) matrixA와 matrixB가 주소값이 같은지 확인해주세요!
//		// matrixB = matrixA;
//		System.out.println((matrixA == matrixB) ?
//				"주소가 동일합니다." : "주소가 동일하지 않습니다.");
	
	}
	
}
