package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // hash set: set (����) ���Ҹ� �����ϴµ� hashing ��� (**) ���
        // ex) �ڹٿ����� hashCode()�� �����Ǿ��ִ� ������� hashing �Լ� ����

        // ** hashing **
        // : ������ ũ�⸦ ���� �����͸� ������ ������ ũ��� ��ȯ�ϴ� �� (��������� ���� �� ����)
        // : �迭�� ���Ҹ� ã�� �� hash function�� �˸� ��� ���Ҹ� ã�� �� ����!
        // ex) "apple" ==> 'a' ==> 97 % 97 = 0 => arr[0]!
        // ex) "apple" "banana" "kiwi"
        // 'a' (97) % 97 == 0 --> "apple"
        // 'b' (98) % 97 == 1 --> "banana"
        // 'k' (107) % 97 == 10 --> "kiwi"

        // hash function (h)
        // == ���ڿ��� ù ������ �ƽ�Ű�ڵ� �� % 'a'�� �ƽ�Ű�ڵ� �� (97)
        // ==> key ������ ���
        // https://johngrib.github.io/wiki/Object-hashCode/
    	
        System.out.println();
        System.out.println();

        Set<String> set = new HashSet<>();
        // hashCode() ���� ���ؼ� ���Ҹ� �����ϴµ� 
        // ����
        // 1) �� ������ hashCode() => true 
        // 2) �� ������ equals() => true
        // �� ���Ҵ� �����ϴٰ� �����ϰ� �ߺ� ���� X
        
        // Q1. �� ���Ұ� �ٸ� ���ڿ��ε� ���� hashCode()�� ���� �� ������?
        // h(x) = x % 10
        // "11".hashCode() ==  "1".hashCode() => true
        // "11".equals("1") => false
        
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("3");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

//		set.get(i) // set�� �ε��� X

        int size = set.size();
        System.out.println("size: " + size);
        System.out.println();

        int hashCode = set.hashCode();
        System.out.println("hashCode of set: " + hashCode); // 49 + 50 + 51 == 150
        System.out.println();

        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        set.add("0");
        set.add("-1");
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        hashCode = set.hashCode();
        System.out.println("hashCode of set: " + hashCode); // 48 + 49 + 50 + 51 + 1444 == 1642
        System.out.println();


        System.out.println();
        System.out.println("1".hashCode());
        System.out.println("2".hashCode());
        System.out.println("3".hashCode());
        System.out.println("0".hashCode());
        System.out.println("-1".hashCode()); // 45('-') * 31^1 + 49('1') * 31^0
        System.out.println("-".hashCode());
        System.out.println("-2".hashCode());
        System.out.println("4".hashCode());
        System.out.println("-1000".hashCode()); // 45 * 31^4 + 49 * 31^3 + 48 * 31^2 + 48 * 31^1 + 48 * 31^0
    }

}
