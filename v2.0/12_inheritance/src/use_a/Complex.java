package use_a;

public class Complex {
	private double real; // 실수
	private double imag; // 허수
	
	// 생성자
	public Complex() {}
	public Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	// setter, getter
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	
	// 사용 관계
	// (3 + 5i) + (4 + 2i) == (3 + 4) + (5 + 2)i 
	// c1.add(c2)
	public Complex add(Complex c) {
		double realRes = this.real + c.real;
		double imagRes = this.imag + c.imag;
		return new Complex(realRes, imagRes);
	}
	
	public Complex add(double r, double i) {
		double realRes = this.real + r;
		double imagRes = this.imag + i;
		return new Complex(realRes, imagRes);
	}
	
	// (3 + 5i) - (4 + 2i) == (3 - 4) + (5 - 2)i 
	// c1.add(c2)
	public Complex sub(Complex c) {
		double realRes = this.real - c.real;
		double imagRes = this.imag - c.imag;
		return new Complex(realRes, imagRes);
	}
	
	// toString, equals
	@Override
	public String toString() {
		return String.format("%5.2f + %5.2fi", real, imag);
	}
	
	@Override
	public boolean equals(Object o) {
		return this.real == ((Complex)o).real &&
				this.imag == ((Complex)o).imag;
	}
}
