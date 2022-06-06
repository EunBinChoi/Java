package assignment8;

import java.util.Vector;

public class MyVector<E> extends Vector<E> {
    @Override
    public synchronized boolean add(E e) {
        int data = (Integer) e;
        for (int i = 0; i < 10; i++) {
            data--;
            System.out.println("[ MyVector ] " +
                    Thread.currentThread().getName() + " : " + data);
        }
        return true;
    }
}
