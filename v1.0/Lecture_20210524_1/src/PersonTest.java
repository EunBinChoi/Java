
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��ü ����: new
		// Ŭ���� �̸� ��ü �̸� = new Ŭ���� �̸�()
		Person p = new Person();
		Person p2 = new Person("������", "881234-11111111");
		Person p3 = new Person("������", 34, "881234-11111111",
				"Female", "qwer7823@gmail.com", 165, 50);
		
		//p3.height = -1;
		p3.printHeight();
		p3.changeHeight(-1);
		p3.printHeight();
		System.out.println();
		
		p3.printWeight();
		p3.changeWeight(-100);
		p3.printWeight();
		System.out.println();
		
		p3.printAge();
		p3.incAge(-3);
		p3.printAge();
		System.out.println();
		//System.out.println(p3.height);
		
//		System.out.println(p2.name);
//		System.out.println(p2.regNum);
//		
//		
//		// ������ �ʱ�ȭ
//		p.name = "������";
//		p.age = 30;
//		p.regNum = "901234-1234567";
//		p.gender = "Female";
//		p.email = "qwertyuiop7823@gmail.com";
//		p.height = 163;
//		p.weight = 50;
		// ��ü�� ������ �ִ� �Ӽ��� �����ϰ� ���� ��: . (dot) ������
		
		p.changeName("ȫ�浿");
		p.incAge(3);
		p.changeEmail("qwer7823@gmail.com");
		p.changeHeight(165);
		p.changeWeight(53);
		
//		System.out.println("�̸� : " + p.name);
//		System.out.println("���� : " + p.age);
//		System.out.println("���� : " + p.gender);
//		System.out.println("�̸��� : " + p.email);
//		System.out.println("�ֹε�Ϲ�ȣ: " + p.regNum);
//		System.out.println("ü�� : " + p.weight);
//		System.out.println("���� : " + p.height);
		
		
		// 1. incAge �Լ��� ã��
		// 2. rate = 3
		// 3. age = 30 + 3
		// 4. return age
		// 5. a = age;
		//System.out.println(a);
		
		// 1. changeName �Լ��� ã��
		// 2. newName = "ȫ�浿"
		// 3. name = newName
		
		// newName: �Ű� ���� (parameter)
		// "ȫ�浿": �μ� (argument)
		
		/*
		 * void changeName(String newName) {
			name = newName;
		}
		 * 
		 * */
		//System.out.println(p.name);
		
	}
	

}
