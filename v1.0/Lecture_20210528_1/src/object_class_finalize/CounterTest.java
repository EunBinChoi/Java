package object_class_finalize;

public class CounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = null;
		
		for(int i = 1; i <= 20; i ++) {
			c = new Counter(i);
			
			c = null; // �����ϰ� �ִ� ��ü�� ����
			System.gc(); // ������ ������ ȣ��
		}
	}

}
