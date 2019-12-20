package devices_and_gadgets;

public class GasolineGenerator extends ElectronicDevice implements Device_Interface  {

	protected static int remainingAllGeneratorsPower = 0;
	
	public String toString() {
		return "GasolineGenerator [name=" + name + ", power=" + power + "]";
	}
	
	
	
	public GasolineGenerator (String name, int power) {
		super(name, power);
		this.power = power;
		remainingAllGeneratorsPower +=power;
	}
	
	public  void setPower(int power) {
		remainingAllGeneratorsPower += power - this.power;
		this.power =  power;
	}
	


	public static int getRemainingAllGeneratorsPower() {
		return remainingAllGeneratorsPower;
	}



	@Override
	public boolean compare(ElectronicDevice other) {
		return (this.power >= other.power);
	}

}
