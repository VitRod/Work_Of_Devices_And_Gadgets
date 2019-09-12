package devices_and_gadgets;

public class Tablet extends PC {
	double screenDiagonal;
	String navigationSystem;
	String hasWifi;
	String hasKeyboard;
	
	public Tablet(String name, int power, long ram, double screenDiagonal, String navigationSystem, String hasWifi,
			String hasKeyboard) {
		super(name, power, ram);
		this.screenDiagonal = screenDiagonal;
		this.navigationSystem = navigationSystem;
		this.hasWifi = hasWifi;
		this.hasKeyboard = hasKeyboard;
	}
	
	
	public Tablet(String name, long ram, double screenDiagonal, String navigationSystem, String hasWifi,
			String hasKeyboard) {
		super(name, ram);
		this.screenDiagonal = screenDiagonal;
		this.navigationSystem = navigationSystem;
		this.hasWifi = hasWifi;
		this.hasKeyboard = hasKeyboard;
	}


	@Override
	public String toString() {
		return "Tablet [screenDiagonal=" + screenDiagonal + ", navigationSystem=" + navigationSystem + ", hasWifi="
				+ hasWifi + ", hasKeyboard=" + hasKeyboard + ", ram=" + ram + ", name=" + name + ", power=" + power
				+ ", poweredFromDevice=" + ((poweredFromDevice !=null) ? poweredFromDevice.name: "") + "]";
	}
	
	
}
