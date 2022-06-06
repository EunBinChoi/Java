package stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Book> books = new Stack<>();
		
		// ���ÿ� ���� ����
		books.push(new Book("Harry Potter"));
		books.push(new Book("Christmas Carol"));
		books.push(new Book("War and Peace"));
		books.push(new Book("Clean Code"));
		books.push(new Book("Effective Java"));
		
		// ���ÿ��� �� ���� �ִ� ��ü�� ������ (���ÿ��� ���� X)
		System.out.println(books.size()); // 5
		System.out.println(books.peek());
		System.out.println(books.size()); // 5
		System.out.println();
		
		// ���ÿ��� �� ���� �ִ� ��ü�� ������ (���ÿ��� ���� O)
		System.out.println(books.size()); // 5
		System.out.println(books.pop());
		System.out.println(books.size()); // 4
		System.out.println();
		
		
		while(!books.isEmpty()) {
			Book popBook = books.pop(); 
			// ���ÿ��� �� ���� �ִ� ��ü�� ������ (���ÿ��� ���� O)
			// �� ������ �ݴ�� ���ÿ��� ������ (���Լ���, LIFO)
			System.out.println(popBook);
		}
	}

}
