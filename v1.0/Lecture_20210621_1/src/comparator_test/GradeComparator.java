package comparator_test;

import java.util.Comparator;

public class GradeComparator 
implements Comparator<Student>{

		
	// 1. �г��� ������������ ����
	// 2. �г��� ���ٸ� id�� ������������ ����
	@Override
	public int compare(Student o1, Student o2) {
		// grade�� �������� ��������
		// ū �� ���� (-1), ���� ���� ������ (1)
		if(o1.grade < o2.grade) return 1;
		else if(o1.grade == o2.grade) {
			
			// id�� �������� ��������
			// ū �� ������ (1), ���� ���� ���� (-1)
			if(o1.id < o2.id) return -1;
			else if(o1.id == o2.id) return 0;
			else return 1;
		}
		else return -1;
	}
}
