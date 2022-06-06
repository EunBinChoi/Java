package queue_test;


// �л��Ĵ翡�� ���� ���� �ִ� ���
public class Student implements Comparable<Student> {
	private int sno; // �й�
	
	public Student(int sno) {
		this.sno = sno;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public String toString(){
		return "�й� : " + sno;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (sno < o.sno) return -1;
		else if (sno == o.sno) return 0;
		else return 1;
	}
}
