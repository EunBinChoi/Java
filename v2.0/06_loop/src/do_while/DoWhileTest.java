package do_while;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ݺ���: while(**), do while, for(*****)
		
//		do {
//			����
//		} while(���ǽ�); // ������ �����ݷ� ����
		
		// 1) �ϴ� ������ ���� ���� (���� ��/������ ������� �ѹ� ������ �����)
		// 2) ���ǽ��� �ݺ��� ������ �˻�
		
		int i = 0;
		do {
			System.out.println("hello! " + i);
			i++;
		} while(i < 3);
		System.out.println(i); // 3
		
		i = 0;
		do {
			System.out.println("hello! " + i);
			i++;
		} while(i > 3); // ���� ����
		System.out.println(i); // 1
		
		// do while() ������ while(true) ��ü ������
		i = 0;
		while(true) {
			System.out.println("hello! " + i);
			i++;
			if(!(i > 3)) break;
		}
	}

}
