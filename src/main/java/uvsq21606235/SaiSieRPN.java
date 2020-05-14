package uvsq21606235;

import java.util.Scanner;

import uvsq21606235.exception.*;
import uvsq21606235.command.*;

public class SaiSieRPN {
	

		private MoteurRPN _mrpn;
		private Scanner _sc;


		public SaiSieRPN(){
			_mrpn = new MoteurRPN();
		}

		
		public void closeScanner() {
			_sc.close();
		}
		
		public void ihm()throws OperandeTropPetitException, OperandeTropGrandeException, OperandeManquantException, DivivionParZeroException 
		{
			String str = "";
			String input ="";
			_sc= new Scanner(System.in);
			while(_mrpn.isOn()) {
				System.out.println("Saisir un entier, une opération ou exit pour sortir, puis taper sur entrée");
				if (_sc.hasNextDouble()) {
					_mrpn.enregistrerNb(_sc.nextDouble()); 
					System.out.print("Elements actuels de la pile: ");
					System.out.println(_mrpn.afficher());
					str = _sc.nextLine(); 
				}
				else { 
					str = _sc.nextLine();
					if (str.equals("exit")) {
						_mrpn.shutdown();
					}
					else if (str.equals("undo")) {
						_mrpn.undo();
						System.out.println(_mrpn.afficher());
					}
					else if (estOperation(str)) {
						_mrpn.appliquerOperation(returnOperation(str));	
						System.out.println(_mrpn.afficher());
					}		
					else {
						System.out.println("SAISIE INCORRECTE !!!");
					}
				}
			}
			
		}
		
		private boolean estOperation(String str) {
			if (str.length() != 1) {
				return false;
			}
			return this.returnOperation(str) != null;
		}
		
		
		private Operation returnOperation(String str) 
		{
			for (Operation op : Operation.values())
				if (str.charAt(0) == op.getOperation())
					return op;
			return null;

		}
		
		public void contenuPile(){
			System.out.println(_mrpn.afficher()+"\n");
		}

		


}
