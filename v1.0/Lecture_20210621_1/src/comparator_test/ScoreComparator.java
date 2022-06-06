package comparator_test;

import java.util.*;

public class ScoreComparator 
implements Comparator<Student>{

	
	// 1. ������ ������������ ����
	// 2. ������ ���ٸ� id�� ������������ ����
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub

		// score�� �������� ��������
		// ū �� ���� (-1), ���� ���� ������ (1)
		if(o1.score < o2.score) return 1;
		else if(o1.score == o2.score) {
			
			// id�� �������� ��������
			// ū �� ������ (1), ���� ���� ���� (-1)
			if(o1.id < o2.id) return -1;
			else if(o1.id == o2.id) return 0;
			else return 1;
		}
		else return -1;
	}

}
