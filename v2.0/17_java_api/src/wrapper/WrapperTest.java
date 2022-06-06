package wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Wrapper Ŭ����
		// : ���� �ڷ����� ���ΰ� �ִ� Ŭ����
		// : ���� �ڷ����� �ʿ��� �޼��带 �����ϱ� ����
		
		Integer i1 = new Integer(10); // �������� ����, Boxing
		Integer i2 = 10;			  // Boxing
		Integer i3 = 10;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		// -128 ~ 127�� ��� �󵵰� ���Ƽ� �̹� �޸𸮿� ���� (�ּ� ����)
		System.out.println(i2 == i3); // �ּҰ� 
		System.out.println(i2.equals(i3)); // ���밪
		
		// 300�� �̹� �޸𸮿� ����Ǿ����� ���� (�ּ� ���� X)
		Integer i4 = 300; // new Integer(300);
		Integer i5 = 300; // new Integer(300);
		System.out.println(i4 == i5); // �ּҰ�
		System.out.println(i4.equals(i5)); // ���밪
		
		int i6 = i1.intValue(); // Unboxing
		int i7 = i2;
		
		
		/////////////////////////////////////////////////
		// String -> int, float, double
		String s = "300";
		int si = Integer.parseInt(s); // "300" -> 300
		s = "3.14";
		double sd = Double.parseDouble(s); // "3.14" -> 3.14
		float sf = Float.parseFloat(s); // "3.14" -> 3.14f
	}

}
