package devices_and_gadgets;

public class PC extends ElectronicDevice implements Device_Interface {

	public static  final long MINIMUM_RAM = 100000000L;
	
	public  static final  long  MAXIMUM_RAM = 2560000000000L;
	
	protected long ram;
	
	
	public PC(String name, int power, long ram) {
		super(name, power);
//		setRam(ram);
		this.ram = ram;
	}
	
	

	public  PC(String name, long ram) {
		super(name);
//		setRam(ram);
		this.ram = ram;
	}
	

	@Override
	public String toString() {
		return "PC [ram=" + ram + ", name=" + name + ", power=" + power + ", poweredFromDevice=" 
				+ ((poweredFromDevice !=null) ? poweredFromDevice.name : "") +"]";
	}


	@Override
	public boolean compare(ElectronicDevice other) {
		 if(other instanceof PC) {
			 PC pc = (PC) other;
			 return (this.ram >= pc.ram);
		 } else 
		return (this.power >= other.power);
	}

	@Override
	public PC setPowerAndReturnMe(int power) {
		this.power = power;
		return this;
	}


	
	public PC setRamAndReturnMe(int ram) {
//		 setRam(ram);
		return this;
	}
	
	public long getRam() {
		return ram;
	}
	
//	public void setRam(long ram) {
//		if(ram < MINIMUM_RAM || ram > MAXIMUM_RAM) 
//			System.out.println(ram + " is wrong amount of ram!");
//		else 
//				this.ram = ram;
//	}
//	
//	
//	public long getRamMegabytes() {
//		return bytes2Megabytes(ram);
//	}
//	
//	public long getRamGigabytes() {
//		return bytes2Gigabytes(ram);
//	}
//	
//	public static long bytes2Megabytes(long bytes) {
//		return bytes / 1024 /1024;
//	}
//	
//	public static long bytes2Gigabytes(long bytes) {
//		return bytes / 1024 / 1024 / 1024;
//	}
//
//

}
