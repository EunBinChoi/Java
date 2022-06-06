package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<String> arrayList = new ArrayList<>(2);
        System.out.println(arrayList.size()); // 0�� (���� ��ü���� �� ���� ������)

        arrayList.add("str1");
        arrayList.add("str2");
        arrayList.add("str3");
        arrayList.add("str1");
        System.out.println(arrayList.size());
        print(arrayList);
        System.out.println();

        arrayList.remove(1); // ���� ���� (�� ����)
        print(arrayList);
        System.out.println();

        arrayList.remove("str1"); // �ε��� �˻�, ���� ���� (���� �ߺ��� ó������ ã�� ���� ����, ��õ���� ����)
        print(arrayList);
        System.out.println(arrayList);
        System.out.println();

        arrayList.addAll(arrayList);
        print(arrayList);
        System.out.println();

        arrayList.set(3, "str4");
        print(arrayList);
        System.out.println();

        Object arrayList2 = arrayList.clone();
        System.out.println(arrayList2);
        System.out.println();

//		arrayList.clear();
//		System.out.println(arrayList);

        boolean contains = arrayList.contains("str3");
        System.out.println(contains);
        System.out.println();

        List<String> list2 = Arrays.asList("str4", "str1");
        boolean containsAll = arrayList.containsAll(list2);
        System.out.println(containsAll);
        System.out.println();

        arrayList.ensureCapacity(100); // arrayList�� capacity�� �ּ� 100�̻����� �ø�
        arrayList.forEach((element) -> {
            System.out.println(element);
        });
        String str = arrayList.get(3);
        arrayList.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2) * -1;
            }

        });

        arrayList.isEmpty(); // arrayList�� ����ִ��� Ȯ��
        arrayList.indexOf("str1"); // "str1"�� �ε��� ��ȯ
        //////////////////////////////////////////////////////

        // ArrayList -> Object Array
        String[] strArr = arrayList.toArray(new String[arrayList.size()]);
        System.out.println((String) strArr[0]);
        strArr[0] = "str5";
        System.out.println(Arrays.toString(strArr));
        System.out.println();

        // List vs Arrays
        List<String> list = new ArrayList<>();
        list = new Vector<>();
        list = new LinkedList<>();


        String[] names = {"ȫ�浿", "ȫ���", "���ڹ�"};
        List<String> list3 = Arrays.asList(names);
        list.set(0, "ȫȫ");
        list.add("ȫȫ��");
        list.remove("ȫ���");

        // list�� add, remove ������ �ȵ� => �������� ��ü (�߰�, ������ ����)
//		list.add("�ڹ���"); // list�� add�� abstract method�� ����
//		list.remove("ȫ�浿"); // list�� remove�� abstract method�� ����
        System.out.println(list);

    }

    public static <E> void print(ArrayList<E> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + " : " + arrayList.get(i));
        }
    }

}
