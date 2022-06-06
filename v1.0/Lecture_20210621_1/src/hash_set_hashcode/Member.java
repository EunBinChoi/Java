package hash_set_hashcode;

public class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// ������ �غ���!
	// name��
	// age�� �����ؾ� ��
	@Override // Object Ŭ������ �ִ� �Լ�
	public boolean equals(Object obj) {
		if (!(obj instanceof Member)) return false;
		
		// obj instanceof Member: true
		return ((Member)obj).name.equals(name) &&
				((Member)obj).age == age;
	}
	
	// ("ȫ�浿", 40), ("ȫ���", 35)
	// 1. �ؽ��ڵ尡 �ٸ��ٸ� hashSet�� ������ �� ����
	// 2. �ؽ��ڵ尡 ���ٸ� (hashCode())
	//   ��ü ���빰���� �������� Ȯ�� (equals())
	//   hashSet�� ������ �� ����
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
