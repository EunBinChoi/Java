package queue_test;


// 학생식당에서 줄을 서고 있는 모습
public class Student implements Comparable<Student> {
	private int sno; // 학번
	
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
		return "학번 : " + sno;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (sno < o.sno) return -1;
		else if (sno == o.sno) return 0;
		else return 1;
	}
}
