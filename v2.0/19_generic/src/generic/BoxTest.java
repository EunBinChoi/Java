package generic;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 생성시에 제너릭의 타입이 결정
		// 제너릭 타입으로 기초 자료형이 올 수 없음 (**)
		// ex) Box<int>, Box<double> ...
//		Box<String> b = new Box<String>();
		Box<String> b = new Box<>();
		// 컴파일러가 문맥을 통해 유추 가능
		
		b.setItem("String Item");
		String s = b.getItem();
			
		///////////////////////////////////
		
		Box<Integer> bi = new Box<>();
		
		bi.setItem(100);
		int i = bi.getItem(); // 자동 언박싱
			
		/////////////////////////////////
		
		Box<SmartPhone> bs = new Box<SmartPhone>();
		
		bs.setItem(new SmartPhone());
		System.out.println(bs.getItem());
		
		SmartPhone sp = bs.getItem();
		
		/////////////////////////////////////////
		int iii = 10;
		Integer ii = iii; // int -> Integer (자동 박싱)
		int iiii = ii;   // Integer -> int (자동 언박싱)
	}

}
