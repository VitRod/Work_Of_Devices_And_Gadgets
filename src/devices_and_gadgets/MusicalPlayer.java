package devices_and_gadgets;

import java.util.Arrays;

public class MusicalPlayer extends  ElectronicDevice implements Device_Interface {
	
	String [] formats;

	public MusicalPlayer(String name, String [] formats) {
		super(name);
		this.formats = formats;
	}

	public MusicalPlayer(String name, int power, String[] formats) {
		super(name, power);
		this.formats = formats;
	}


	@Override
	public String toString() {
		return "MusicalPlayer [formats=" + Arrays.toString(formats) + ", name=" + name + ", power=" + power
				+ ", poweredFromDevice=" + ((poweredFromDevice  !=null) ? poweredFromDevice.name : "") + "]";
	}

	@Override
	public boolean compare(ElectronicDevice other) {
		return this.power >= other.power;
	}

}
