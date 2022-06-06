package generic_method;


public class SmartPhone {
	private String phoneNum;
	private int numOfCameras;
	private int numOfSensors;
	
	public SmartPhone() {}
	public SmartPhone(String phoneNum, int numOfCameras, int numOfSensors) {
		this.phoneNum = phoneNum;
		this.numOfCameras = numOfCameras;
		this.numOfSensors = numOfSensors;
	}
	
	// ¸Þ¼­µå
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getNumOfCameras() {
		return numOfCameras;
	}
	public void setNumOfCameras(int numOfCameras) {
		this.numOfCameras = numOfCameras;
	}
	public int getNumOfSensors() {
		return numOfSensors;
	}
	public void setNumOfSecsors(int numOfSensors) {
		this.numOfSensors = numOfSensors;
	}
	
	@Override
	public String toString() {
		return String.format("[SmartPhone] Phone Number : %s, Number of Cameras : %d, Number of Sensors : %d",
				phoneNum, numOfCameras, numOfSensors);
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof SmartPhone)) return false;
		return this.phoneNum.equals(((SmartPhone) o).phoneNum) 
				&& this.numOfCameras == ((SmartPhone) o).numOfCameras
				&& this.numOfSensors == ((SmartPhone) o).numOfSensors;
	}
}
