package vector;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class VectorTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // ArrayList vs Vector
        // ArrayList: ����ȭ ���� X (not synchronized)
        // Vector: ����ȭ ���� O (synchronized)
        // ex) DB�� �����ϴ� ��ü�� ���� (�� �� �̻��� USER�� ������ DB�� ���ÿ� ������ �� ������ ��)

        Vector<String> vector = new Vector<>();
        vector.add("str1");
        vector.add("str2");
        vector.remove("str1");
        System.out.println(vector);
        System.out.println();
        //////////////////////////////////////////////

        // addAll
        List<String> list = Arrays.asList("a", "b", "c"); // �������� ��ü
//		list.add("d");
//		list.remove("c");

        vector.addAll(list);
        System.out.println(vector);
        vector.remove("c");
        System.out.println(vector);


        int cap = vector.capacity(); // vector�� ������ �� �ִ� �뷮 (10)
        System.out.println(cap); // ���� ����� 2������ �̸� �Ҵ�

        int size = vector.size(); // ���� vector�� ����� ��ü �� (3)
        System.out.println(size);
        System.out.println();

        vector.clear();
        System.out.println(vector);

        cap = vector.capacity(); // 10
        System.out.println(cap); // ������ ��쿡�� 2������ �Ҵ�

        size = vector.size(); // 0
        System.out.println(size);
        System.out.println();

        boolean isContainAll = vector.containsAll(list);
        System.out.println(isContainAll);
        System.out.println();

        vector.add("b");
        vector.add("a");
        vector.add("c");
        vector.forEach(a -> System.out.println(a));
        // for(String s : arr)
        System.out.println();

        int idx = vector.indexOf("b");
        System.out.println(idx);
        ////////////////////////////////////////

        // vector.sort(new StringComparator());
        vector.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2) * -1;
            }

        });

        System.out.println(vector);
        System.out.println();

        vector.replaceAll(a -> a + "2");
        System.out.println(vector);
    }

}
