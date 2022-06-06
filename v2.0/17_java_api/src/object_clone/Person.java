package object_clone;

import java.util.Arrays;

public class Person implements Cloneable {
	// Ŭ������ ������ ����Ѵٴ� �ǹ� (�ǵ����� ǥ��)
	// Object Ŭ������ clone() ����� �� ����
	// ���� Cloneable �������̽��� �������� ���� Ŭ������ clone()�ϸ�
	// CloneNotSupportedException �߻�!
	
	private String name;
	private int age;
	private String gender;
	private int[] scores; // �ʵ忡 �������� �������� �� ��ü clone�� ��� �Ǵ���? 
	// ����, ����, ���� ����
	
	public Person(String name, int age, String gender, int[] scores) {
//		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.scores = scores;
	}
	
	public Person(String name, int age, String gender) {
//		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// ��ü �������� ��ȯ�ϴ� �Լ�
	// ex) pCopy = p.getCloned()
	public Person getCloned() {
		Person cloned = null;
		try {
			cloned = (Person)clone(); 
			// Object Ŭ������ clone()
			// �⺻������ ���� ���� (������ ������ �ʵ�� �ִ� ��쿡 �ּ� ����)
//			pCopy.name = p.name (String)
//			pCopy.age = p.age (int)
//			pCopy.gender = p.gender (String)
//			pCopy.scores = p.scores (int[], scores �ּҰ�)
					
			// CloneNotSupportedException
			// => Cloneable �������̽��� 
			// implements �Ǿ����� ���� Ŭ�������� clone() �Լ� ȣ��
		} catch(CloneNotSupportedException e) {
			System.out.println(e);
		}
		return cloned;
	}
	
	// ���࿡ ���� ������ �Ϸ��� ..?
	// => Object Ŭ������ clone() �Լ� ������
	@Override
	public Object clone() throws CloneNotSupportedException {
		// ���� ����
//		Person cloned = (Person)super.clone();
		Person cloned = new Person(name, age, gender);
//		cloned.scores = this.scores; // ���� ����
		
		// ���� ����
		cloned.scores = new int[scores.length]; 
		// clone.scores���� ���ο� ������ ����
		
		for(int i = 0; i < cloned.scores.length; i++) {
			cloned.scores[i] = scores[i];
			// scores�� �����͸� ����
		}
		////////////////////////////////////////////////
		
		// ���� ����
		// 1) ���� �����ŭ �迭 ���� �Ҵ�
		// 2) ���ο� �迭 ������ ���� ���Ұ� ����
		// 3) cloned ��ü�� scores�� ����Ű�� �ּҰ� ����
//		int[] newScore = new int[cloned.scores.length];
//		for(int i = 0; i < newScore.length; i++) {
//			newScore[i] = cloned.scores[i];
//		}
//		cloned.scores = newScore;
		
//		int[] newScore 
//		= Arrays.copyOf(cloned.scores, cloned.scores.length);
//		cloned.scores = newScore;
//		
		return cloned;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	// equals
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Person)) return false;
		// �� �κ��� ������ ClassCastException�� �� �� ����
		
		return (this.name.equals(((Person)o).name) &&
				this.age == ((Person)o).age &&
				this.gender.equals(((Person)o).gender) &&
				this.scores[0] == ((Person)o).scores[0] &&
				this.scores[1] == ((Person)o).scores[1] &&
				this.scores[2] == ((Person)o).scores[2]);
	}
	// toString
	@Override
	public String toString() {
		return String.format("name = %s, age = %d, gender = %s, "
				+ "scores (%d %d %d)", 
				name, age, gender, scores[0], scores[1], scores[2]);
	}
	
}
