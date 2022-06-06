package assignment7;

import java.util.Arrays;

public class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course<Person>  c1 = new Course<>("��Ʈ ��ī���� �Ұ� (�Ϲ���)", 5);
		Course<Student> c2 = new Course<>("��ſ� �ڵ� ����  (�л�)", 5);
		Course<Worker>  c3 = new Course<>("�ǹ������� �ڵ�   (������)", 5);
		Course<HighStudent> c4 = new Course<>("��ũ��ġ�� �ڵ� ���� (����л�)", 5);
		Course<UnivStudent> c5 = new Course<>("�ڹ� ���α׷���   (���л�)", 5);
		Course<Animal> c6 = new Course<>("�ݷ����� ��ȸ�� �⸣��  (�ݷ�����)", 5);

		// Q1 ~ Q3�� ������ ������ ���� ������ �ذ��ϸ� �˴ϴ�.
		// �ش� ������ Course Ŭ������ ��ü���� � ���ʸ� Ÿ���� ������ �ִ� ���� ����
		// Course Ŭ������ registerStudents �迭�� ���Ұ� �� �� �ִ��� Ȯ���ϴ� �����Դϴ�.

		// ���� Course Ŭ������ ��ü�� Ÿ���� �����Ǹ�
		// �ش� ��ü Ÿ�� ������ ��ü�鸸 registerStudents �迭�� ���Ұ� �� �� �ֽ��ϴ�.

		// ���� ���, c1�� ��� Person Ÿ������ ��ü�� �����Ǿ� registerStudents Ÿ���� Person[]�� �ǰ�
		// ���� registerStudents �迭�� ���ҷ� ���� �� �ִ� ��ü�� Person�� Person ���� �ڽĵ��� ���ҷ� ���� �� �ֽ��ϴ�.
		// (�θ� ��ü ������ �ڽĵ��� �� �� �� �����Ƿ�)

		// �̷��� ������ �� ������ ������ �� �ִ� �������� ������ �����ϴ�.
		// c1: Person ���� �ڽĵ� (Person ����)�� ������ �� ���� (Person, Student, Worker, HighStudent, UnivStudent)
		// c2: Student ���� �ڽĵ� (Student ����)�� ������ �� ���� (Student, HighStudent, UnivStudent)
		// c3: Worker ���� �ڽĵ� (Worker ����)�� ������ �� ���� (Worker)
		// c4: HighStudent ���� �ڽĵ� (HighStudent ����)�� ������ �� ���� (HighStudent)
		// c5: UnivStudent ���� �ڽĵ� (UnivStudent ����)�� ������ �� ���� (UnivStudent)
		// c6: Animal ���� �ڽĵ� (Animal ����)�� ������ �� ���� (Animal)

		////////////////////////////////////////////////////////////
		// Course Ŭ������ �ʵ�
		// private String courName; // �����
		// private T[] registerStudents; // �ش� ������ �����ϰ� �ִ� �л�
		////////////////////////////////////////////////////////////


		// Q1. s1�� ���� �� �ִ� ������?
		Student s1 = new Student();
		c1.add(s1); // �ش� ������ �Ϲ����̸� ������ �� �����Ƿ� �л��� s1�� ���� �� ����
		c2.add(s1); // �ش� ������ �л��̸� ������ �� �����Ƿ� �л��� s1�� ���� �� ����
//		c3.add(s1); // �ش� ������ �����θ� ������ �� �����Ƿ� �л��� s1�� ���� �� ����
//		c4.add(s1); // �ش� ������ ����л��� ������ �� �����Ƿ� �л��� s1�� ���� �� ����
//		c5.add(s1); // �ش� ������ ���л��� ������ �� �����Ƿ� �л��� s1�� ���� �� ����
//		c6.add(s1); // �ش� ������ �ݷ������� ������ �� �����Ƿ� �л��� s1�� ���� �� ����


		// Q2. s2�� ���� �� �ִ� ������?
		UnivStudent s2 = new UnivStudent();
		c1.add(s2); // �ش� ������ �Ϲ����̸� ������ �� �����Ƿ� ���л��� s2�� ���� �� ����
		c2.add(s2); // �ش� ������ �л��̸� ������ �� �����Ƿ� ���л��� s2�� ���� �� ����
//		c3.add(s2); // �ش� ������ �����θ� ������ �� �����Ƿ� ���л��� s2�� ���� �� ����
//		c4.add(s2); // �ش� ������ ����л��� ������ �� �����Ƿ� ���л��� s2�� ���� �� ����
		c5.add(s2); // �ش� ������ ���л��̸� ������ �� �����Ƿ� ���л��� s2�� ���� �� ����
//		c6.add(s2); // �ش� ������ �ݷ������� ������ �� �����Ƿ� ���л��� s2�� ���� �� ����


		// Q3. s3�� ���� �� �ִ� ������?
		Worker s3 = new Worker();
		c1.add(s3); // �ش� ������ �Ϲ����̸� ������ �� �����Ƿ� �������� s3�� ���� �� ����
//		c2.add(s3); // �ش� ������ �л��� ������ �� �����Ƿ� �������� s3�� ���� �� ����
		c3.add(s3); // �ش� ������ �������̸� ������ �� �����Ƿ� �������� s3�� ���� �� ����
//		c4.add(s3); // �ش� ������ ����л��� ������ �� �����Ƿ� �������� s3�� ���� �� ����
//		c5.add(s3); // �ش� ������ ���л��� ������ �� �����Ƿ� �������� s3�� ���� �� ����
//		c6.add(s3); // �ش� ������ �ݷ������� ������ �� �����Ƿ� �������� s3�� ���� �� ����



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
		// toString() �Լ��� ���ǵǾ� �־ �ּҰ��� ������ �ʰ� ���빰�� ��µȴ�.
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println();
		System.out.println();
		System.out.println();



		//////////////////////////////////////////////////////////////////////////
		// ������ �ʱ�ȭ�ϱ� ���� ���� ���� ��ü �����
		/////////////////////////////////////////////////////////////////////////
		System.out.println("============================== add and withdraw test ==============================");
		c1 = new Course<Person>("��Ʈ ��ī���� �Ұ� (�Ϲ���)", 5);
		c2 = new Course<Student>("��ſ� �ڵ� ����  (�л�)", 5);
		c3 = new Course<Worker>("�ǹ������� �ڵ�   (������)", 5);
		c4 = new Course<HighStudent>("��ũ��ġ�� �ڵ� ���� (����л�)", 5);
		c5 = new Course<UnivStudent>("�ڹ� ���α׷���   (���л�)", 5);
		c6 = new Course<Animal>("�ݷ����� ��ȸ�� �⸣��  (�ݷ�����)", 5);

		Person person1  = new Person("�Ϲ���1");
		Student student1  = new Student("�л�1", "20211111", "90");
		HighStudent highStudent1  = new HighStudent("����л�1", "20212222", "80");
		UnivStudent univStudent1  = new UnivStudent("���л�1", "20213333", "95");
		Worker worker1  = new Worker("������1", "20214444", "������", "�븮");
		c1.add(person1);
		c1.add(student1);
		c1.add(highStudent1);
		c1.add(univStudent1);
		c1.add(worker1);
		System.out.println(c1);

		Student student2 = new Student("�л�2", "20215555", "50");
		HighStudent highStudent2 = new HighStudent("����л�2", "20216666", "60");
		UnivStudent univStudent2 = new UnivStudent("���л�2", "20217777", "70");
		c2.add(student2);
		c2.add(highStudent2);
		c2.add(univStudent2);
		System.out.println(c2);

		Worker worker3 = new Worker("������3", "20218888", "������", "���");
		c3.add(worker3);
		System.out.println(c3);

		HighStudent highStudent4 = new HighStudent("����л�4", "20219999", "65");
		c4.add(highStudent4);
		System.out.println(c4);

		UnivStudent univStudent5 = new UnivStudent("���л�5", "20201111", "78");
		c5.add(univStudent5);
		System.out.println(c5);

		Animal animal6 = new Animal("�ݷ�����6");
		c6.add(animal6);
		System.out.println(c6);

		// Q6. Course Ŭ������ ������ ���� �Լ��� �߰��ϰ��� �Ѵ�.
		// 1) ������ ������ �л��� ������ öȸ�ϴ� �Լ�
		// withdraw (���ڳ� ��ȯ���� �����غ�����!)
		System.out.println();
		c1.withdraw(person1); // withdraw person1 in the students list
		System.out.println(c1);
		c1.withdraw(person1); // withdraw person1 in the students list (öȸ �Ұ���! �̹� öȸ�� �л��̿��� ���� ������ ��Ͽ� �ش� �л��� �����ϴٶ�� ���� �߻�!)

		c1.add(person1); // add person1 at the index which has null
		System.out.println(c1);
		System.out.println("===================================================================================");
		System.out.println();
		System.out.println();


//		Q7. CourseTest Ŭ������ static �޼ҵ�� ������ ���� �Լ��� �Ʒ��� ���� �ۼ��ϰ� �׽�Ʈ �ڵ带 �ۼ��غ���.
//
//		1) ��� ������ ����� �� �ִ� �Լ�
//		registerCourse(Course<?> course)
//
//		2) ������ ���� ����� �� �ִ� �Լ�
//		registerWorkerCourse(Course<? extends Worker>)
//	
//		3) �л� ���� ����� �� �ִ� �Լ�
//		registerStudentCourse(Course<? extends Student>)

//		c1 = new Course<Person>("��Ʈ ��ī���� �Ұ� (�Ϲ���)", 5);
//		c2 = new Course<Student>("��ſ� �ڵ� ����  (�л�)", 5);
//		c3 = new Course<Worker>("�ǹ������� �ڵ�   (������)", 5);
//		c4 = new Course<HighStudent>("��ũ��ġ�� �ڵ� ���� (����л�)", 5);
//		c5 = new Course<UnivStudent>("�ڹ� ���α׷���   (���л�)", 5);
//		c6 = new Course<Animal>("�ݷ����� ��ȸ�� �⸣��  (�ݷ�����)", 5);

		// registerCourse �Լ��� ��� ���Ǹ� ����� �� ����
		System.out.println("[registerCourse() Test]");
		registerCourse(c1);
		registerCourse(c2);
		registerCourse(c3);
		registerCourse(c4);
		registerCourse(c5);
		registerCourse(c6);
		System.out.println();

		// registerStudentCourse �Լ��� Student ���� ��ü���� ������ �� �ִ� �л� ��� ���Ǹ� ����� �� ����
		System.out.println("[registerStudentCourse() Test]");
//		registerStudentCourse(c1); // c1�� �Ϲ����̶�� ���� ������ ���������̱� ������ registerStudentCourse() �Լ��δ� ������ ����� �� ����
		registerStudentCourse(c2); // c2�� �л��̶�� ���� ������ ���������̱� ������ registerStudentCourse() �Լ��� ������ ����� �� ����
//		registerStudentCourse(c3); // c3�� �������̶�� ���� ������ ���������̱� ������ registerStudentCourse() �Լ��δ� ������ ����� �� ����
		registerStudentCourse(c4); // c4�� ����л��̶�� ���� ������ ���������̱� ������ registerStudentCourse() �Լ��� ������ ����� �� ����
		registerStudentCourse(c5); // c5�� ���л���� ���� ������ ���������̱� ������ registerStudentCourse() �Լ��� ������ ����� �� ����
//		registerStudentCourse(c6); // c6�� �ݷ������̶�� ���� ������ ���������̱� ������ registerStudentCourse() �Լ��δ� ������ ����� �� ����
		System.out.println();

		// registerWorkerCourse �Լ��� Worker ���� ��ü���� ������ �� �ִ� ������ ��� ���Ǹ� ����� �� ����
		System.out.println("[registerWorkerCourse() Test]");
//		registerWorkerCourse(c1); // c1�� �Ϲ����̶�� ���� ������ ���������̱� ������ registerWorkerCourse() �Լ��δ� ������ ����� �� ����
//		registerWorkerCourse(c2); // c2�� �л��̶�� ���� ������ ���������̱� ������ registerWorkerCourse() �Լ��δ� ������ ����� �� ����
		registerWorkerCourse(c3); // c3�� �������̶�� ���� ������ ���������̱� ������ registerWorkerCourse() �Լ��� ������ ����� �� ����
//		registerWorkerCourse(c4); // c4�� ����л��̶�� ���� ������ ���������̱� ������ registerWorkerCourse() �Լ��δ� ������ ����� �� ����
//		registerWorkerCourse(c5); // c5�� ���л���� ���� ������ ���������̱� ������ registerWorkerCourse() �Լ��δ� ������ ����� �� ����
//		registerWorkerCourse(c6); // c6�� �ݷ������̶�� ���� ������ ���������̱� ������ registerWorkerCourse() �Լ��δ� ������ ����� �� ����
		System.out.println();


//		Q8. Course Ŭ������ �Ϲ� �޼ҵ� (static �ƴ�)�� ������ ���� �Լ��� �߰��ϰ��� �Ѵ�.
//
//		1) �ش� ������ ������ �����ڰ� ������ �����ϴ� �л����� �й����� �л��� �˻��ϴ� �Լ��� ����� �ش� �Լ��� ȣ���غ���.
//		searchStudentCourseByNo(String studentNo)

		System.out.println("[searchStudentCourseByNo(String studentNo) Test]");

		String searchStudentNo = "20211111";
		Student searchStudent = c1.searchStudentCourseByNo(searchStudentNo);
		if(searchStudent == null) {
			System.out.printf("%s ������ �����ϰ� �ִ� �л� �� %s �й����� �л��� �˻��� �� �����ϴ�.\n",
					c1.getCourName(), searchStudentNo);
		}
		else {
			System.out.printf("%s ������ �����ϰ� �ִ� �л� �� %s �й����� �л��� �˻��� �л��� ������ ������ �����ϴ�.\n",
					c1.getCourName(), searchStudentNo);
			System.out.println(searchStudent);
		}

		searchStudentNo = "20212222";
		searchStudent = c3.searchStudentCourseByNo(searchStudentNo);
		if(searchStudent == null) {
			System.out.printf("%s ������ �����ϰ� �ִ� �л� �� %s �й����� �л��� �˻��� �� �����ϴ�.\n",
					 c3.getCourName(), searchStudentNo);
		}
		else {
			System.out.printf("%s ������ �����ϰ� �ִ� �л� �� %s �й����� �л��� �˻��� �л��� ������ ������ �����ϴ�.\n",
					c3.getCourName(), searchStudentNo);
			System.out.println(searchStudent);
		}
		System.out.println();

//		2) �ش� ������ ������ �����ڰ� ������ �����ϴ� �����ε��� �μ��� �������� �˻��ϴ� �Լ��� ����� �ش� �Լ��� ȣ���غ���.
//		searchWorkerCourseByDepart(String department)


		System.out.println("[searchWorkerCourseByDepart(String department) Test]");

		String searchDepart = "�λ���";
		Worker searchWorker = c1.searchWorkerCourseByDepart(searchDepart);
		if(searchWorker == null) {
			System.out.printf("%s ������ �����ϰ� �ִ� �л� �� %s �μ��� �л��� �˻��� �� �����ϴ�.\n",
					c1.getCourName(), searchDepart);
		}
		else {
			System.out.printf("%s ������ �����ϰ� �ִ� �л� �� %s �μ��� �л��� �˻��� �л��� ������ ������ �����ϴ�.\n",
					c1.getCourName(), searchDepart);
			System.out.println(searchWorker);
		}

		searchDepart = "������";
		searchWorker = c3.searchWorkerCourseByDepart(searchDepart);
		if(searchWorker == null) {
			System.out.printf("%s ������ �����ϰ� �ִ� �л� �� %s �μ��� �л��� �˻��� �� �����ϴ�.\n",
					c3.getCourName(), searchDepart);
		}
		else {
			System.out.printf("%s ������ �����ϰ� �ִ� �л� �� %s �μ��� �л��� �˻��� �л��� ������ ������ �����ϴ�.\n",
					c3.getCourName(), searchDepart);
			System.out.println(searchWorker);
		}


	}
	public static void registerCourse(Course<?> course) {
		System.out.println("���� �̸�: " + course.getCourName());
		System.out.println("������ ���: " + Arrays.toString(course.getRegisterStudents()));
	}

	public static void registerStudentCourse(Course<? extends Student> course) {
		System.out.println("���� �̸�: " + course.getCourName());
		System.out.println("������ ���: " + Arrays.toString(course.getRegisterStudents()));
	}

	public static void registerWorkerCourse(Course<? extends Worker> course) {
		System.out.println("���� �̸�: " + course.getCourName());
		System.out.println("������ ���: " + Arrays.toString(course.getRegisterStudents()));
	}
	

}
