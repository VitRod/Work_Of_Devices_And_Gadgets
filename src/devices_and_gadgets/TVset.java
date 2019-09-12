package devices_and_gadgets;

public class TVset extends ElectronicDevice implements Device_Interface {

		int diagonal;

		public TVset(String name, int power, int diagonal) {
			super(name, power);
			this.diagonal = diagonal;
			 
		}

		public TVset(String name, int diagonal) {
			super(name);
			this.diagonal = diagonal;
		}

		@Override
		public String toString() {
			return "TVset [diagonal=" + diagonal + ", name=" + name + ", power=" + power + ", poweredFromDevice="
					+ ((poweredFromDevice != null) ? poweredFromDevice.name : "") + "]";
		}

		@Override
		public boolean compare(ElectronicDevice other) {
			 if(other instanceof TVset) {
				 TVset tv = (TVset) other;
				 return (this.diagonal >= tv.diagonal);
			 } else
			return  (this.power >= other.power);
		}
		
		
		
		
}
