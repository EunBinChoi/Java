package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // hash set: set (집합) 원소를 저장하는데 hashing 기법 (**) 사용
        // ex) 자바에서는 hashCode()에 구현되어있는 방법으로 hashing 함수 구현

        // ** hashing **
        // : 임의의 크기를 가진 데이터를 고정된 데이터 크기로 변환하는 것 (저장공간을 줄일 수 있음)
        // : 배열의 원소를 찾을 때 hash function을 알면 즉시 원소를 찾을 수 있음!
        // ex) "apple" ==> 'a' ==> 97 % 97 = 0 => arr[0]!
        // ex) "apple" "banana" "kiwi"
        // 'a' (97) % 97 == 0 --> "apple"
        // 'b' (98) % 97 == 1 --> "banana"
        // 'k' (107) % 97 == 10 --> "kiwi"

        // hash function (h)
        // == 문자열의 첫 문자의 아스키코드 값 % 'a'의 아스키코드 값 (97)
        // ==> key 값으로 사용
        // https://johngrib.github.io/wiki/Object-hashCode/
    	
        System.out.println();
        System.out.println();

        Set<String> set = new HashSet<>();
        // hashCode() 값을 비교해서 원소를 저장하는데 
        // 만약
        // 1) 두 원소의 hashCode() => true 
        // 2) 두 원소의 equals() => true
        // 두 원소는 동일하다고 가정하고 중복 정의 X
        
        // Q1. 두 원소가 다른 문자열인데 같은 hashCode()를 가질 수 있을까?
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

//		set.get(i) // set은 인덱스 X

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
