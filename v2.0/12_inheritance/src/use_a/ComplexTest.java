package use_a;

public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(3, 5);
		Complex c2 = new Complex(2, 4);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
		
		Complex addRes = c1.add(c2); // c1�� ���Ѵ� c2�� ������
		// c1�� add�� ��ü�� �ǰ� ����
		// => ��ü���� ���α׷���
		Complex subRes = c1.sub(c2);
		System.out.println(addRes);
		System.out.println(subRes);
		System.out.println();
		
		addRes 
		= c1.add(c2.getReal(), c2.getImag());
		
		addRes = add2(c1, c2); // ���Ѵ� c1, c2�� ������
		subRes = sub2(c1, c2);
		System.out.println(addRes);
		System.out.println(subRes);
	}
	public static Complex add2(Complex c1, Complex c2) {
		double realRes = c1.getReal() + c2.getReal();
		double imagRes = c1.getImag() + c2.getImag();
		return new Complex(realRes, imagRes);
	}
	public static Complex sub2(Complex c1, Complex c2) {
		double realRes = c1.getReal() - c2.getReal();
		double imagRes = c1.getImag() - c2.getImag();
		return new Complex(realRes, imagRes);
	}
}
