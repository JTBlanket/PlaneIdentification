package PlaneIdentification;

public class AirplaneDB {
	//field - private no direct access!
	private int numberEngines =0;
	private int numberVerticalTailWings = 0; 
	
	public AirplaneDB(){
		
	}

	public int getNumberEngines() {
		return numberEngines;
	}

	public void setNumberEngines(int numberEngines) {
		this.numberEngines = numberEngines;
	}

	public int getNumberVerticalTailWings() {
		return numberVerticalTailWings;
	}

	public void setNumberVerticalTailWings(int numberVerticalTailWings) {
		this.numberVerticalTailWings = numberVerticalTailWings;
	}

	public void setEngineType(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setEngineLocation(String string) {
		// TODO Auto-generated method stub
		
	}
}
