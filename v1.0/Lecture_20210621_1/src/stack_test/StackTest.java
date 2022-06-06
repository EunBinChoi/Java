package stack_test;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Book> book = new Stack<>();
		book.push(new Book("�ظ�����"));
		book.push(new Book("���ΰ� �ٴ�"));
		book.push(new Book("������ ������"));
		
		System.out.println(book.peek().getTitle());
		
		while(!book.isEmpty()) {
			Book popBook = book.pop();
			System.out.println("���� å �̸� : " 
			+ popBook.getTitle());
		}
		
	}

}
