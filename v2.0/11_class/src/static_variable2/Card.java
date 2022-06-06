package static_variable2;

public class Card {
	private String kind; // ���� (��Ʈ, �����̵�, ���̾Ƹ��, Ŭ�ι�)
	private String num; // ���� (k, q, j, a, 2 ~ 10)
	
	private static final int width = 100; // ���� �Ұ���
	private static final int height = 250; // ���� �Ұ���
	private static int count = 0; // ī���� �� (���� ����)
	
	// 1) ������
	public Card() { // �� ������ (����Ʈ ������)
		count++;
	}
	public Card(String kind, String num) {
		this.kind = kind;
		this.num = num;
		count++;
	}
	// 2) getter, setter
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public static int getWidth() {
		return width;
	}
	public static int getHeight() {
		return height;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Card.count = count;
	}
	
	// 3) toString()
	@Override
	public String toString() {
		return String.format(
				"kind: %s, num: %s, width: %d, height: %d", 
				this.kind, this.num, Card.width, Card.height);
	}
	// s1.equals(s2)
	// 4) equals()
	@Override // ������ (Object Ŭ������ �Լ��� ������)
	public boolean equals(Object c) {
		if(this.kind.equals(((Card)c).kind) 
				&& this.num.equals(((Card)c).num)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/* Override (�������̵�, ������): ���� Ŭ���� (�θ� Ŭ����)�� ���ǵǾ��ִ� �Լ��� �ڽ� Ŭ������ �°� �ٽ� ����
	 * Overload (�����ε�, �ߺ� ����): �Լ� �ߺ� ���� (�Լ����� ���� �Ű����� ����/����/Ÿ�� �ٸ��� ����)
	 * ex) ������ (Card(), Card(String kind, String num))
	 * */
}
