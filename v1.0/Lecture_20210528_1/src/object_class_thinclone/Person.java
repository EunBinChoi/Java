package object_class_thinclone;

public class Person implements Cloneable {
	// Ŭ���� �����ڰ� ������ ����Ѵٴ� �ǵ����� ǥ��
	// clone() �Լ��� ����� �� ����
	
	
	String name;
	int age;
	String gender;
	int[] scores;
	
	/*
	 * Person p1 = new Person();
	 * Person p2 = new Person();
	 * 
	 * p1 == p2 // �ּҰ��� ��
	 * p1.equals(p2) // ���� ��
	 * 
	 * String s1 = new String();
	 * String s2 = new String();
	 * */
	
	public Person(String n, int a, String g, int[] s) {
		name = n;
		age = a;
		gender = g;
		scores = s;
	}
	
	public Person getPerson() {
		Person cloned = null;
		try {
			// �⺻������ clone() �Լ��� ���� ����
			cloned = (Person)clone(); // Object Ŭ���� ��ȯ
		}
		catch(CloneNotSupportedException e) {
			System.out.println(e);
		}
		return cloned;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			if(this.name.equals(((Person)obj).name) && 
					this.age == ((Person)obj).age &&
					this.gender.equals(((Person)obj).gender)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("�̸� : %s, ���� : %d, ���� : %s, "
				+ "����: %d %d %d", 
				name, age, gender, scores[0], scores[1], scores[2]);
	}
}
