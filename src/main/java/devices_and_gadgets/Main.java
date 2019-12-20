package devices_and_gadgets;

public class Main {

	public static void main(String[] args) {
		
		// A few devices that were created
		
		Notebook notebook1 = new Notebook(" ASUS 270", 120, 32, 2.3);
		Mainframe mainframe1 = new Mainframe("LG highlander", 9000, 128, 64);
		
		String[] formatsArray = {"mp3", "WAV", "FLAC", "AAC"};
		MusicalPlayer player1 = new MusicalPlayer("SUMSUNG",6,  formatsArray);
		PlasmaTelevision plasma1 = new PlasmaTelevision("PANASONIC", 55, 100, 1080, 1024);
		TubeTelevision tube1 = new TubeTelevision("SLAVUTICH",70, 45, 55);
		ElectronicDevice device1 = new ElectronicDevice ("certain electronic device", 12345) ;
		
		System.out.println("----------------------------------");
		
		LCDTelevision lcd1 = new LCDTelevision("SUMSUNG AUXUA", 43, 180, 1920, 1080, "Has WiFi", "Dolby Digital Plus");
		
		String [] dvdFormatsArray = {"DVD","CD","MP3", "JPEG CD", "MPEG4", "DIVX"};
		String [] colorSystems = {"PAL","NTSC","SECAM"};
		DVD_Player dvd1 = new DVD_Player("T2 OPERA", 80, dvdFormatsArray, colorSystems, "HasATuner", "16:9");
		
		String[] musFormats = {"MP3","WMA","WAV","MPEG1","MPEG2","JPG","3GP","MP4","AVI","MKV","FLV","OGG"};		
		KaraokeStereoSystem karaokeSS = new KaraokeStereoSystem("LTC Karaoke-Star3-BT", 150, musFormats, "HasAMicrophoneInput", "20Hz-20kHz");
		Tablet tablet1 = new Tablet("Lenovo IdeaPad Miix 320", 33, 4, 10.1, "GPS+GLONASS", "HasAWifi", "Available");
		DancingStageArcadeMachine danceStage1 = new DancingStageArcadeMachine("Konami Dance Stage Euromix", 180, 2, 800, "Pop-Dance", true, 333, "Japan", "Large cabinet with light show & sound system"); 
		
		
		// devices that are  printed
		System.out.println(notebook1);
		System.out.println(mainframe1);
		System.out.println(player1);
		System.out.println(plasma1);
		System.out.println(tube1);
		
		System.out.println(lcd1);
		System.out.println(dvd1);
		System.out.println(karaokeSS);
		System.out.println(tablet1);
		
		
		System.out.println("======================================");
		
		System.out.println(danceStage1);
		danceStage1.dancingToTheRythm(true);
		
		System.out.println("======================================");
		
		// devices that do not have power
		Notebook notebook2 = new Notebook("SONY 450", 16, 2.2);
		System.out.println(notebook2);
		notebook2.setPower(90);
		System.out.println(notebook2);
		
		System.out.println("======================================");
		
		
		// using chain methods
		device1.setPowerAndReturnMe(160).name = "Some other Device";
		System.out.println(device1);
		
		notebook1.setPowerAndReturnMe(255).setRamAndReturnMe(3).name = "Toshiba 450";
		System.out.println(notebook1);
		
		
		System.out.println("======================================");
		
		//creating array of available devices
		ElectronicDevice [] allDevices = new ElectronicDevice [11];
		allDevices[0] = notebook1;
		allDevices[1] = mainframe1;
		allDevices[2] = player1;
		allDevices[3] = plasma1;
		allDevices[4] = tube1;
		allDevices[5] = notebook2;
		allDevices[6] = lcd1;
		allDevices[7] = dvd1;
		allDevices[8] = karaokeSS;
		allDevices[9] = tablet1;
		allDevices[10] = danceStage1;
		
		
		
		// here total amount of power  is  calculated
		System.out.println("Total amount of power: " + calcTotalAmountOfPower(allDevices) + " Vatt");
		
		// here is  total amount of ram is calculated
		System.out.println("Total amount of RAM: " + calcTotalAmountOfRam(allDevices) + "  Ram");
		
		
		System.out.println("============================");
		// devices comparison
		System.out.println("notebook1 >= notebook2 : " + notebook1.compare(notebook2));
		System.out.println("notebook1 >= mainframe1 : " + notebook1.compare(mainframe1));
		System.out.println("notebook1 >= plasma1 : " + notebook1.compare(plasma1));
		System.out.println("device1 >= plasma1 : " + device1.compare(plasma1));
		System.out.println("tablet >= lcd1 : " + tablet1.compare(lcd1));
		System.out.println("dvd1 >= karaokeSS : " + dvd1.compare(karaokeSS));
		System.out.println("mainframe1 >= danceStage1 : " + mainframe1.compare(danceStage1));

		System.out.println("============================");
		
		
		
		GasolineGenerator generator = new GasolineGenerator("Konner&Sohnen KS 10000E", 2000);

		for (int i = 0; i < allDevices.length; i++) {
			System.out.print("Connecting " + allDevices[i] + " : ");
			if (i == 0) {
				System.out.print((allDevices[i].connectToPower(generator)) ? "done!" : "failed. Not enough power!");
			} else {
				System.out.print(
						(allDevices[i].connectToPower(allDevices[i - 1])) ? "done!" : "failed. Not enough power!");
			}
			System.out.println();
		}
		allDevices[5].getLine();
		allDevices[3].poweredFromDevice = null;
		allDevices[2].getLine();
		
		
		System.out.println("=============================================================");
		
		
		
		
	 
		System.out.println(" Total processors before " + Mainframe.getTotalNumberOfProcessors());
		
		
		Notebook notebook3 = new Notebook("Toshiba 570", 120, 1712234117, 2.1);
		Mainframe mainframe3 = new Mainframe("LG highlander", 9000, 201823321L, 64);
		
		notebook3.getId();
		mainframe3.setId();
		
		System.out.println(notebook3);
		System.out.println(mainframe3);
		
		Mainframe mainframe4 = new Mainframe("HP ProLiant ", 500, 171620481, 32);
		Mainframe mainframe5 = new Mainframe("Iridium Server ", 300, 201027691L, 128);
		
		mainframe4.setId();
		mainframe5.setId();
		
		System.out.println(mainframe4);
		System.out.println(mainframe5);
		
		
		System.out.println(" Total processors after " + Mainframe.getTotalNumberOfProcessors());
	}
	
	
	
	public static int calcTotalAmountOfPower(ElectronicDevice[] arrayOfDevices) {
		int sumOfPower = 0;
		for(int i =0; i < arrayOfDevices.length; i++ )
			if(!arrayOfDevices[i].equals(null))
				sumOfPower += arrayOfDevices[i].power; 
		return sumOfPower;
	}
	
	
	public static  int calcTotalAmountOfRam(ElectronicDevice[] arrayOfDevices) {
		int totalRam = 0;
		for(int i =0; i < arrayOfDevices.length; i++ )
			if(!arrayOfDevices[i].equals(null) & arrayOfDevices[i] instanceof PC) {
				PC pc = (PC) arrayOfDevices[i];
				totalRam +=pc.getRam();
			}
		return totalRam;
	}
}
