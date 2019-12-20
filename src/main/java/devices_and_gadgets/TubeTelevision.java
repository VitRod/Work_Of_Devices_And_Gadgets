package devices_and_gadgets;

public class TubeTelevision extends TVset {

	int frequency;

	public TubeTelevision(String name, int power, int diagonal, int frequency) {
		super(name, power, diagonal);
		this.frequency = frequency;
	}
	
	
	public TubeTelevision(String name, int diagonal, int frequency) {
		super(name, diagonal);
		this.frequency = frequency;
	}


	@Override
	public String toString() {
		return "TubeTelevision [frequency=" + frequency + ", diagonal=" + diagonal + ", name=" + name + ", power="
				+ power + ", poweredFromDevice=" + ((poweredFromDevice != null) ? poweredFromDevice.name : "") + "]";
	}
	
	
	
	
}
