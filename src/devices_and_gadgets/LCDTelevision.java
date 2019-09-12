package devices_and_gadgets;

public class LCDTelevision extends TVset{

    int xDimension;
	
	int yDiomension;
	
	String wiFi;
	
	String audioSystem;

	public LCDTelevision(String name, int power, int diagonal, int xDimension, int yDiomension, String wiFi,
			String audioSystem) {
		super(name, power, diagonal);
		this.xDimension = xDimension;
		this.yDiomension = yDiomension;
		this.wiFi = wiFi;
		this.audioSystem = audioSystem;
	}
	
	public LCDTelevision(String name, int diagonal, int xDimension, int yDiomension, boolean hasWiFi,
			String audioSystem) {
		super(name, diagonal);
		this.xDimension = xDimension;
		this.yDiomension = yDiomension;
		this.wiFi = wiFi;
		this.audioSystem = audioSystem;
	}

	@Override
	public String toString() {
		return "LCDTelevision [xDimension=" + xDimension + ", yDiomension=" + yDiomension + ", WiFi=" + wiFi
				+ ", audioSystem=" + audioSystem + ", diagonal=" + diagonal + ", name=" + name + ", power=" + power
				+ ", poweredFromDevice=" + ((poweredFromDevice != null) ? poweredFromDevice.name : "") + "]";
	}
	
	
	
	
	
}
