package parallel_process;

import java.util.*; // Collection
import java.util.stream.Stream;


public class ParallelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList(
				"����", "����", "���ξ���");
		
		// ���� ó��
		Stream<String> stream = list.stream();
		stream.forEach(s -> print(s));
		System.out.println();
		
		// ���� ó��
		Stream<String> pstream = list.parallelStream();
		pstream.forEach(s -> print(s));
	}
	public static void print(String str) {
		System.out.println(str + " : "
				+ Thread.currentThread().getName());
	}
}
