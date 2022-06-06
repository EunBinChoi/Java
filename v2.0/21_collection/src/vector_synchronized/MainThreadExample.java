package vector_synchronized;

public class MainThreadExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        MyVector<Integer> myVector = new MyVector<>();

        Thread th1 = new Thread("Thread-1") {
            @Override
            public void run() {
                myArrayList.add(100);
            }
        };
        Thread th2 = new Thread("Thread-2") {
            @Override
            public void run() {
                myArrayList.add(100);
            }
        };
        Thread th3 = new Thread("Thread-3") {
            @Override
            public void run() {
                myVector.add(100);
            }
        };
        Thread th4 = new Thread("Thread-4") {
            @Override
            public void run() {
                myVector.add(100);
            }
        };
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }

}
