package generic_wildcard;

public class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course<Person>  c1 = new Course<>("��Ʈ ��ī���� �Ұ� (�Ϲ���)", 5);
		Course<Student> c2 = new Course<>("��ſ� �ڵ� ����  (�л�)", 5);
		Course<Worker>  c3 = new Course<>("�ǹ������� �ڵ�   (������)", 5);
		Course<HighStudent> c4 = new Course<>("��ũ��ġ�� �ڵ� ���� (����л�)", 5);
		Course<UnivStudent> c5 = new Course<>("�ڹ� ���α׷���   (���л�)", 5);
		Course<Animal> c6 = new Course<>("�ݷ����� ��ȸ�� �⸣��  (�ݷ�����)", 5);
	
		
		// Q1. s1�� ���� �� �ִ� ������?
		Student s1 = new Student();
		c1.add(s1);
		c2.add(s1);

		
		
		// Q2. s2�� ���� �� �ִ� ������?
		UnivStudent s2 = new UnivStudent();
		
		// Q3. s3�� ���� �� �ִ� ������?
		Worker s3 = new Worker();
		
		// Q4. Person, Student, UnivStudent, HighStudent, Worker Ŭ������
		// ������ ���� �ϼ��Ͻÿ�.
		/* Person
		 * - �ʵ�: name
		 * - �޼ҵ�: ������, getter, setter, toString, equals
		 * 
		 * Student
		 * - �ʵ�: studentNo (�й�), grade (�г�)
		 * - �޼ҵ�: ������, getter, setter, toString, equals
		 * 
		 * UnivStudent
		 * - �ʵ�: 
		 * - �޼ҵ�: ������, getter, setter, toString, equals
		 * 
		 * HighStudent
		 * - �ʵ�:
		 * - �޼ҵ�: ������, getter, setter, toString, equals
		 * 
		 * Worker
		 * - �ʵ�: workerNo (�����ȣ), department (�μ�), position (��å)
		 * - �޼ҵ�: ������, getter, setter, toString, equals
		 * */
		
		// Q5. �Ʒ��� �ڵ带 �����غ��� �� �ּҰ��� ������ �ʴ��� �����غ���.
//		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		// Q6. Course Ŭ������ ������ ���� �Լ��� �߰��ϰ��� �Ѵ�.
		// 1) ������ ������ �л��� ������ öȸ�ϴ� �Լ�
		// withdraw (���ڳ� ��ȯ���� �����غ�����!)
		
		// Q7. CourseTest Ŭ������ static �޼ҵ�� ������ ���� �Լ��� �߰��ϰ��� �Ѵ�.
		// 1) �ش� ������ ������ �����ڰ� ������ ���������� ����ϴ� �Լ�
		// registerCourse (�ش� ������ ���������� ������ �л����� ���)
		
		// 2) �ش� ������ ������ �����ڰ� ������ �����ϴ� �л����� �й����� �л��� �˻��ϴ� �Լ�
		// searchStudentCourseByNo
		
		// 3) �ش� ������ ������ �����ڰ� ������ �����ϴ� �����ε��� �μ��� �������� �˻��ϴ� �Լ�
		// searchWorkerCourseByDepart
		
		// <? extends Person>, <? super Person>
		
		registerCourse(c5); // (Course<? extends Person> course)
//		registerCourse(c6); // ����
	}
	public static void registerCourse(Course<? extends Person> course) {
		for(int i = 0; i < course.getRegisterStudents().length; i++) {
			if(course.getRegisterStudents()[i] != null) {
				System.out.println(course.getRegisterStudents()[i]);
			}
		}
	}
	
	public static Student[] searchStudentCourseByNo(Course<? extends Student> course, String studentNo){
		
		int count = 0;
		for(int i = 0; i < course.getRegisterStudents().length; i++) {
			Student targetStudent = course.getRegisterStudents()[i];
			if(targetStudent != null) {
				if(targetStudent.getStudentNo().equals(studentNo)) count++;
			}
		}
		Student[] searchStudent = new Student[count];
		
		for(int i = 0; i < course.getRegisterStudents().length; i++) {
			Student targetStudent = course.getRegisterStudents()[i];
			if(targetStudent != null) {
				if(targetStudent.getStudentNo().equals(studentNo)) {
					searchStudent[i] = targetStudent;
				}
			}
		}
		return searchStudent;
	}
	

}
