package generic_extends;

public class SmartRefrig extends Electronics {
	private double tempOfFridge;
	private double tempOfFreezer;
	
	public SmartRefrig() {}
	public SmartRefrig(double tempOfFridge, double tempOfFreezer) {
		this.tempOfFridge = tempOfFridge;
		this.tempOfFreezer = tempOfFreezer;
	}
	public double getTempOfFridge() {
		return tempOfFridge;
	}
	public void setTempOfFridge(double tempOfFridge) {
		this.tempOfFridge = tempOfFridge;
	}
	public double getTempOfFreezer() {
		return tempOfFreezer;
	}
	public void setTempOfFreezer(double tempOfFreezer) {
		this.tempOfFreezer = tempOfFreezer;
	}
	
	@Override
	public String toString() {
		return String.format("[SmartRefrig] tempOfFridge = %f(deg), tempOfFreezer = %f(deg)"
				, tempOfFridge, tempOfFreezer);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof SmartRefrig)) return false;
		return this.tempOfFridge == ((SmartRefrig)o).tempOfFridge
				&& this.tempOfFreezer == ((SmartRefrig)o).tempOfFreezer;
	}
	
}
