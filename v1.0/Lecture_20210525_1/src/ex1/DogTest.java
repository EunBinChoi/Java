package ex1;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1 = new Dog("�п�", 10);
		Dog d2 = new Dog("�п�", "��ũ���׸���", 13);
		
		d1.setBreed("������");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(Dog.getCount());
		
		
	}

}
