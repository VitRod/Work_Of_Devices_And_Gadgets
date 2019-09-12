package devices_and_gadgets;

import java.util.Arrays;

public class DVD_Player extends ElectronicDevice implements Device_Interface {
	
	String [] formats;
	
	String [] colorSystems;
	
	String tuner;
	
	String imageFormat;

	public DVD_Player(String name, int power, String[] formats, String[] colorSystems, String tuner,
			String imageFormat) {
		super(name, power);
		this.formats = formats;
		this.colorSystems = colorSystems;
		this.tuner = tuner;
		this.imageFormat = imageFormat;
	}
	
	
	public DVD_Player(String name, String[] formats, String[] colorSystems, String tuner,
			String imageFormat) {
		super(name);
		this.formats = formats;
		this.colorSystems = colorSystems;
		this.tuner = tuner;
		this.imageFormat = imageFormat;
	}


	@Override
	public String toString() {
		return "DVD_Player [formats=" + Arrays.toString(formats) + ", colorSystems=" + Arrays.toString(colorSystems)
				+ ", tuner=" + tuner + ", imageFormat=" + imageFormat + ", name=" + name + ", power=" + power
				+ ", poweredFromDevice=" + ((poweredFromDevice  !=null) ? poweredFromDevice.name : "") + "]";
	}
	
	
	
	@Override
	public boolean compare(ElectronicDevice other) {
		return this.power >= other.power;
	}
	
	
	
	
	
	
}
