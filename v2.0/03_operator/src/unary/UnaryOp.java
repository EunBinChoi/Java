package unary;

public class UnaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 단항 연산자 (unary operator)
		// 1. 부호 연산자 (+, -)
		int a = 3;
		int b = -a;
		System.out.println(b);
		
		int c = +a;
		System.out.println(c);
		
		// 2. 증감 연산자 (증가하거나 감소하거나)
		a = 3;
		++a; // a = a + 1;
		a++; // a = a + 1;
		System.out.println(a); // 5
		
		--a; // a = a - 1;
		a--; // a = a - 1;
		System.out.println(a); // 3
		
		// ++a vs a++
		int var = 10;
		int res = ++var; // -- 1)
		// a) ++var (var = var + 1) // 11
		// b) res = var // 11
		System.out.println(var); // 11
		System.out.println(res); // 11
		
		res = var++; // -- 2)
		// a) res = var // 11
		// b) var++ (var = var + 1)
		System.out.println(var); // 12
		System.out.println(res); // 11 ?????
		
	}

}
