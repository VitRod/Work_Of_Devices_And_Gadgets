package devices_and_gadgets;

public class Mainframe extends PC {
	
	private int numberOfProcessors;
	
	private static int totalNumberOfProcessors = 0;
	
	public Mainframe(String name,int power, long ram,  int numberOfProcessors) {
		super(name, power, ram); 
		 this.numberOfProcessors = numberOfProcessors;;
		 totalNumberOfProcessors += numberOfProcessors;
	}
	
	public  Mainframe(String name, long ram, int numberOfProcessors) {
		super(name, ram);
		this.numberOfProcessors = numberOfProcessors;;
		 totalNumberOfProcessors += numberOfProcessors;
	}
	
	@Override
	public String toString() {
		return "Mainfraime [numberOfProcessors=" + numberOfProcessors + ", ram=" + ram + ", name=" + name + ", power="
				+ power + ", poweredFromDevice=" + ((poweredFromDevice != null) ? poweredFromDevice.name : "") + "]";
	}

	public int getNumberOfProcessors() {
		return numberOfProcessors;
	}

	public void setNumberOfProcessors(int numberOfProcessors) {
		totalNumberOfProcessors += numberOfProcessors - this.numberOfProcessors;
		this.numberOfProcessors = numberOfProcessors;
	}

	public static int getTotalNumberOfProcessors() {
		return totalNumberOfProcessors;
	}

	
}
