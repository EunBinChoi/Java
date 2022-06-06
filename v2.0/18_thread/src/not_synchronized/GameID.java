package not_synchronized;

public class GameID {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		
		// 변경된 아이디를 데이터베이스에 접근해서 수정하려면 시간이 좀 걸림...!
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.id);
	}
}
