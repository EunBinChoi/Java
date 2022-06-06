package overview;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box();
		b.setItem("String Item"); 
		// Object item = "String item";
		
		int s = (int)b.getItem();
		// TODO try ~ catch
		// why? 컴파일러가 오류를 못잡음!!!!!!!!!! (***)
		// (Object -> int) 형변환 가능
		
		// 실제로 들어가있는 데이터는 String이기 때문에
		// (String -> int) 형변환 불가능해서 실행 오류 ...!
		
		// String s = item; (Object)
		System.out.println(s);
		
		b.setItem(1);
		int i = (int)b.getItem();
		System.out.println(i);
		
		b.setItem(new SmartPhone());
		SmartPhone sp = (SmartPhone)b.getItem();
		System.out.println(sp); // toString이 정의 X
	}

}
