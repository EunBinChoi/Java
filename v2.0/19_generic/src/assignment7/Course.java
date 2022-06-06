package assignment7;

import java.util.Arrays;
import java.util.Objects;

public class Course<T> {

	private String courseName; // �����
	private T[] registerStudents; // �ش� ������ �����ϰ� �ִ� �л�

	public Course() {
	}

	@SuppressWarnings("unchecked") // warning �� �߰� ��
	public Course(String courseName, int capacity) {
		this.courseName = courseName;
		this.registerStudents = (T[]) (new Object[capacity]);
		// �������� ���� Ÿ�� �Ķ���ͷ� �迭 ���� �Ұ�
	}

//	private T[] getInstance(int capacity) {
//		if (registerStudents.getClass().getName().equals("HighStudent")) {
//			return (T[]) new HighStudent[capacity];
//		} else if (registerStudents.getClass().getName().equals("UnivStudent")) {
//			return (T[]) new UnivStudent[capacity];
//		} else if (registerStudents.getClass().getName().equals("Student")) {
//			return (T[]) new Student[capacity];
//		} else if (registerStudents.getClass().getName().equals("Worker")) {
//			return (T[]) new Worker[capacity];
//		} else if (registerStudents.getClass().getName().equals("Person")) {
//			return (T[]) new Person[capacity];
//		} else {
//			return null;
//		}
//	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public T[] getRegisterStudents() {
		return registerStudents;
	}

	public void setRegisterStudents(T[] registerStudents) {
		this.registerStudents = registerStudents;
	}

	// ���ڷ� ���޹��� �л��� ����ϴ� �Լ�
	public void add(T t) {
		int idx = getIndex();
		if (idx == -1)
			System.out.printf("[����] %s��(��) �����Ǿ����ϴ�.\n", courseName);
		else
			registerStudents[idx] = t;
	}

	// �迭�� �� ���� Ȯ���ϰ� �ε��� ��ȯ
	public int getIndex() {
		for (int i = 0; i < registerStudents.length; i++) {
			if (registerStudents[i] == null)
				return i;
		}
		return -1;
	}

	// 1) ������ ������ �л��� ������ öȸ�ϴ� �Լ�
	public void withdraw(T t) {
		boolean isExist = false;
		for (int i = 0; i < registerStudents.length; i++) {
			if (registerStudents[i] == t) {
				isExist = true;
				registerStudents[i] = null;
				break;
			}
		}
		if (!isExist)
			System.out.println("[����] �������� �ƴմϴ�.");
	}

	@Override
	public String toString() {
		return "courseName=" + courseName + ", registerStudents=" + Arrays.toString(registerStudents);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Course<?> other = (Course<?>) obj;
		return Objects.equals(courseName, other.courseName) && Arrays.equals(registerStudents, other.registerStudents);
	}


	// 1) �ش� ������ ������ �����ڰ� ������ �����ϴ� �л����� �й����� �л��� �˻��ϴ� �Լ�
	// searchStudentCourseByNo()
	public void searchStudentCourseByNo(String studentNo) {
		for (int i = 0; i < registerStudents.length; i++) {
			if (registerStudents[i] != null) {
				if (registerStudents[i] instanceof Student) {
					if (((Student) registerStudents[i]).getStudentNo() != null) {
						if (((Student) registerStudents[i]).getStudentNo().equals(studentNo)) {
							System.out.println(registerStudents[i]);
						}
					}
				}
			}
		}
	}

	// 2) �ش� ������ ������ �����ڰ� ������ �����ϴ� �����ε��� �μ��� �������� �˻��ϴ� �Լ�
	// searchWorkerCourseByDepart()
	public void searchWorkerCourseByDepart(String department) {
		for (int i = 0; i < registerStudents.length; i++) {
			if (registerStudents[i] != null) {
				if (registerStudents[i] instanceof Worker) {
					if (((Worker) registerStudents[i]).getDepartment() != null) {
						if (((Worker) registerStudents[i]).getDepartment().equals(department)) {
							System.out.println(registerStudents[i]);
						}
					}
				}
			}
		}
	}

}
