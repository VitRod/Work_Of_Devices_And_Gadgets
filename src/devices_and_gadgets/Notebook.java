package devices_and_gadgets;

public class Notebook extends PC {

	double weight;
	
	public Notebook(String name, int power, long ram, double  weight) {
		super(name, power, ram);
		 this.weight = weight;
	}

	public Notebook(String name,  long ram, double weight) {
		super(name,  ram);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Notebook [weight=" + weight + ", ram=" + ram + ", name=" + name + ", power=" + power
				+ ", poweredFromDevice=" + ((poweredFromDevice !=null) ? poweredFromDevice.name: "") + "]";
	}

	 
	
	


}
