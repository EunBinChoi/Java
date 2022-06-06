package object_class_hashcode;


/* java.lang ��Ű�� 
 * - import ���� �ʾƵ� �⺻���� import
 * 
 * Object
 * - boolean equals(Object obj): ��ü�� ������ �������� Ȯ��
 * - String toString(): ��ü ������ ���ڿ��� ��ȯ (print()�� ȣ��)
 * 
 * 
 * String
 * Math
 * Wrapper
 * 
 * */
public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("ȫ�浿", 35, "Male");
		Person p2 = new Person("ȫ�浿", 35, "Male");
		
		System.out.println(p1 == p2); // �ּҰ�
		System.out.println(p1.equals(p2)); // ���밪
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		p1 = p2;
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.getClass().getName());
		
	}

}
