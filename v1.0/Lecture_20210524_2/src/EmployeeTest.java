
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(1234, "������",
				"������", "����");
//		int i = e.getId();
//		System.out.println(i);
//		
		
		//System.out.println(e.id);
		System.out.println(e.getId());
		
//		String s = e.getName();
//		System.out.println(s);
		
		System.out.println(e.getName());
		
//		String d = e.getDepart();
//		System.out.println(d);
		
		System.out.println(e.getDepart());
		
//		String p = e.getPosition();
//		System.out.println(p);
		
		System.out.println(e.getPosition());
		
		// e.name = "������";
		e.setName("������");
		System.out.println(e.getName());
		
		System.out.println(e);
		System.out.println(e);
		
//		String s = "Hello";
//		System.out.println(s);
	}

}
