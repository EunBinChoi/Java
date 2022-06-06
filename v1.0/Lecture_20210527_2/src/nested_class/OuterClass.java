package nested_class;


// ��ø Ŭ���� (nested class):
/* public class {
	 private class {
	 }
    }
*
*/
public class OuterClass {
	private String secret = "Time is money";
	
	// ������
	public OuterClass() {
		InnerClass obj = new InnerClass();
		obj.method();
	}
	
	private class InnerClass{
		public InnerClass() {
			System.out.println("���� Ŭ���� ������");
		}
		public void method() {
			System.out.println(secret);
		}
	}
	
	
}
