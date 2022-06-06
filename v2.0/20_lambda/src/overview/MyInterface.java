package overview;

// 람다식을 작성하기 위해서 도와주는 인터페이스
// 람다식을 작성하기 위해 인터페이스 안에 추상 메서드 1개 (**)가 필요함
@FunctionalInterface
public interface MyInterface {
	public void method(); // 추상메서드
//	public void otherMethod(); // 오류 ...
}
