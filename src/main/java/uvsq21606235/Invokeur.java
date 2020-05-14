package uvsq21606235;

public class Invokeur {
	
	private boolean invok;
	
	public Invokeur() {
		this.invok = true;
	}
	
	public boolean isOn() {
		return invok;
	}
	
	public void turnOff() {
		invok = false;
	}	
	
	public void turnOn() {
		invok = true;
	}	

}
