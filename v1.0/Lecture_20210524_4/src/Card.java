
public class Card {
	private final String kind; // ����
	private final int num; // ����
	
	private int count = 0; // ��ü ��
	private final static int width = 100;
	private final static int height = 250;
	/*
	 * final: �� �̻� �����͸� �ٲ� �� ���� (��� ����)
	 * 
	 * static: ���� Ŭ���� �ȿ��� ��� ��ü���� 
	 * ������ width, height�� ����
	 * 
	 * */
	
	public Card(String k, int n) {
		this.kind = k;
		this.num = n;
		count ++;
	}
	
	public int getCount() {
		return count;
	}
	
	public String getKind() {
		return kind;
	}
	
	public int getNum() {
		return num;
	}
	
	public static int getWidth() {
		return width;
	}
	public static int getHeight() {
		return height;
	}
	
	public String toString() {
//		return "���� : " + this.kind + ", " +
//				"���� : " + this.num + ", " +
//				"���� : " + Card.width + ", " +
//				"���� : " + Card.height;
		return String.format("���� : %5s, ���� : %2d, "
				+ "���� : %3d, ���� : %3d", 
				this.kind, this.num, Card.width, Card.height);
	}
	
	
}
