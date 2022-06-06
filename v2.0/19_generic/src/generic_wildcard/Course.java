package generic_wildcard;

import java.util.Arrays;


// �л��� ������ �� �ִ� ���� (���л�, ����л�)
// �����ε鸸 ������ �� �ִ� ����
// ���л��鸸 ������ �� �ִ� ����
// ����л��鸸 ������ �� �ִ� ����
public class Course<T> {
	private String courName; // �����
	private T[] registerStudents; // �ش� ������ �����ϰ� �ִ� �л�
	
	// ���� ������: ��� (Person), 
	//           	- �л� (Student)
	//                - ���л� (UnivStudent)
	//                - ����л� (HighStudent)
	// 			 	- ������ (Worker)
	
	@SuppressWarnings("unchecked") // warning �ȶ߰� ��
	public Course(String courName, int capacity) {
		// capacity: �ش� ������ ������ �� �ִ� �ο� (�ִ� ����)
		
		this.courName = courName;
//		this.registerStudents = new T[capacity];
		// �������� ���� Ÿ�� �Ķ���ͷ� �迭 ���� �Ұ�
		
		this.registerStudents = (T[])(new Object[capacity]);
	}


	public String getCourName() {
		return courName;
	}

	public void setCourName(String courName) {
		this.courName = courName;
	}

	public T[] getRegisterStudents() {
		return registerStudents;
	}

	public void setRegisterStudents(T[] registerStudents) {
		this.registerStudents = registerStudents;
	}
	

	// equals
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof Course<?>)) return false;
		
		return this.courName.equals(((Course<?>)o).courName)
				&& Arrays.equals
				(this.registerStudents, ((Course<?>)o).registerStudents);
	}
	
	// toString
	@Override
	public String toString() {
		return String.format("courName = %s, registerStudents = %s",
				courName, Arrays.toString(registerStudents));
	}
	
	// add: ���ڷ� ���޹��� �л��� ����ϴ� �Լ�
	public void add(T t) {
		int index = getIndex();
		if(index == -1) {
			System.out.println("[ERROR] ���̻� �߰��� �� �����ϴ�!");
		}
		else {
			registerStudents[index] = t;
		}
	}
	
	// getIndex: 
	// �迭�� ����ִ� ������ �ִ��� Ȯ���ϰ� 
	// ����ִ� ���� ��ġ (�ε���)�� ��ȯ
	public int getIndex() {
		for(int i = 0; i < registerStudents.length; i++) {
			if(registerStudents[i] == null) {
				return i;
			}
		}
		return -1; // ���� ����ִ� ������ ���� ��� -1�� ��ȯ
	}
	
	
}
