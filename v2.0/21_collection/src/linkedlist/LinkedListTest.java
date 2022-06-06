package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // LinkedList
        // : ArrayList, Vector���� �߰�/���� ����� ��� �ڷ� �о��ְų� ������ ����ִ� �۾��� ����
        // : �ڷ� �о��ְų� ������ ����ִ� �۾��� ���� �� ������?

        // : �ϳ��� ��忡 ������ (data) + ���� ������ �ּ� (next link)
        // : ���� LinkedList ������ �߰�/������ �� ��� ���� ������ �ּҸ� �����ϸ� ��
        // (**) �޸𸮿� ���ҵ��� ���������� ���� ���� ���� -> �ε��� �����ϱ� ���� (�ε��� ���Ҵ� �ʿ�)

        // ArrayList vs LinkedList (���� ����Ʈ)
        // - ���� �߰� �ε��� ������ �߰�/������ ���: LinkedList
        // - ���� �˻��� ���: ArrayList

        // cf) Double Linked List (���� ���� ����Ʈ)
        // - Linked List �˻� ���� ���

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        long startTime;
        long endTime;
        System.out.println("���� ����");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
//			arrayList.add(0, i + "");
            arrayList.add(0, String.valueOf(i));
        }
        // 0
        // 1 0
        // 2 1 0
        // 3 2 1 0
        endTime = System.nanoTime();
        System.out.println("[ArrayList ���� �ð�] : " + (endTime - startTime) + "ms");

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
//			linkedList.add(0, i + "");
            linkedList.add(0, String.valueOf(i));
        }
        // 0
        // 1 0
        // 2 1 0
        // 3 2 1 0
        endTime = System.nanoTime();
        System.out.println("[LinkedList ���� �ð�] : " + (endTime - startTime) + "ms");

        System.out.println();
        System.out.println("���� �˻�");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        // 0
        // 1 0
        // 2 1 0
        // 3 2 1 0
        endTime = System.nanoTime();
        System.out.println("[ArrayList ���� �ð�] : " + (endTime - startTime) + "ms");

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        // 0
        // 1 0
        // 2 1 0
        // 3 2 1 0
        endTime = System.nanoTime();
        System.out.println("[LinkedList ���� �ð�] : " + (endTime - startTime) + "ms");
    }

}
