package generic;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ü �����ÿ� ���ʸ��� Ÿ���� ����
		// ���ʸ� Ÿ������ ���� �ڷ����� �� �� ���� (**)
		// ex) Box<int>, Box<double> ...
//		Box<String> b = new Box<String>();
		Box<String> b = new Box<>();
		// �����Ϸ��� ������ ���� ���� ����
		
		b.setItem("String Item");
		String s = b.getItem();
			
		///////////////////////////////////
		
		Box<Integer> bi = new Box<>();
		
		bi.setItem(100);
		int i = bi.getItem(); // �ڵ� ��ڽ�
			
		/////////////////////////////////
		
		Box<SmartPhone> bs = new Box<SmartPhone>();
		
		bs.setItem(new SmartPhone());
		System.out.println(bs.getItem());
		
		SmartPhone sp = bs.getItem();
		
		/////////////////////////////////////////
		int iii = 10;
		Integer ii = iii; // int -> Integer (�ڵ� �ڽ�)
		int iiii = ii;   // Integer -> int (�ڵ� ��ڽ�)
	}

}
