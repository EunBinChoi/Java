package overview;

public class MyInterfaceTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface f1; // 아직 구현이 안된 추상 메서드 1개 존재함
		// 필요로 할 때 추상 메서드를 재정의하고 호출
		f1 = () -> { System.out.println("hello lambda!"); };
		f1 = () -> System.out.println("hello lambda!");
		// 매개변수가 없을 경우에는 소괄호 생략이 불가능
		// 실행할 문장이 하나인 경우 중괄호 생략이 가능
		f1.method();
		
		MyInterfaceParam f2;
		f2 = (a) -> { System.out.println(a); };
		f2 = a -> System.out.println(a);
		// 매개변수가 하나인 경우 소괄호 생략이 가능
		// 실행할 문장이 하나인 경우 중괄호 생략이 가능
		f2.methodWithParam(100);
		
		MyInterfaceReturn f3;
		f3 = (a, b) -> { return a * b; };
		f3 = (a, b) -> a * b;
		// 매개변수가 두 개 이상인 경우 소괄호 생략이 불가능
		// 실행할 문장이 하나인 경우 중괄호 생략이 가능 
		// => 실행할 문장이 return이 포함된 경우 return 같이 생략을 해야함
		int res = f3.methodWithReturn(10, 3);
		System.out.println(res);
		
		
		f3 = (a, b) -> a + b;
		res = f3.methodWithReturn(3, 5);
		

		//f2 = (a) -> System.out.println(a);
		f2.methodWithParam(res);
		
	}

}

