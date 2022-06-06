package assignment7;

import java.util.Arrays;

// 학생만 수강할 수 있는 과목 (대학생, 고등학생)
// 직장인들만 수강할 수 있는 과목
// 대학생들만 수강할 수 있는 과목
// 고등학생들만 수강할 수 있는 과목
public class Course<T> {
	private String courName; // 과목명
	private T[] registerStudents; // 해당 과목을 수강하고 있는 학생

	// 과목 수강생: 사람 (Person),
	// - 학생 (Student)
	// - 대학생 (UnivStudent)
	// - 고등학생 (HighStudent)
	// - 직장인 (Worker)

	@SuppressWarnings("unchecked") // warning 안뜨게 함
	public Course(String courName, int capacity) {
		// capacity: 해당 과목이 수용할 수 있는 인원 (최대 정원)

		this.courName = courName;
//		this.registerStudents = new T[capacity];
		// 결정되지 않은 타입 파라미터로 배열 생성 불가

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

	// add: 인자로 전달받은 학생을 등록하는 함수
	public void add(T t) {
		int index = getNullIndex();
		if (index == -1) {
			System.out.println("[ERROR] 더 이상 학생을 추가할 수 없습니다!");
		} else {
			registerStudents[index] = t;
		}
	}

	// withdraw: 인자로 전달받은 학생을 철회하는 함수
	public void withdraw(T t){
		int index = getStuIndex(t);
		if(index == -1) {
			System.out.println("[ERROR] 과목 수강생 목록에 해당 학생이 없습니다!");
		}
		else {
			registerStudents[index] = null;
		}
	}

	// getNullIndex:
	// 과목 수강생 배열에 비어있는 공간이 있는지 확인하고 비어있는 공간 인덱스를 반환
	public int getNullIndex() {
		for (int i = 0; i < registerStudents.length; i++) {
			if (registerStudents[i] == null) {
				return i;
			}
		}
		return -1; // 만약 비어있는 공간이 없을 경우 -1을 반환
	}

	// getStuIndex:
	// 과목 수강생 배열에 철회하려고 하는 학생이 등록되어있는지 확인하고 학생 인덱스 반환
	public int getStuIndex(T t){
		for (int i = 0; i < registerStudents.length; i++) {
			if (registerStudents[i] == t) {
				return i;
			}
		}
		return -1; // 만약 학생을 찾지 못하는 경우 -1을 반환
	}


	// 1) 해당 과목을 열었던 교수자가 과목을 수강하는 학생들의 학번으로 학생을 검색하는 함수
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

	// 2) 해당 과목을 열었던 교수자가 과목을 수강하는 직장인들의 부서로 직장인을 검색하는 함수
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
