package generic_extends;

public class SmartTV extends Electronics {
	private int numOfChannel;

	public SmartTV() {}
	public SmartTV(int numOfChannel) {
		this.numOfChannel = numOfChannel;
	}
	public int getNumOfChannel() {
		return numOfChannel;
	}
	public void setNumOfChannel(int numOfChannel) {
		this.numOfChannel = numOfChannel;
	}
	
	@Override
	public String toString() {
		return String.format("[SmartTV] Number of Channel : %d", numOfChannel);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof SmartTV)) return false;
		return this.numOfChannel == ((SmartTV)o).numOfChannel;
	}

	
}
