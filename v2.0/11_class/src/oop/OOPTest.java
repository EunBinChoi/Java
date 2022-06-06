package oop;

public class OOPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ��ü���� ���α׷��� (Object-Oriented Programming) 
		 * 
		 * Ŭ����: ������ (�ʵ�, �������) + �Լ� (�޼���)
		 * ex) �ڵ��� ����
		 * Ŭ����: �ڵ��� ���赵
		 * ��ü: �ڵ��� (���� �ൿ�ϰ� �����ϴ� ����)
		 * 
		 * ��ü���� 3�� Ư¡
		 * 1) ĸ��ȭ (encapsulation, ���� ����) 
		 * + setter (��ȯ�� void), getter (��ȯ�� ����)
		 * set�ʵ��̸�, get�ʵ��̸� (*�ʵ��̸��� ù���ڴ� �빮��)
		 * 
		 * 
		 * 	- ���� ������
		 *  a. public: ��� Ŭ���� ���� ����
		 *  b. protected: ��� ���� ���� ����
		 *  c. private: ���� Ŭ���������� ���� ����
		 *  
		 * 2) ��� (inheritance)
		 * 3) ������ (polymorphism)
		 * */
		
		// Ŭ������ �ϳ��� ������ Ÿ��
		Person p1 = new Person(); // ��ü ����
//		p1.name = "ȫ�浿";
//		p1.age = -1;
//		p1.age = -100;
		
		p1.setName("ȫ�浿");
//		System.out.println(p1.age);
		p1.setAge(-1);
//		System.out.println(p1.age);
		System.out.println(p1.getAge());
		
		// addAge �Լ��� ���� 3�� ���� ȫ�浿 ���̴�?
		p1.addAge(3);
		p1.changeName("ȫ���");
		
//		p1.email = "qwer@gmail.com";
		p1.setEmail("qwer@gmail.com");
		p1.changeEmail("qwert@gmail.com");
		
		System.out.println(p1); // ���� ����
		
		Person p2 = new Person();
//		p2.name = "ȫ���";
		p2.setName("ȫ���");
		
		Person manager = new Person();
		Person employee = new Person();
		
		// 1) manger, employee �̸�, ����, ��å�� �����Ͻÿ�.
		manager.setName("��Ŵ���");
		manager.setAge(35);
		manager.setPosition("manager");
		
		employee.setName("����ƮŸ��");
		employee.setAge(20);
		employee.setPosition("part-time");
		
		// 2)
		int age = employee.getAge();
		System.out.println(age); // 20
		
//		System.out.println(employee.getAge());
		employee.setAge(-100); 
		// setAge() �Լ� ������ ��ȿ�� �˻翡�� Ż��! (-100�� ����� �ƴϱ� ����)
		
		age = employee.getAge();
		System.out.println(age); // 20
		
		// 3)
		Person employee2 = new Person();
		employee2.setName("����ƮŸ��");
		
		System.out.println(employee == employee2); // false
		// �ּҰ� �� (new�� ���� ���ο� �ּ� �Ҵ� -> false)
		
		// �̸��� �������� Ȯ��
		System.out.println(employee.getName().equals(employee2.getName()));
		
		// 4) manager�� ����, �̸����� ����, Ȯ��
		manager.setGender("male");
		manager.setEmail("abc@naver.com");
		
		String gender = manager.getGender();
		System.out.println(gender);
		
		String email = manager.getEmail();
		System.out.println(email);
		
		// 5) employee�� ����, �̸����� ����, Ȯ��
		employee.setGender("female");
		employee.setEmail("aaa@naver.com");
		
		gender = employee.getGender();
		System.out.println(gender);
		
		email = employee.getEmail();
		System.out.println(email);
		
		// 6) ���� (male, female)�� �ƴ� �ٸ� ������ ���� ��� ���� ���
		employee.setGender("fem");
		gender = employee.getGender(); // female
		System.out.println(gender);
		
		// 7) �̸��Ͽ� @�� ���� �̻��� �̸����� ���� ��� ���� ���
		employee.setEmail("qwe");
		email = employee.getEmail();
		System.out.println(email);
		
	}
}
