package treeset_member;

public class Member implements Comparable<Member> {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() { // "abc", 30
		return name.charAt(0) + age;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Member)) return false;
		Member other = (Member) obj;
		return age == other.age && name.equals(other.getName());
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	// 1) 나이 오름차순 정렬
	// 2) 만약 나이가 같으면 이름 오름차순 정렬
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		if(age < o.age) return -1;
		else if(age == o.age) {
			return name.compareTo(o.name);
		}
		else return 1;
	}
	
}
