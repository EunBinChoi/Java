package assignment8;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student(20212222, "Sally", 90);
        Student s2 = new Student(20211111, "Kelly", 100);
        Student s3 = new Student(20213333, "Philip", 95);
        Student s4 = new Student(20171234, "Lake", 70);
        Student s5 = new Student(20045555, "John", 85);

        Student[] students = {s1, s2, s3, s4, s5}; // 객체 배열 (object array)

        // Q1. 수업시간에 배운 컬렉션과 비교하여 객체 배열을 사용했을 경우
        // 문제점을 서술해보고 해당 문제점을 설명하는 코드를 작성해보시오.

        // 객체 배열을 사용했을 경우 문제점은 크게 두 가지가 있다.
        // 1) 배열 사이즈 고정되기 때문에 고정된 사이즈보다
        // 더 많은 객체를 삽입하려고 하면 이전 데이터를 어디에 저장해놓고 공간을 재할당해야 한다.

        // 만약 다음과 같은 객체를 중간 인덱스에 저장하려고 한다면 (여기서는 중간 인덱스 3에 저장한다고 가정하자.)
//        Student s6 = new Student(20096666, "James", 65);
//        students = Arrays.copyOf(students, students.length+1);
        // 배열 사이즈를 students.length+1 으로 재할당하고 재할당한 배열 공간에 기존 students를 복사한다.


        // 2) 중간 인덱스에 원소의 삽입, 삭제가 일어날 경우
        // 뒤로 밀어주거나 앞으로 댕겨주는 코드를 직접 작성해줘야 한다.

        // 중간 인덱스에 원소 삽입이 일어날 경우
//        int insertIndex = 3; // 삽입할 원소의 인덱스
//        for(int i = students.length-1; i > insertIndex; i--) {
//            students[i] = students[i-1];
//            System.out.println(Arrays.toString(students));
//        }
//        students[insertIndex] = s6;
//
//        System.out.print("[Insertion Result] : ");
//        System.out.println(Arrays.toString(students));
//        System.out.println();
//
//        // 중간 인덱스에 원소 삭제가 일어날 경우
//        int deleteIndex = 3; // 삭제할 원소의 인덱스
//        students[deleteIndex] = null; // 삭제할 인덳스의 원소를 null으로 변경
//        for(int i = deleteIndex; i < students.length-1; i++) {
//            students[i] = students[i+1];
//            System.out.println(Arrays.toString(students));
//        }
//        students = Arrays.copyOf(students, students.length-1);
//
//        System.out.print("[Deletion Result] : ");
//        System.out.println(Arrays.toString(students));
//        System.out.println();

        // Q2. ArrayList와 Vector의 차이를 비교하여 어떤 경우에 Vector를 사용하면 좋을지 서술하시오.
        // ArrayList: 동기화 지원 X
        // Vector   : 동기화 지원 O
        // 동기화 지원이 된다는 것은 두 스레드 (스레드 A, 스레드 B)에서 하나의 공유 객체에 동시 접근할 때,
        // 스레드 A가 이미 공유 객체에 점유하고 있다고 하면 스레드 B에서는 접근하지 못하는 것을 말한다.
        // 만약 공유 객체가 ArrayList으로 구현이 되어 있으면 두 스레드 (스레드 A, 스레드 B)가 번갈아가며 접근할 수 있음을 의미한다.
        // 만약 공유 객체가 Vector으로 구현이 되어 있으면 하나의 스레드 A가 공유 객체를 점유하고 있으면 다른 스레드 B가 접근할 수 없음을 의미한다.
//        MyArrayList<Integer> myArrayList = new MyArrayList<>();
//        MyVector<Integer> myVector = new MyVector<>();
//
//        Thread th1 = new Thread("Thread-1") {
//            @Override
//            public void run() {
//                myArrayList.add(100);
//            }
//        };
//        Thread th2 = new Thread("Thread-2") {
//            @Override
//            public void run() {
//                myArrayList.add(100);
//            }
//        };
//        Thread th3 = new Thread("Thread-3") {
//            @Override
//            public void run() {
//                myVector.add(100);
//            }
//        };
//        Thread th4 = new Thread("Thread-4") {
//            @Override
//            public void run() {
//                myVector.add(100);
//            }
//        };
//        th1.start();
//        th2.start();
//        th3.start();
//        th4.start();
//        System.out.println();

        // Q3. ArrayList와 LinkedList의 차이를 비교하여 어떤 경우에 ArrayList를 사용하고 어떤 경우에 LinkedList를 사용하면 좋을지 서술하시오.

        // ArrayList는 컬렉션에 이미 원소의 삽입이나 삭제가 거의 없이 저장되어있는 원소를 자주 검색해야할 데이터의 경우에 사용하면 좋다.
        // 왜냐하면, ArrayList는 Array의 성질을 가지기 때문에 주소의 순서와 인덱스의 순서가 항상 같다.
        // 따라서, 첫 시작 주소만 알고 있으면 다음 인덱스의 주소를 유추하고 다음 인덱스를 계산하기 쉬워지는 것이다.
        // 따라서, ArrayList는 원소를 자주 검색해야할 경우에 용이하다.

        // 그러나,
        // LinkedList는 주소의 순서와 인덱스 순서가 다를 수 있다.
        // 왜냐하면, 원소의 삽입, 삭제를 용이하게 하기 위해서 하나의 노드에서는 해당 노드의 데이터와 다음 원소의 주소를 가지고 있어서 다음 원소의 주소는 항상 순서가 일정하지 않을 수 있기 때문이다.
        // 첫 시작 주소를 알고 있어도 다음 인덱스의 주소를 유추하기 위해서는 결국 각 노드에 저장되어있는 다음 원소의 주소를 통해 원소들을 검색하면서 인덱스를 부여해야한다.
        // 따라서, LinkedList는 원소를 자주 검색하는 것보다는 원소의 삽입이나 삭제가 자주 일어나는 데이터의 경우에 사용하면 좋다.



        // Q4. 구트 학교의 입학 기간이라 다수의 학생 객체를 DB에 추가해야한다고 가정하자.
        // 어떤 컬렉션에 학생 객체를 저장하면 좋을 지 생각해보고 s1 ~ s5의 객체를 해당 컬렉션에 추가해보자.
        // (☘️ 여기서 데이터베이스 (DB)는 마치 객체 배열처럼 객체 (데이터)를 저장하는 공간입니다.)
        List<Student> linkedlist = new LinkedList<>();
        linkedlist.add(s1);
        linkedlist.add(s2);
        linkedlist.add(s3);
        linkedlist.add(s4);
        linkedlist.add(s5);
        System.out.println(linkedlist);


        // Q5. 구트 학교의 방학 기간 전에 학생들에게 성적 통지서를 전송하기 위해 조회해야하는 학생 객체가 많다고 가정하자.
        // 어떤 컬렉션에 객체를 저장하면 좋을 지 생각해보고  s1 ~ s5의 객체를 해당 컬렉션에 추가해보자.
        List<Student> arraylist = new ArrayList<>();
        arraylist.add(s1);
        arraylist.add(s2);
        arraylist.add(s3);
        arraylist.add(s4);
        arraylist.add(s5);
        System.out.println(arraylist);
        System.out.println();

        // Q6. Q4, Q5 중에 하나의 컬렉션에 학생 객체를 저장하고 다음과 같은 작업을 수행해보자.
        // => arraylist 사용


        // (1) 80점을 가진 객체가 있는지 확인하는 코드를 작성하시오.
        List<Student> studentList1 = new LinkedList<>(); // 검색 결과를 저장할 linkedlist
        int i = 0;
        for(i = 0; i < arraylist.size(); i++) {
            if(arraylist.get(i).getScore() == 80) {
                studentList1.add(arraylist.get(i));
            }
        }
        if(studentList1.size() == 0) {
            System.out.println("No student having score 80");
        }
        else {
            System.out.println("There are students having score 80");
            System.out.println(studentList1);
        }


        // (2) 100점을 가진 객체가 있는지 확인하는 코드를 작성하시오.
        List<Student> studentList2 = new LinkedList<>(); // 검색 결과를 저장할 linkedlist
        for(i = 0; i < arraylist.size(); i++) {
            if(arraylist.get(i).getScore() == 80) {
                studentList2.add(arraylist.get(i));
            }
        }
        if(studentList2.size() == 0) {
            System.out.println("No student having score 100");
        }
        else {
            System.out.println("There are students having score 100");
            System.out.println(studentList1);
        }
        System.out.println();

        // (3) 객체 s1의 성적이 90점에서 98점으로 변경하는 코드를 작성하시오.
        s1.setScore(98);
        System.out.println(s1);
        System.out.println();
        // 이렇게 작성해도 arraylist나 linkedlist의 s1의 성적도 변경된다.
        // 왜냐하면, arraylist나 linkedlist에는 객체 s1의 주소값이 들어가 있기 때문에 s1의 성적이 90에서 98점으로 변경이 되면 같이 변경이 된다.


        // (4) 컬렉션에 저장된 객체들을 성적을 기준으로 sort()하는 코드를 작성하시오.
        arraylist.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getScore(), o2.getScore());
            }
        });
        System.out.println(arraylist);
        System.out.println();

        // (5) 컬렉션에 저장된 객체들을 학번을 기준으로 sort()하는 코드를 작성하시오.
        arraylist.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getSno(), o2.getSno());
            }
        });
        System.out.println(arraylist);
        System.out.println();

        // Q7. HashSet, HashMap은 객체를 저장하는데 hashing function을 이용해서 객체를 저장한다.
        // 객체를 저장하는데 hashing function를 이용하면 어떤 점이 좋은지 작성하시오.
        // => hashing function은 임의의 길이를 갖는 데이터에 대해 고정된 길이의 데이터로 매핑하는 함수를 의미한다.
        // => hashing function을 통해 데이터를 저장하면 데이터 자체 길이보다 고정된 길이의 데이터로 매핑하므로
        //    데이터 자체에 필요한 총 공간보다 일부의 저장 공간만 필요하므로 데이터 저장 공간을 줄일 수 있다.
        // => hashing function을 알고 있으면 어떤 정렬되지 않은 원소를 찾아낼 때 순차적으로 찾을 필요 없이 해쉬 값을 통해 데이터 저장 위치를 찾을 수 있다.
        // => hashing function는 암호학, 데이터 압축 등 다양한 분야에서 사용된다.


        // Q8. HashSet, HashMap은 객체 삽입 순서가 유지되지 않는데 어떤 기준을 통해 객체가 저장이 되는지 서술하고 만약 객체 삽입 순서가 유지가 되려면 어떤 컬렉션을 사용해야하는지 작성하시오.
        // => HashSet, HashMap은 해쉬값을 결정하는 자바의 hashCode() 함수가 어떻게 정의되어있는 지에 따라 hashCode() 함수 반환값 순서에 맞게 객체가 저장된다.
        //    따라서, 객체의 삽입 순서가 유지되지 않으며 삽입 순서가 유지되도록 하려면 순서가 유지되는 컬렉션인 LinkedHashSet, LinkedHashMap을 이용해야한다.
        HashSet<Student> hashSet = new HashSet<>();

        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s5);
        System.out.println();

        Iterator<Student> iterator = hashSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // Q9. TreeSet, TreeMap은 어떤 객체를 저장하기 위해서 사용하는지 서술하시오. 추가적으로 TreeSet, TreeMap 컬렉션을 사용하려면 어떤 인터페이스를 implements를 해야하는지 작성하시오.
        // => TreeSet, TreeMap은 어떤 기준에 의해 정렬하기 위한 데이터를 저장할 때 사용한다. 따라서 해당 객체를 어떤 기준에 의해 정렬할 것인지에 따라서 객체 비교 방법을 정의하는 인터페이스 (Comparable, Comparator)를 구현해줘야한다.
        // => 여기서, 두 인터페이스는 차이점이 존재하는데 Comparable은 객체가 이미 알고 있는 비교 방법 (기본적인 비교 방법)으르 정의하며
        //    Comparator은 객체가 알고 있지는 않은 새로운 비교 방법을 정의한다. (이미 객체가 알고 있는 방법이 아니므로 보통 ㄴ추가적으로 인자로 전달함)

        // (1) TreeSet에 s1 ~ s5의 객체를 학번 순서대로 저장해보자.
        // => 기본 비교 방법인 Comparable으로 정의하겠다.
        System.out.println("[TreeSet ordered by sno]");
        TreeSet<Student> treeSetbySno = new TreeSet<>();
        treeSetbySno.add(s1);
        treeSetbySno.add(s2);
        treeSetbySno.add(s3);
        treeSetbySno.add(s4);
        treeSetbySno.add(s5);

        iterator = treeSetbySno.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();


        // (2) TreeSet에 s1 ~ s5의 객체를 이름 순서대로 저장해보자.
        // => 새로운 비교 방법인 Comparator으로 정의하겠다.
        System.out.println("[TreeSet ordered by name]");
        TreeSet<Student> treeSetbyName = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        treeSetbyName.add(s1);
        treeSetbyName.add(s2);
        treeSetbyName.add(s3);
        treeSetbyName.add(s4);
        treeSetbyName.add(s5);

        iterator = treeSetbyName.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();


        // (3) TreeSet에 s1 ~ s5의 객체를 성적 순서대로 저장해보자.
        // => 새로운 비교 방법인 Comparator으로 정의하겠다.
        System.out.println("[TreeSet ordered by score]");
        TreeSet<Student> treeSetbyScore = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getScore(), o2.getScore());
            }
        });
        treeSetbyScore.add(s1);
        treeSetbyScore.add(s2);
        treeSetbyScore.add(s3);
        treeSetbyScore.add(s4);
        treeSetbyScore.add(s5);

        iterator = treeSetbyScore.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();


        // Q10. 다음 문장의 O, X를 판단하시오.
        // (1) hashing function을 구현하는 hashCode() 메소드가 동일하면 동일한 객체로 판단한다. (X)
        // => 만약 hashCode() 메소드가 다르면 다른 객체로 판단하지만
        // => hashCode() 메소드가 같다고 하더라도 객체를 이루고 있는 내용물이 같은지 확인하기 위해 equals() 메소드가 같은지 추가적으로 확인한다.

        // (2) Queue는 마지막에 들어온 객체가 먼저 나가는 후입선출 (LIFO)를 따른다. (X)
        // => Queue는 먼저 들어온 객체가 먼저 나가는 선입선출 (FIFO)를 따른다.
        // => 마치 사람들이 줄 서있는 모습과 비슷하게 생겼다고 해서 Queue라고 부른다.
        // => 사람들이 줄 서있을 때, 가장 처음 줄 선 사람이 먼저 들어갈 수 있기 때문이다.

        // (3) Stack은 먼저 들어온 객체가 먼저 나가는 선입선출 (FIFO)를 따른다. (O, X)
        // => Stack는 마지막에 들어온 객체가 먼저 나가는 후입선출 (LIFO)를 따른다.
        // => 마치 책이 쌓여있는 모습과 비슷하게 생겼다고 해서 Stack라고 부른다.
        // => 책이 쌓여있을 때, 당연히 마지막에 올려놓은 책의 타이틀만 확인할 수 있기 때문이다.

        // (4) Set은 들어온 순서를 유지하기 위해서 인덱스를 사용한다. (X)
        // => Set을 구현하기 위해서 보통 HashSet을 사용하는데
        // => Set은 기본적으로 수학에서 이야기하는 집합과 비슷한 개념이기 때문에 순서를 보장하지 않고, 중복을 허용하지 않는다.
        // => 예를 들어, 집합에서 (1, 2, 3)은 (3, 2, 1)과 동일하고,
        //    집합에서 (1, 2, 3, 3)은 (1, 2, 3)과 동일하다.
        // => 따라서, 기본적으로 순서를 보장하지 않기 때문에 인덱스라는 개념이 없다.
        // => 이러한 문제점을 해소하기 위해 만들어진 개념이 LinkedHashSet이다.


        // (5) List는 들어온 순서를 유지하기 위해서 인덱스를 사용한다. (O)
        // => List은 들어온 순서를 유지하는 특성이 있다. 이는 마치 배열처럼 인덱스를 사용한다.

        // (6) Set은 객체 중복 정의가 불가능하다. (O)
        // => Set은 동일한 객체 (hashCode()와 equals()까지 동일한 객쳬)의 중복 정의가 불가능하다.
        // => Set은 기본적으로 수학에서 이야기하는 집합과 비슷한 개념이기 때문에 순서를 보장하지 않고, 중복을 허용하지 않는다.

        // (7) 인덱스 개념이 없는 컬렉션은 iterator()를 이용하여 객체를 반복한다. (O)
        // => 인덱스 개념이 없는 컬렉션은 iterator()를 이용하여 객체를 반복한다.

        // (8) 컬렉션은 Index Out Of Bounds 오류가 발생할 수 있다. (O)
        // => 인덱스 개념이 없는 컬렉션 (Set, Map)은  Index Out Of Bounds가 일어나지 않지만
        //    인덱스 개념이 존재하는 컬렉션 (List)는 인덱스 범위에 해당하지 않는 인덱스를 접근하려고 하면 Index Out Of Bounds가 일어날 수 있다.
        List<String> list = new ArrayList<>();
        list.add("a"); // index: 0
        list.add("b"); // index: 1
        list.add("c"); // index: 2
//        System.out.println(list.get(3)); // exception!


        // (9) Map은 key-value 맵핑으로 구성된 Entry 객체를 저장한다. (O)
        // => Map은 객체 저장 순서를 저장하는 개념인 인덱스를 사용하지 않고 저장할 value의 대표 특성을 나타내는 key 값을 사용한다.
        // => 따라서 Map에는 key-value 맵핑으로 구성된 객체가 저장되며 이를 Entry 객체라고 부른다.

        // (10) Map의 key가 중복될 수 있다. (X)
        // => Map에서 key는 저장되는 value를 구분지어주는 unique한 특성을 가지기 때문에 중복될 수 없다.

        // (11) Map의 value는 중복될 수 있다. (O)
        // => Map에서 value는 중복될 수 있다. ((주의) value을 접근하는 key 값은 달라야한다!!)

        // (12) TreeMap은 key를 기준으로 객체를 정렬하여 삽입한다. (O)
        // => TreeMap은 key를 기준으로 객체를 정렬하여 삽입한다.
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("1", "a");
        treeMap.put("2", "b");
        treeMap.put("0", "c");

        Iterator<String> stringIterator = treeMap.keySet().iterator();
        while(stringIterator.hasNext()) {
            String key = stringIterator.next();
            String value = treeMap.get(key);
            System.out.println(key + ":" + value);
        }
        System.out.println();



        // Q11. 수업시간에 배운 PriorityQueue 예제에서 만약 학번을 이루고 있는 입학연도가 빠를수록 Queue에 저장하는 우선순위를 높여준다고 가정하자.
        // 만약 입학연도가 같을 경우 삽입된 순서대로 객체를 저장하도록 프로그램을 작성해보시오.
        // (☘️ 학번은 입학연도와 학생 번호로 구성되어있다고 가정)
        // (☘️ 추가할 필드가 있으면 추가해도 됩니다.)

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String yearOfAdmissionO1 = String.valueOf(o1.getSno()).substring(0, 4); // o1의 입학년도
                String yearOfAdmissionO2 = String.valueOf(o2.getSno()).substring(0, 4); // o2의 입학년도
                int yearOfAdmissionCompareTo = yearOfAdmissionO1.compareTo(yearOfAdmissionO2); // o1과 o2의 입학년도 비교
                if(yearOfAdmissionCompareTo < 0) return -1;
                else if(yearOfAdmissionCompareTo == 0) { // 만약 입학년도가 같으면 객체 삽입 순서 비교
                    return Integer.compare(o1.getIndex(), o2.getIndex());
                }
                else return 1;
            }
        });
        priorityQueue.add(s1);
        priorityQueue.add(s2);
        priorityQueue.add(s3);
        priorityQueue.add(s4);
        priorityQueue.add(s5);

        while(!priorityQueue.isEmpty()) {
            Student s = priorityQueue.poll();
            System.out.println(s);
        }






    }
}
