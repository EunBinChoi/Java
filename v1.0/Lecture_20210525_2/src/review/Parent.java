package review;

public class Parent extends Person{
	protected String job;
	protected int property;
	protected String weddingDate;
	protected boolean isMarried;
	
	public Parent() {}
	public Parent(String name, String regNum) {
		super(name, regNum);
	}
	
	public Parent(String name, String regNum, 
			String job, int property) {
		super(name, regNum);
		this.job = job;
		this.property = property;
	}
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getProperty() {
		return property;
	}
	public void setProperty(int property) {
		this.property = property;
	}
	public String getWeddingDate() {
		return weddingDate;
	}
	public void setWeddingDate(String weddingDate) {
		this.weddingDate = weddingDate;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public String toString() {
		
		String returnStr = 
				String.format("%s, ���� : %6s, ��� : %,d (����) ", 
						super.toString(), job, property);
		
		if(job == null) {
			returnStr = 
					String.format("%s, ��� : %,d (����) ", 
							super.toString(), property);
		}
		
		if(property == 0) {
			returnStr = 
					String.format("%s", super.toString());
		}
		
		if(isMarried) {
			returnStr += ", ��ȥ ����: " + isMarried + ", ��ȥ ����� : " + weddingDate;
		}
		
		return returnStr;
			 
					
	}
	
}
