package arraylist_problem;

import java.util.Comparator;

import overview.Employee;

public class EmployeeComparator
        implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        // TODO Auto-generated method stub
//		if(o1.getEno() < o2.getEno()) return -1;
//		else if(o1.getEno() == o2.getEno()) return 0;
//		else return 1; // o1.getEno() > o2.getEno();

        return Integer.compare(o1.getEno(), o2.getEno());

    }

}
