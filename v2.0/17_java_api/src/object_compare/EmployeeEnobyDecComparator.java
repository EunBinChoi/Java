package object_compare;

import java.util.Comparator;

public class EmployeeEnobyDecComparator 
implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2) * -1;
		// return ���� ��ȣ�� �ٲ� 
		// => ���������� return ���� ��ȣ�� �ٲٸ� ���������� �ȴ�!
	}

}
