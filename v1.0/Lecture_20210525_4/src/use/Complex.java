package use;

// 3 + 5i
// 2 + 5i
public class Complex {
	private double real; // �Ǽ�
	private double imag; // ���
	
	public Complex(double r, double i) {
		real = r;
		imag = i;
	}
	
	// ��� ����
	public Complex add(Complex c) {
		double resReal = real + c.getReal();
		double resImag = imag + c.getImag();
		return new Complex(resReal, resImag);
	}

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
	@Override
	public String toString() {
		return String.format("%.2f + %.2fi", real, imag);
	}
	
	
}
