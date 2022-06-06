package static_variable2;

public class Card {
	private String kind; // 무늬 (하트, 스페이드, 다이아몬드, 클로바)
	private String num; // 숫자 (k, q, j, a, 2 ~ 10)
	
	private static final int width = 100; // 수정 불가능
	private static final int height = 250; // 수정 불가능
	private static int count = 0; // 카드의 수 (수정 가능)
	
	// 1) 생성자
	public Card() { // 빈 생성자 (디폴트 생성자)
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
	@Override // 재정의 (Object 클래스의 함수를 재정의)
	public boolean equals(Object c) {
		if(this.kind.equals(((Card)c).kind) 
				&& this.num.equals(((Card)c).num)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/* Override (오버라이드, 재정의): 위에 클래스 (부모 클래스)에 정의되어있는 함수를 자식 클래스에 맞게 다시 정의
	 * Overload (오버로드, 중복 정의): 함수 중복 정의 (함수명은 같고 매개변수 순서/개수/타입 다르게 정의)
	 * ex) 생성자 (Card(), Card(String kind, String num))
	 * */
}
