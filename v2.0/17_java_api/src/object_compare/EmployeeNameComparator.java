package object_compare;

import java.util.Comparator;

public class EmployeeNameComparator 
implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		// name (사원이름) 기준으로 객체 비교
		
		if(o1.getName().compareTo(o2.getName()) < 0) return -1;
		else if(o1.getName().compareTo(o2.getName()) == 0) return 0;
		else return 1;
	}

}
