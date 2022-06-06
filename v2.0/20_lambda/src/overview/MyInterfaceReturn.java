package overview;

@FunctionalInterface
public interface MyInterfaceReturn {
	int a = 3; // ��� ���ǵ� ����
	public int methodWithReturn(int param, int step);
	
	// @FunctionalInterface���� default, static ���� ����
	public default int defaultMethodWithReturn(int param, int step) {
		return 0;
	}
	public static int staticMethodWithReturn(int param, int step) {
		return 0;
	}
}
