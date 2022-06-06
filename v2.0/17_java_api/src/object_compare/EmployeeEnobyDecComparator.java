package object_compare;

import java.util.Comparator;

public class EmployeeEnobyDecComparator 
implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2) * -1;
		// return 값의 부호를 바꿈 
		// => 오름차순의 return 값의 부호를 바꾸면 내림차순이 된다!
	}

}
