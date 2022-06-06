package generic_wildcard;

public class Course<T> {
	/*
	 * ���� ����� (String)
	 * ������ (Person, Worker, Student, HighStudent)
	 * 
	 * */
	
	String courseName;
	T[] students;
	
	public Course(String name, int capacity) {
		this.courseName = name;
		// students = new T[capacity]; // (X)
		// why?
		// T���� ũ�Ⱑ �������� �ʾƼ�
		
		students = (T[])(new Object[capacity]);
		// Ÿ�� �Ķ���� �迭 ����:
		// Object Ŭ������ �迭�� ���� �Ŀ�
		// Ÿ�� �Ķ���ͷ� �� ��ȯ�� ����� ��
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public T[] getStudents() {
		return students;
	}

	public void setStudents(T[] students) {
		this.students = students;
	}
	
	// T�� ��ü�� �ִ� �޼ҵ� add
	// �迭�� ����ִ� �κ��� ã�Ƽ� ������ ��ü�� ����
	public void add(T t) {
		for(int i = 0; i < students.length; i ++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
			// [������1, ������2, null, null, null]
			
			// break�� ���ϸ� ...
			// [������1, ������2, ������3, ������3, ������3]
			
			// break�� �ϸ�
			// [������1, ������2, ������3, null, null]
		}
	}
	
}
