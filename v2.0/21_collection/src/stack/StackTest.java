package stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Book> books = new Stack<>();
		
		// 스택에 원소 삽입
		books.push(new Book("Harry Potter"));
		books.push(new Book("Christmas Carol"));
		books.push(new Book("War and Peace"));
		books.push(new Book("Clean Code"));
		books.push(new Book("Effective Java"));
		
		// 스택에서 맨 위에 있는 객체를 가져옴 (스택에서 제거 X)
		System.out.println(books.size()); // 5
		System.out.println(books.peek());
		System.out.println(books.size()); // 5
		System.out.println();
		
		// 스택에서 맨 위에 있는 객체를 가져옴 (스택에서 제거 O)
		System.out.println(books.size()); // 5
		System.out.println(books.pop());
		System.out.println(books.size()); // 4
		System.out.println();
		
		
		while(!books.isEmpty()) {
			Book popBook = books.pop(); 
			// 스택에서 맨 위에 있는 객체를 가져옴 (스택에서 제거 O)
			// 들어간 순서와 반대로 스택에서 꺼내옴 (후입선출, LIFO)
			System.out.println(popBook);
		}
	}

}
