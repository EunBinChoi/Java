package generic_multi_parameter;

public class Product<K, M> {
	private K kind;// ��ǰ ���� (�ڵ���, Ƽ��, ����)
	private M modelNO; // ��ǰ �� ��ȣ ("MOBILE1234", 123)
	
	// ������
	public Product() {}
	public Product(K kind, M modelNO) {
		this.kind = kind;
		this.modelNO = modelNO;
	}
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModelNO() {
		return modelNO;
	}
	public void setModelNO(M modelNO) {
		this.modelNO = modelNO;
	}
	
	// toString, equals
	
	@Override
	public String toString() {
		return String.format("KIND : %s\nMODEL NO. : %s", kind, modelNO);
	}
	
	@Override
	public boolean equals(Object o) { 
		if(o == null) return false;
		if(!(o instanceof Product<?, ?>)) return false;
		
		/* ��ü o�� �ʵ� (kind, modelNO) 
		 * ��ü���� ������Ÿ���� �𸣱� ������
		 * ���� ������Ÿ���� �� ��쿡�� ?�� �ۼ��� �� ����
		 * => ?: ���ϵ� ī�� (wild card)
		 * 
		 * Product<SmartPhone, String> p1 = new Product<>();
		 * Product<SmartTV, String> p2 = new Product<>();
		 * p1.equals(p2)
		 * */
		return this.kind.equals(((Product<?, ?>)o).kind)
			&& this.modelNO.equals(((Product<?, ?>)o).modelNO);
	}
}
