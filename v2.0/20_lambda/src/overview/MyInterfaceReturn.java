package overview;

@FunctionalInterface
public interface MyInterfaceReturn {
	int a = 3; // 상수 정의도 가능
	public int methodWithReturn(int param, int step);
	
	// @FunctionalInterface에서 default, static 구현 가능
	public default int defaultMethodWithReturn(int param, int step) {
		return 0;
	}
	public static int staticMethodWithReturn(int param, int step) {
		return 0;
	}
}
