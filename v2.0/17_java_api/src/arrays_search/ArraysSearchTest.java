package arrays_search;

import java.util.Arrays;

public class ArraysSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arrays method: 모두 static으로 정의
		// - binarySearch(): 배열 안에서 원소값을 찾아 인덱스 반환
		// - 조건: 배열의 원소가 오름차순 정렬 (**)
		
		int[] scores = {98, 70, 80, 80};
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores)); // "[70, 80, 80, 98]"
		
		int index = Arrays.binarySearch(scores, 98);
		System.out.println(index);
		
		Person p1 = new Person("hong", 60, "m", new int[] {10, 20, 30});
		Person p2 = new Person("park", 50, "m", new int[] {10, 20, 30});
		Person p3 = new Person("kim", 30, "m", new int[] {10, 20, 30});
		Person[] p = {p1, p2, p3};
		
		// 1) 나이 오름차순으로 정렬
		Arrays.sort(p);
		System.out.println(Arrays.toString(p));
		
		// 2) 30살인 사람 객체의 인덱스 검색
		index = Arrays.binarySearch(p, new Person(null, 30, null));
		System.out.println(index);
		
		int[] pAges = new int[p.length];
		for(int i = 0; i < pAges.length; i++) {
			pAges[i] = p[i].getAge();
		}
		System.out.println(Arrays.toString(pAges));
		index = Arrays.binarySearch(pAges, 30);
		System.out.println(index);
		System.out.println(p[index]);
	}

}
