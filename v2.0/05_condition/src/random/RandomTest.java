package random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* �������� �����ϴ� ���
		 * 1. Random Ŭ����
		 * import java.util.Random
		 * 
		 * 2. Math Ŭ���� (**)
		 * : ���а� ���õ� �Լ� ���� Ŭ����
		 * : import ���� �ʾƵ� ���� ���α׷� �� �̹� import �Ǿ�����
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
