package overview;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box();
		b.setItem("String Item"); 
		// Object item = "String item";
		
		int s = (int)b.getItem();
		// TODO try ~ catch
		// why? �����Ϸ��� ������ ������!!!!!!!!!! (***)
		// (Object -> int) ����ȯ ����
		
		// ������ ���ִ� �����ʹ� String�̱� ������
		// (String -> int) ����ȯ �Ұ����ؼ� ���� ���� ...!
		
		// String s = item; (Object)
		System.out.println(s);
		
		b.setItem(1);
		int i = (int)b.getItem();
		System.out.println(i);
		
		b.setItem(new SmartPhone());
		SmartPhone sp = (SmartPhone)b.getItem();
		System.out.println(sp); // toString�� ���� X
	}

}
