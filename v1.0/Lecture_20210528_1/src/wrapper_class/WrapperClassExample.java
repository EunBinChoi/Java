package wrapper_class;

public class WrapperClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Boxing (���� �ڷ��� -> ��ü)
		Integer obj1 = new Integer(100); // ��� �������� ����
		Integer obj2 = new Integer("100"); // ��� �������� ����
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = Integer.valueOf("100");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		// Unboxing (��ü -> ���� �ڷ���)
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		int value4 = obj4.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		// �ڵ� �ڽ�, ��ڽ�
		Integer obj5 = 100; // �ڵ� �ڽ�
		int value5 = obj5; // �ڵ� ��ڽ�
		
		// Wrapper Ŭ���� ��ü�� ��
		Integer obj6 = 300; // �ڵ� �ڽ�
		Integer obj7 = 300; // �ڵ� �ڽ�
		System.out.println(obj6 == obj7); // �ּҰ��� �ٸ�
		System.out.println(obj6.equals(obj7)); // ���밪�� ����
		System.out.println(obj6.intValue() == obj7.intValue());
		
		// ���� �����ϼ��� (0�� ��������) �����󵵰� ����
		// -128 ~ 127�� ������ �ּҸ� ����Ű�� ��
		// -128 ~ 127�� �̹� �޸𸮿� ����Ǿ�����
		Integer obj8 = 10;
		Integer obj9 = 10;
		System.out.println(obj8 == obj9); // �ּҰ��� �ٸ�
		System.out.println(obj8.equals(obj9)); // ���밪�� ����
		System.out.println(obj8.intValue() == obj9.intValue());
		
		
		// String -> int, float, double
		// "parse + �⺻Ÿ��" (���� �޼ҵ�)
		// ���ڿ��� �Ű������� �޾� �⺻ Ÿ������ ��ȯ
		int value6 = Integer.parseInt("10");
		double value7 = Double.parseDouble("3.14");
		boolean value8 = Boolean.parseBoolean("true");
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
	}

}
