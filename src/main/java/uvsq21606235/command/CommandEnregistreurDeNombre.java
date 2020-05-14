package uvsq21606235.command;

import java.util.Stack;

public class CommandEnregistreurDeNombre implements CommandUndo {
	

	private double nbr;
	private Stack<Double> pile;
	
	public CommandEnregistreurDeNombre(Stack<Double> pile, double nbr) {
		this.pile = pile;
		this.nbr = nbr;		
	}
	
	@Override
	public void apply() {
		this.pile.push(nbr);
	}
	
	@Override
	public void undo() {
		this.pile.pop();
	}


}
