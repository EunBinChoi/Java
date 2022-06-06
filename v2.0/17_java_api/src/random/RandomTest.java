package random;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Random(): 호출할 때마다 seed가 다르게 설정 (현재 시스템 시간)
		// Random(long seed): 매개값으로 주어진 seed로 설정
		// * seed (씨드): 난수를 생성하기 위한 기초 값 (수학식을 이용해서 난수를 생성)
		
		int[] selectNumber = new int[6];
		Random random1 = new Random(5);
		for(int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = random1.nextInt(45) + 1; // 1 <=   < 46
		}
		System.out.println(Arrays.toString(selectNumber));
		
		int[] winNumber = new int[6];
		Random random2 = new Random(5);
		for(int i = 0; i < winNumber.length; i++) {
			winNumber[i] = random2.nextInt(45) + 1; // 1 <=   < 46
		}
		System.out.println(Arrays.toString(winNumber));
		System.out.println(Arrays.equals(selectNumber, winNumber));
		// 일차원 배열에서 equals() -> 원소값 비교 (arr1_1d[i] == arr2_1d[i])
		
		// 이차원 배열에서 equals() -> 주소값 비교 (arr1_2d[i] == arr2_2d[i])
		//          deepEquals() -> 원소값 비교 (arr1_2d[i][j] == arr2_2d[i][j])
	}

}
