package devices_and_gadgets;

public class DancingStageArcadeMachine extends ElectronicDevice implements Device_Interface {
	
	int numberOfPlayers;
	int songsNumber;
	String genre;
	boolean isCoinOperated;
	int weightOfDancePlatform;
	String producerCountry;
	String cabinetDescription;
	
	public DancingStageArcadeMachine(String name, int power, int numberOfPlayers, int songsNumber, String genre,
			boolean isCoinOperated, int weightOfDancePlatform, String producerCountry, String cabinetDescription) {
		super(name, power);
		this.numberOfPlayers = numberOfPlayers;
		this.songsNumber = songsNumber;
		this.genre = genre;
		this.isCoinOperated = isCoinOperated;
		this.weightOfDancePlatform = weightOfDancePlatform;
		this.producerCountry = producerCountry;
		this.cabinetDescription = cabinetDescription;
	}

	public DancingStageArcadeMachine(String name,  int numberOfPlayers, int songsNumber, String genre,
			boolean isCoinOperated, int weightOfDancePlatform, String producerCountry, String cabinetDescription) {
		super(name);
		this.numberOfPlayers = numberOfPlayers;
		this.songsNumber = songsNumber;
		this.genre = genre;
		this.isCoinOperated = isCoinOperated;
		this.weightOfDancePlatform = weightOfDancePlatform;
		this.producerCountry = producerCountry;
		this.cabinetDescription = cabinetDescription;
	}

	@Override
	public String toString() {
		return "DancingStageArcadeMachine [numberOfPlayers=" + numberOfPlayers + ", songsNumber=" + songsNumber
				+ ", genre=" + genre + ", isCoinOperated=" + isCoinOperated + ", weightOfDancePlatform_KG="
				+ weightOfDancePlatform + ", producerCountry=" + producerCountry + ", cabinetDescription="
				+ cabinetDescription + ", name=" + name + ", power=" + power + ", poweredFromDevice="
				+ ((poweredFromDevice !=null) ? poweredFromDevice.name: "") + "]";
	}
	
	public void dancingToTheRythm(boolean coinIsDroped) {
		if(coinIsDroped == true) {
			System.out.println("Music is turning on and you can start dancing on the dance stage!!!");
		}else {
			System.out.println("Drop a coin!!!");
		}
	}
	
	
}
