package generic_method;

// 제너릭 적용
// <T>: T는 타입 파라미터 (T, K, V, R, E)
// T: type
// K: key
// V: value
// R: return type 
// E: element (배열에서)

public class Box<T> {
	private T item; 
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return item + " in box";
	}
}
