package uvsq21606235;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import uvsq21606235.command.Command;
import uvsq21606235.command.CommandUndo;
import uvsq21606235.command.Quit;
import uvsq21606235.command.Undo;

public class Interpreteur {
	
	private Stack<CommandUndo> historique;
	private Invokeur interrupteur;
	private List<String> log;
	
	public Interpreteur() {
		this.historique = new Stack<CommandUndo>();
		this.interrupteur = new Invokeur();
		this.log = new ArrayList<String>();
	}
	

	private void applyCommand(Command command) {
		command.apply();
	}	
	
	
	public void applyCommandEnregistrement(CommandUndo command) {
		try {
			command.apply();
			this.historique.add(command);	
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void undo() {
		this.applyCommand(new Undo(historique));
	}
	
	public void log(String str) {
		this.applyCommand(() -> log.add(str));
	}
	
	public String getLastLog() {
		return log.get(log.size() - 1);
	}
	
	public void shutdown() {
		this.applyCommand(new Quit(interrupteur));
	}
	
	public boolean isOn() {
		return interrupteur.isOn();
	}

}
