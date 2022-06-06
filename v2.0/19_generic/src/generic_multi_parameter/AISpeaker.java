package generic_multi_parameter;

public class AISpeaker {
	private int volume;
	private String locOfInstall;
	
	
	public AISpeaker() {}
	public AISpeaker(int volume, String locOfInstall) {
		this.volume = volume;
		this.locOfInstall = locOfInstall;
	}

	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getLocOfInstall() {
		return locOfInstall;
	}
	public void setLocOfInstall(String locOfInstall) {
		this.locOfInstall = locOfInstall;
	}
	
	
	@Override
	public String toString() {
		return String.format("volume = %d, locOfInstall = %s", 
				volume, locOfInstall);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof AISpeaker)) return false;
		
		return this.volume == ((AISpeaker)o).volume
				&& this.locOfInstall.equals(((AISpeaker)o).locOfInstall);
	}
	
	
	
}
