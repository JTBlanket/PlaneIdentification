package PlaneIdentification;

public class IdentificationRunner {
	public static void main(String[] args){
		IdentificationRunner myPlanes = new IdentificationRunner();
		myPlanes.createAirplaneData();
		
	
		EngineInformation EI = new EngineInformation();
		EI.start();
		boolean Jet=EI.JetOrPropeller();
		
		

		//boolean ***=EI.***();
		
		
		//boolean ***=EI.***();
		//System.out.println("\n"+***);

		//boolean ***=EI.***();
		//System.out.println("\n"+***);
		
		//boolean ***=EI.***();
		//System.out.println("\n"+***);
		
		System.out.println("Jet: \n"+Jet);
		//System.out.println(***: "\n"+***);
		//TailInformation TI = new TailInformation();
		//WingInformation WI = new WingInformation();
	}

	private void createAirplaneData() {
		// TODO Auto-generated method stub
	
		
		
		AirplaneDB F15= new AirplaneDB();
		F15.setEngineType("jet");
		F15.setNumberEngines(2);
		F15.setEngineLocation("body");
		AirplaneDB F16= new AirplaneDB();
		AirplaneDB F18= new AirplaneDB();
		AirplaneDB F22= new AirplaneDB();
		AirplaneDB F35= new AirplaneDB();
		AirplaneDB A10= new AirplaneDB();
		F15.setNumberEngines(2);
		F16.setNumberEngines(1);
		F18.setNumberEngines(2);
		F22.setNumberEngines(2);
		F35.setNumberEngines(1);
		A10.setNumberEngines(2);
		System.out.println("F 15 has " + F15.getNumberEngines());
		System.out.println("F 16 has " + F16.getNumberEngines());
	}
}
