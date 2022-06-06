package stream_reduce;

import java.util.*;
import java.util.stream.*;


public class ReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrInt = {10, 2, 5};
		
		int sub = Arrays.stream(arrInt).
				reduce((a, b) -> a - b).getAsInt();
		// (a, b)
		// (10, 2) => 8
		// (8, 5) => 3
		
		System.out.println(sub);
		
		List<String> words = Arrays.asList(
				"banana",
				"watermelon",
				"apple"
				);
		
		// reduce(���ٽ� (���� ������)) �Լ��� ���ؼ� 
		// words �� ���� �� �ܾ ��ȯ
		
		String longestStr = words.stream()
				.reduce("", (str1, str2) 
						-> str1.length() 
						> str2.length() ? 
								str1 : str2);
		System.out.println(longestStr);
		System.out.println();
		
		// "banana watermelon apple"
		System.out.println("[����Ʈ���� �ִ� ��� (String���� ��ȯ)]");
		String concateStrwithDefault = words.stream()
				.reduce("", (str1, str2) 
						// "banana", "watermelon"
						// "banana watermelon", "apple"
						-> str1 + " " + str2);
		System.out.println(concateStrwithDefault);
		System.out.println();
		
		System.out.println("[����Ʈ���� ���� ��� (Optional<String> Ŭ������ ��ȯ)]");
		
		// "banana watermelon apple"
		Optional<String> concateStr = words.stream()
				.reduce((str1, str2) 
						// "banana", "watermelon"
						// "banana watermelon", "apple"
						-> str1 + " " + str2);
		
		
		// ��� 1 (isPresent())
		System.out.print("1) isPresent() : ");
		if(concateStr.isPresent()) 
			System.out.println(concateStr.get());
		
		
		// ��� 2 (orElse)
		System.out.print("2) orElse() : ");
		String str = words.stream()
		.reduce((str1, str2) 
				// "banana", "watermelon"
				// "banana watermelon", "apple"
				-> str1 + " " + str2).orElse("");
		System.out.println(str);
		
		
		// ��� 3 (ifPresent())
		System.out.print("3) ifPresent() : ");
		words.stream()
		.reduce((str1, str2) 
				// "banana", "watermelon"
				// "banana watermelon", "apple"
				-> str1 + " " + str2)
		.ifPresent(s -> System.out.println(s));
		
		
		
		
	}

}
