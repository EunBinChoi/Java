package stream_sorted;

public class Student implements Comparable<Student>{
	String name;
	int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public String toString() {
		return "�̸� : " + name + ", ���� : " + score;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		// �������� ����
//		if(score < o.score) return -1; // ����
//		else if(score == o.score) return 0; // 
//		else return 1; // ������
		
		return Integer.compare(score, o.score) * -1; // �������� ����
//		return Integer.compare(o.score, score); // �������� ����
	}
	
}
