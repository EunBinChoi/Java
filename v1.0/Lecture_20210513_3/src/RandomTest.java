import java.util.Random;
public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * �������� �����ϴ� ���
		 * 1. Random Ŭ����
		 * import java.util.Random
		 * 
		 * 2. Math Ŭ���� (**)
		 * : import �������� �����ŵ� �⺻������
		 * : ���� �ڵ� ������ import �Ǿ�����
		 * 
		 * */
		
//		Random rand = new Random();
//		System.out.println(rand.nextBoolean());
//		// true or false
//		System.out.println(rand.nextFloat());
//		// 0.0 <=       < 1.0
//		System.out.println(rand.nextDouble());
		// 0.0 <=       < 1.0
//		System.out.println(rand.nextInt());
//		// 4byte = 32bit
//		// int�� ǥ���� �� �ִ� 2^32��
//		System.out.println(rand.nextInt(100));
//		// 0 <=    < 100
		
//		int random = (Math.random())
		// 0.0 <= Math.random() < 1.0 (double �� ��ȯ)
		// 0.0 <= (Math.random() * 45) < 45.0
		// 1.0 <= (Math.random() * 45) + 1 < 46.0
		// 1 <= (int)((Math.random() * 45) + 1) < 46
		
		// 0 <= (int)(Math.random()) < 1
		// 0 <= (int)(Math.random() * 45) < 45 // 0 ~ 44
		// 1 <= (int)(Math.random() * 45) + 1 < 46 // 1 ~ 45
		
		int a, b, c, d, e, f;
		a = (int)(Math.random() * 45 + 1);
		b = (int)(Math.random() * 45 + 1);
		c = (int)(Math.random() * 45 + 1);
		d = (int)(Math.random() * 45 + 1);
		e = (int)(Math.random() * 45 + 1);
		f = (int)(Math.random() * 45 + 1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
		
		/* 1. 
		 * 1 ~ 10 ������ ������ �ϳ� �����Ͽ�
		 * 1 ~ 4 "����"
		 * 5, 6 "�߰�"
		 * 7 ~ 10 "ŭ"
		 */
		 
		
		// 1. 
		// 0.0 <= Math.random() < 1.0
		// 0.0 <= Math.random() * 10 < 10.0
		// 0 <= (int)(Math.random() * 10) < 10
		// 1 <= (int)(Math.random() * 10) + 1 < 11
		
		int num = (int)(Math.random() * 10) + 1;
		if (num <= 4) {
			System.out.println("����");
		}
		// num > 4
		else if(num <= 6) {
			System.out.println("�߰�");
		}
		// num > 6
		else {
			System.out.println("ŭ");
		}
		
		/* 2. �ֻ����� �ѹ� ������ ������ ���� ���
		 * (�ֻ����� ������ü�� �Ǿ��ְ� 1 ~ 6������ �� ����)
		 * */
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println("�ֻ��� �� : " + dice);
	}

}
