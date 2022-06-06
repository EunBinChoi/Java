package queue;

public class Student 
implements Comparable<Student> {
	private int sno; // ÇÐ¹ø

	public Student(int sno) {
		super();
		this.sno = sno;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(sno, o.sno);
	}
}
