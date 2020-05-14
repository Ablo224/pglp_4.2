package uvsq21606235.command;

import java.util.Stack;

import uvsq21606235.Operation;

public class CommandOperation implements CommandUndo{
	
	private double last;
	private double avantDernier;
	private Operation operation;
	private Stack<Double> pile;
	
	public CommandOperation(Stack<Double> pile, Operation operation) {
		this.pile = pile;
		this.operation = operation;
	}

	@Override
	public void apply() {
		double result;
		this.last = this.pile.pop();
		this.avantDernier = this.pile.pop();
		try {
			result = operation.eval(avantDernier, last);
			this.pile.push(result);
		}
		catch (ArithmeticException e) {
			this.pile.push(avantDernier);
			this.pile.push(last);
			throw e;
		}
	}
	
	@Override
	public void undo() {
		this.pile.pop();
		this.pile.push(avantDernier);
		this.pile.push(last);
	}


}
