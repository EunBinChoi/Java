package assignment7;

import java.util.Arrays;

// �л��� ������ �� �ִ� ���� (���л�, ����л�)
// �����ε鸸 ������ �� �ִ� ����
// ���л��鸸 ������ �� �ִ� ����
// ����л��鸸 ������ �� �ִ� ����
public class Course<T> {
	private String courName; // �����
	private T[] registerStudents; // �ش� ������ �����ϰ� �ִ� �л�

	// ���� ������: ��� (Person),
	// - �л� (Student)
	// - ���л� (UnivStudent)
	// - ����л� (HighStudent)
	// - ������ (Worker)

	@SuppressWarnings("unchecked") // warning �ȶ߰� ��
	public Course(String courName, int capacity) {
		// capacity: �ش� ������ ������ �� �ִ� �ο� (�ִ� ����)

		this.courName = courName;
//		this.registerStudents = new T[capacity];
		// �������� ���� Ÿ�� �Ķ���ͷ� �迭 ���� �Ұ�

		this.registerStudents = (T[]) (new Object[capacity]);
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
		if (o == null)
			return false;
		if (!(o instanceof Course<?>))
			return false;

		return this.courName.equals(((Course<?>) o).courName)
				&& Arrays.equals(this.registerStudents, ((Course<?>) o).registerStudents);
	}

	// toString
	@Override
	public String toString() {
		return String.format("courName = %s, registerStudents = %s", courName, Arrays.toString(registerStudents));
	}

	// add: ���ڷ� ���޹��� �л��� ����ϴ� �Լ�
	public void add(T t) {
		int index = getNullIndex();
		if (index == -1) {
			System.out.println("[ERROR] �� �̻� �л��� �߰��� �� �����ϴ�!");
		} else {
			registerStudents[index] = t;
		}
	}

	// withdraw: ���ڷ� ���޹��� �л��� öȸ�ϴ� �Լ�
	public void withdraw(T t){
		int index = getStuIndex(t);
		if(index == -1) {
			System.out.println("[ERROR] ���� ������ ��Ͽ� �ش� �л��� �����ϴ�!");
		}
		else {
			registerStudents[index] = null;
		}
	}

	// getNullIndex:
	// ���� ������ �迭�� ����ִ� ������ �ִ��� Ȯ���ϰ� ����ִ� ���� �ε����� ��ȯ
	public int getNullIndex() {
		for (int i = 0; i < registerStudents.length; i++) {
			if (registerStudents[i] == null) {
				return i;
			}
		}
		return -1; // ���� ����ִ� ������ ���� ��� -1�� ��ȯ
	}

	// getStuIndex:
	// ���� ������ �迭�� öȸ�Ϸ��� �ϴ� �л��� ��ϵǾ��ִ��� Ȯ���ϰ� �л� �ε��� ��ȯ
	public int getStuIndex(T t){
		for (int i = 0; i < registerStudents.length; i++) {
			if (registerStudents[i] == t) {
				return i;
			}
		}
		return -1; // ���� �л��� ã�� ���ϴ� ��� -1�� ��ȯ
	}


	// 1) �ش� ������ ������ �����ڰ� ������ �����ϴ� �л����� �й����� �л��� �˻��ϴ� �Լ�
	// searchStudentCourseByNo()
	public Student searchStudentCourseByNo(String studentNo) {
		for (int i = 0; i < registerStudents.length; i++) {
			if (registerStudents[i] != null) {
				if (registerStudents[i] instanceof Student) {
					if (((Student) registerStudents[i]).getStudentNo() != null) {
						if (((Student) registerStudents[i]).getStudentNo().equals(studentNo)) {
//							System.out.println(registerStudents[i]);
							return (Student) registerStudents[i];
						}
					}
				}
			}
		}
		return null;
	}

	// 2) �ش� ������ ������ �����ڰ� ������ �����ϴ� �����ε��� �μ��� �������� �˻��ϴ� �Լ�
	// searchWorkerCourseByDepart()
	public Worker searchWorkerCourseByDepart(String department) {
		for (int i = 0; i < registerStudents.length; i++) {
			if (registerStudents[i] != null) {
				if (registerStudents[i] instanceof Worker) {
					if (((Worker) registerStudents[i]).getDepartment() != null) {
						if (((Worker) registerStudents[i]).getDepartment().equals(department)) {
//							System.out.println(registerStudents[i]);
							return (Worker) registerStudents[i];

						}



					}
				}
			}
		}
		return null;
	}
}
