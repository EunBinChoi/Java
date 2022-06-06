package vector_synchronized;

import java.util.ArrayList;

public class MyArrayList<E> extends ArrayList<E> {
    @Override
    public boolean add(E e) {
        int data = (Integer) e;
        for (int i = 0; i < 10; i++) {
            data--;
            System.out.println("[ MyArrayList ] " +
                    Thread.currentThread().getName() + " : " + data);
        }
        return true;
    }
}
