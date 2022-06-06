package overview;

public class Box {
	// item (String, Integer, Double, SmartPhone, TabletPC ...)
	private Object item; 
	// 모든 클래스의 부모 클래스이기 때문
	// 자식 객체가 부모 객체 변수에 들어가서 살 수 있음 (다형성)
	
	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
}
