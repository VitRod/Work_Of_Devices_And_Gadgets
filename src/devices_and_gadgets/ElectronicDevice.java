package devices_and_gadgets;

import java.util.Random;

public class ElectronicDevice implements Device_Interface {
	
		public String  name;
		
		
		public int power;
		
		
		public ElectronicDevice poweredFromDevice;
		
		protected int id;
		
		private static int nextId;
		
		static {
			Random rnd = new Random();
			nextId = rnd.nextInt(1000);
		}
		
		
		protected ElectronicDevice(String  name, int power) {
			this.name = name;
			this.power = power;
		}
		
		protected ElectronicDevice(String name) {
			this.name = name;
		} 
		
		public int getPower() {
			return power;
		}

		public void setPower(int power) {
			this.power = power;
		}
		
		public int getId(){
			return id;
		}
		
		public  void setId() {
			id = nextId;
			nextId++;
		}
		
		@Override
		public boolean compare(ElectronicDevice other) {
			return (this.power >= other.power);
		}
		
		
		public ElectronicDevice setPowerAndReturnMe(int power) {
			this.power = power;
			return this;
		}
		
		
		public boolean connectToPower(ElectronicDevice attachTo) {
			if(GasolineGenerator.remainingAllGeneratorsPower >= this.power) {
				this.poweredFromDevice = attachTo;
				GasolineGenerator.remainingAllGeneratorsPower -= this.power;
				return true;
			} else {
				return false;
			}
		}
		
		public ElectronicDevice getLine() {
				if(poweredFromDevice == null) {
					System.out.println(name + "[✖_✖]﻿");
					return null;
				} else {
					System.out.println(name + "\\(^O^)//");
					return poweredFromDevice.getLine();
				}
				
		}	
	
}
