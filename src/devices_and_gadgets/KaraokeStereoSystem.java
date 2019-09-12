package devices_and_gadgets;

import java.util.Arrays;

public class KaraokeStereoSystem extends  ElectronicDevice implements Device_Interface {

	String [] formats;
	String micrphoneInput;
	String frequencyRange;
	
	public KaraokeStereoSystem(String name, int power, String[] formats, String micrphoneInput, String frequencyRange) {
		super(name, power);
		this.formats = formats;
		this.micrphoneInput = micrphoneInput;
		this.frequencyRange = frequencyRange;
	}
	
	
	public KaraokeStereoSystem(String name, String[] formats, String micrphoneInput, String frequencyRange) {
		super(name);
		this.formats = formats;
		this.micrphoneInput = micrphoneInput;
		this.frequencyRange = frequencyRange;
	}


	@Override
	public String toString() {
		return "KaraokeStereoSystem [formats=" + Arrays.toString(formats) + ", micrphoneInput=" + micrphoneInput
				+ ", frequencyRange=" + frequencyRange + ", name=" + name + ", power=" + power + ", poweredFromDevice="
				+ ((poweredFromDevice  !=null) ? poweredFromDevice.name : "") + "]";
	}
	
	@Override
	public boolean compare(ElectronicDevice other) {
		return this.power >= other.power;
	}
	
	
}
