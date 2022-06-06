package random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 랜덤값을 추출하는 방법
		 * 1. Random 클래스
		 * import java.util.Random
		 * 
		 * 2. Math 클래스 (**)
		 * : 수학과 관련된 함수 정의 클래스
		 * : import 하지 않아도 현재 프로그램 상에 이미 import 되어있음
		 * */
		
		Random rand = new Random();
		System.out.println(rand.nextBoolean()); 
		// true or false
		System.out.println(rand.nextFloat()); 
		// 0.0f <=   < 1.0f
		System.out.println(rand.nextDouble()); 
		// 0.0 <=   < 1.0
		System.out.println(rand.nextInt());
		// -2^31 <=     < 2^31
		System.out.println(rand.nextInt(100));
		// 0 <=    < 100
		System.out.println();
		
		
		double d = Math.random();
		// 0.0 <=  Math.random()  < 1.0
		// 0.0 <=  Math.random() * 50 < 50.0
		// 0 <= (int)(Math.random() * 50) < 50
		System.out.println(d);
		
		int lottoNum = (int)(Math.random() * 45) + 1;
		System.out.println(lottoNum);
		// 1 <=         < 46 ???
		// 0.0 <=  Math.random()  < 1.0
		// 0.0 <=  Math.random() * 45 < 45.0
		// 0 <= (int)(Math.random() * 45) < 45
		// 1 <= (int)(Math.random() * 45) + 1 < 46 
		
		int diceNum = (int)(Math.random() * 6) + 1;
		System.out.println(diceNum);
		// 0.0 <=  Math.random()  < 1.0
		// 0.0 <=  Math.random() * 6 < 6.0
		// 0 <=  (int)(Math.random() * 6) < 6
		// 1 <=  (int)(Math.random() * 6) + 1  < 7

		
	}

}
