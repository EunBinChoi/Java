package object_compare;

import java.util.Comparator;

public class EmployeeEnoNameComparator 
extends EmployeeNameComparator
implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		// 1) eno (�����ȣ) + 2) name (����̸�) �������� ��ü ��
		
		if(o1.getEno() < o2.getEno()) return -1;
		else if(o1.getEno() == o2.getEno()) {
			return super.compare(o1, o2);
		}
		else return 1;		
	}

}
