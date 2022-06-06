package assignment7;

import java.util.Arrays;
import java.util.Objects;

public class Course<T> {

	private String courseName; // 과목명
	private T[] registerStudents; // 해당 과목을 수강하고 있는 학생

	public Course() {
	}

	@SuppressWarnings("unchecked") // warning 안 뜨게 함
	public Course(String courseName, int capacity) {
		this.courseName = courseName;
		this.registerStudents = (T[]) (new Object[capacity]);
		// 결정되지 않은 타입 파라미터로 배열 생성 불가
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

	// 인자로 전달받은 학생을 등록하는 함수
	public void add(T t) {
		int idx = getIndex();
		if (idx == -1)
			System.out.printf("[에러] %s은(는) 마감되었습니다.\n", courseName);
		else
			registerStudents[idx] = t;
	}

	// 배열에 빈 공간 확인하고 인덱스 반환
	public int getIndex() {
		for (int i = 0; i < registerStudents.length; i++) {
			if (registerStudents[i] == null)
				return i;
		}
		return -1;
	}

	// 1) 과목을 선택한 학생이 과목을 철회하는 함수
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
			System.out.println("[에러] 수강생이 아닙니다.");
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


	// 1) 해당 과목을 열었던 교수자가 과목을 수강하는 학생들의 학번으로 학생을 검색하는 함수
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

	// 2) 해당 과목을 열었던 교수자가 과목을 수강하는 직장인들의 부서로 직장인을 검색하는 함수
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
