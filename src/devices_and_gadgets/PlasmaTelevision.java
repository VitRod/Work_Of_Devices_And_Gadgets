package devices_and_gadgets;

public class PlasmaTelevision extends TVset {
	
	
	int xDimension;
	
	int yDiomension;


public PlasmaTelevision(String name, int power, int diagonal, int xDimension, int yDiomension) {
	super(name, power, diagonal);
	this.xDimension = xDimension;
	this.yDiomension = yDiomension;
}


public PlasmaTelevision(String name, int diagonal, int xDimension, int yDiomension) {
	super(name, diagonal);
	this.xDimension = xDimension;
	this.yDiomension = yDiomension;
}


@Override
public String toString() {
	return "PlasmaTelevision [xDimension=" + xDimension + ", yDiomension=" + yDiomension + ", diagonal=" + diagonal
			+ ", name=" + name + ", power=" + power + ", poweredFromDevice=" 
			+ ((poweredFromDevice != null) ? poweredFromDevice.name : "") + "]";
}
 
 
	 
	
	
	
}
