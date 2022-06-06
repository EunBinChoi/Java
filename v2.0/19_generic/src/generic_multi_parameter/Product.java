package generic_multi_parameter;

public class Product<K, M> {
	private K kind;// 제품 종류 (핸드폰, 티비, 냉장)
	private M modelNO; // 제품 모델 번호 ("MOBILE1234", 123)
	
	// 생성자
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
		
		/* 객체 o의 필드 (kind, modelNO) 
		 * 구체적인 데이터타입을 모르기 때문에
		 * 아직 데이터타입을 모를 경우에는 ?를 작성할 수 있음
		 * => ?: 와일드 카드 (wild card)
		 * 
		 * Product<SmartPhone, String> p1 = new Product<>();
		 * Product<SmartTV, String> p2 = new Product<>();
		 * p1.equals(p2)
		 * */
		return this.kind.equals(((Product<?, ?>)o).kind)
			&& this.modelNO.equals(((Product<?, ?>)o).modelNO);
	}
}
