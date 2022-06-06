import java.util.Scanner;
public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int int;
		// double double;
		// 1¹ø
		int money; // ¹Þ´Â µ·
		int total; // »óÇ° ÃÑ¾×
		double tax;
		int change;
		Scanner input = new Scanner(System.in);
		
		System.out.print("¹ÞÀº µ· : ");
		money = input.nextInt();
		
		System.out.print("»óÇ° ÃÑ¾× : ");
		total = input.nextInt();
		
		tax = total * 0.1;
		change = money - total;
		
	}

}
