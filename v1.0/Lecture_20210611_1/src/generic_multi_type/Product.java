package generic_multi_type;

public class Product<T, M> {
	T kind; // ���� (SmartPhone, TV, �����, ��Ź��)
	M model; // �� (String)
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
