package ex1;

public class Dog {
	// ��ü �� ī��Ʈ
	private static int count = 0;
	private String name;
	public String breed;
	private int age;
	
	Dog(String name, int age){
		this.name = name;
		this.age = age;
		count ++;
	}
	Dog(String name, String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
		count ++;
	}
	public static int getCount() {
		return count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "�̸� : " + name + 
				", ���� : " + breed + 
				", ���� : " + age;
	}
	
}
