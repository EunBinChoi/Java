package ex1;


/*
 * */

public class Book {
	protected String title;
	protected int page;
	protected String author;
	
	// ������ �� ���� �����ε� (overload)
	public Book() {
//		title = null;
//		page = 0;
//		author = null;
		
		this(null, 0, null);
		// null: ������ ��ü�� ���� ��� (�ּҰ��� ����)
		
	}
	
	public Book(String title, int page, String author) {
		this.title = title;
		this.page = page;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/*
	 * �������̵� (override): ��ӹ��� �޼����� ���� ����
	 * �����ε� (overload): ������ �̸��� �޼��带 �ߺ� ����
	 * 
	 * ��ȯ�� �Լ��̸� (�Ű�����)
	 * => �Լ� �̸� ����
	 * => �Ű������� Ÿ��, ����, ���� �� �ϳ��� �޶�� ��
	 * => ��ȯ���� ������ ��ġ�� ����
	 * 
	 * void method(String s, int i) - 1
	 * void method(int i, String s) - 2
	 * int method(int i, String s) - 3
	 * 
	 * */
	@Override
	public String toString() {
		return "���� :" + title + ", �������� : " + page + ", ���� : " + author;
	}

}
