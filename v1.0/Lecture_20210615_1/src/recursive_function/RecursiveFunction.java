package recursive_function;
import java.util.Scanner;
public class RecursiveFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 재귀 함수 (Recursive Function)
		 * : 함수 내에서 자기 함수를 호출하는 함수
		 * 
		 * 재귀 호출을 하는 부분
		 * 재귀 호출을 멈추는 부분: return
		 * 
		 * */
		//print("hello");
		// 피보나치 수열
		// fibo(n) = fibo(n - 1) + fibo(n - 2) // for문?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구하고자 하는 항 입력: ");
		int n = sc.nextInt();
		
		long start = System.nanoTime();
		int fibo_res = fibo_for(n);
		System.out.println("결과값: " + fibo_res);
		long end = System.nanoTime();
		System.out.println("실행 시간: " + (end - start)) ;

		start = System.nanoTime();
		fibo_res = fibo_recur(n);
		System.out.println("결과값: " + fibo_res);
		end = System.nanoTime();
		System.out.println("실행 시간: " + (end - start));
		
		// 1 x 2 x 3 x... x n = factorial(n)
		// => recursive, for (함수)
		int fact_res = fact_for(5);
		System.out.println("fact 결과 : " + fact_res);
		fact_res = fact_recur(5);
		System.out.println("fact 결과 : " + fact_res);
	}
	public static void print(String s) {
		System.out.println(s);
		print(s);
	}
	
	public static int fact_for(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i ++) {
			fact *= i;
		}
		return fact;
	}
	public static int fact_recur(int n) {
		if (n <= 1) return 1;
		return n * fact_recur(n - 1);
	}
	public static int fibo_recur(int n) {
		if(n == 0) return 0;
		else if(n == 1) return 1;
		else return fibo_recur(n - 1) + fibo_recur(n - 2);
	}
	// 항: 0 1 2 3 4 5 ..
	// 값: 0 1 1 2 3 5 ..
	//    a b c
	//      a b c
	public static int fibo_for(int n) {
		int a = 0; // 0항
		int b = 1; // 1항
		int c = 0; // 초기화
		for(int i = 2; i <= n; i ++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

}
