package arraylist_problem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import overview.Employee;

public class ArrayListProblem {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Employee> arrayList = new ArrayList<>();

        // Q1. 1 ~ 6�� ��� (new Employee(1)) �߰�
        for (int i = 0; i < 6; i++) {
            arrayList.add(new Employee(i + 1));
        }
        System.out.println(arrayList);

        // Q2. 2�� ��� ���
        arrayList.remove(1);
        System.out.println(arrayList);

        // Q3. 5�� ����� �����ȣ�� 10������ ����
        arrayList.get(3).setEno(10);
        System.out.println(arrayList);

        // Q4. ��� ��ȣ�� ������ ������� sort()
//		arrayList.sort(new EmployeeComparator());
        arrayList.sort(new Comparator<Employee>() { // �͸� ��ü

            @Override
            public int compare(Employee o1, Employee o2) {
                // TODO Auto-generated method stub
                return Integer.compare(o1.getEno(), o2.getEno());
            }

        });
        System.out.println(arrayList);
    }

}
