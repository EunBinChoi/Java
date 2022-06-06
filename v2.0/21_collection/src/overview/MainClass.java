package overview;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee c1 = new Employee(1);
        Employee c2 = new Employee(2);
        Employee c3 = new Employee(3);
        Employee c4 = new Employee(4);
        Employee c5 = new Employee(5);

        Employee[] c = {c1, c2, c3, c4, c5};
        System.out.println("???? ??? ?迭");
        System.out.println(Arrays.toString(c));
        System.out.println();

        // 1) c6 ??? (c1, c2 ?????)
        System.out.println("c6 ???");
        Employee c6 = new Employee(6);
        c = Arrays.copyOfRange(c, 0, c.length + 1);

        // ?迭 ??? ?ø??? ?????? ????
        System.out.println(Arrays.toString(c));

        int addElementIndex = 1;
        // ??????? ??????? ??? ??????? ????? ?? ??? ??????
        // ex) (c3 = c2): c3?? ??????? ?????
        // ???????? i-1 ????? i?? ??????????!
        for (int i = c.length - 1; i > addElementIndex; i--) {
            c[i] = c[i - 1];
            System.out.println(Arrays.toString(c));
        }
//		for(int i = addElementIndex; i < c.length-1; i++) {
//			c[c.length-i] = c[c.length-i-1];
//		}
        c[addElementIndex] = c6;
        System.out.println(Arrays.toString(c));
        System.out.println();

        // 2) c6 ????
        System.out.println("c6 ????");
        System.out.println(Arrays.toString(c));
        c[addElementIndex] = null;
        System.out.println(Arrays.toString(c));
        for (int i = addElementIndex + 1; i < c.length; i++) {
            c[i - 1] = c[i];
            System.out.println(Arrays.toString(c));
        }
        c = Arrays.copyOfRange(c, 0, c.length - 1);
        System.out.println(Arrays.toString(c));
    }

}
