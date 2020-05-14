package uvsq21606235.command;

import uvsq21606235.Invokeur;

public class Quit implements Command {
	
	private Invokeur lightSwitch;
	
	public Quit(Invokeur lightSwitch) {
		this.lightSwitch = lightSwitch;
	}

	@Override
	public void apply() {
		lightSwitch.turnOff();
	}
	

}
