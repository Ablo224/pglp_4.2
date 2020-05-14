package uvsq21606235;

import uvsq21606235.command.*;
import java.util.Stack;

public class MoteurRPN extends Interpreteur{


		private Stack<Double> _pile;

		

		public MoteurRPN() {
			this._pile = new Stack<Double>();
		}


	
		public void enregistrerNb(double nb) {
			this.applyCommandEnregistrement(new CommandEnregistreurDeNombre(_pile, nb));
		}

		
		public void appliquerOperation(Operation op) {
			this.applyCommandEnregistrement(new CommandOperation(_pile, op));
		}

		public boolean operationPossible(){
			if(_pile.size()>=2) return true;
			else return false;
		}
		
		
		public String afficher()
		{
			String contenu = "";
			
			for(double d : _pile)
			{
				contenu += d + " ";
			}
			
			return contenu;
		}

		
		public int getSize__pile(){
			return this._pile.size();
		}

}
