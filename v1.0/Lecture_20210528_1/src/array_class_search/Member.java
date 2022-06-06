package array_class_search;

public class Member implements Comparable<Member> {
	int id;
	String name;
	int score;
	
	public Member(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		
		// 1) score�� ��������
		// 2) id�� ��������
		
		if(score < o.score) return 1;
		else if (score == o.score) {
			// id�� ��������
			if(id < o.id) return -1;
			else if(id == o.id) return 0;
			else return 1;
		}
		else return -1;
		
//		if(score < o.score) return 1;
//		else if (score == o.score) {
//			if(id < o.id) return 1;
//			else if(id == o.id) return 0;
//			else return -1;
//		}
//		else return -1;
		

//		return name.compareTo(o.name);
	}
	public String toString() {
		return "ID : " + this.id + ", �̸� : " + this.name + ", ���� : " + this.score;
	}
}
