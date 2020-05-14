package uvsq21606235.command;

import java.util.Stack;

public class Undo implements Command{

	private CommandUndo lastC;
		
		public Undo(Stack<CommandUndo> historique) {
			this.lastC = historique.pop();
		}
	
		@Override
		public void apply() {
			lastC.undo();		
		}
}
