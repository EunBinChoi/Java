package treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> scores = new TreeSet<>(); 
		// 이진 트리 원소 저장 (오름차순 정렬) -> 검색 성능 향상 (**)
		// (이진 트리? 자식 노드가 최대 2개가 오는 트리)
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		int score;
		score = scores.last(); // 제일 높은 점수 출력
		System.out.println(score);
		
		score = scores.first(); // 제일 낮은 점수 출력
		System.out.println(score);
		
		score = scores.lower(90); // 90점 바로 아래 점수 출력
		System.out.println(score);
		
		score = scores.higher(70); // 70점 바로 위 점수 출력
		System.out.println(score);
		
		score = scores.floor(98); 
		// 98점과 동일한 점수가 있으면 동일한 점수 출력
		// 만약 없으면 98점 바로 아래 점수 출력
		System.out.println(score);
		
		score = scores.ceiling(76);
		// 76점과 동일한 점수가 있으면 동일한 점수 출력
		// 만약 없으면 76점 바로 위 점수 출력
		
		// TreeSet의 원소들을 오름차순 출력
		// size()
		System.out.println(scores);
		for(int i = 0; i < scores.size(); i++) {
			if(i == 0) score = scores.first();
			else score = scores.higher(score);
			System.out.print(score + " ");
		}
		System.out.println();
		score = scores.pollFirst(); // 가장 작은 원소를 컬렉션에서 꺼냄
		System.out.println(score);
		System.out.println(scores);
		score = scores.pollFirst();
		System.out.println(score);
		System.out.println(scores);
		score = scores.pollFirst();
		System.out.println(score);
		System.out.println(scores);
		score = scores.pollFirst();
		System.out.println(score);
		System.out.println(scores);
		score = scores.pollFirst();
		System.out.println(score);
		System.out.println(scores);
		
		scores.pollLast(); // 제일 큰 원소를 컬렉션에서 꺼냄
	}

}
