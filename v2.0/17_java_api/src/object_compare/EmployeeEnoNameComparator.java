package object_compare;

import java.util.Comparator;

public class EmployeeEnoNameComparator 
extends EmployeeNameComparator
implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		// 1) eno (사원번호) + 2) name (사원이름) 기준으로 객체 비교
		
		if(o1.getEno() < o2.getEno()) return -1;
		else if(o1.getEno() == o2.getEno()) {
			return super.compare(o1, o2);
		}
		else return 1;		
	}

}
