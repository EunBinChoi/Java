package system_class_gc;

public class GCExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e;
		
		e = new Employee(1);
		e = new Employee(2);
		e = new Employee(3);
		
		System.out.println("e�� �����ϴ� ��� ��ȣ" + e.eno);
		System.gc();
	}

}

class Employee{
	int eno;
	
	public Employee(int eno) { // ������
		this.eno = eno;
		System.out.println(eno +"�� �޸𸮿� ����");
	}
	
	@Override
	public void finalize() { // �Ҹ���
		System.out.println(eno +"�� �޸𸮿� ����");
	}
}