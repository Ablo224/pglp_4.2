package uvsq21606235;

import uvsq21606235.exception.DivivionParZeroException;
import uvsq21606235.exception.OperandeManquantException;
import uvsq21606235.exception.OperandeTropGrandeException;
import uvsq21606235.exception.OperandeTropPetitException;

public enum CalculatriceRPN {
	
	ENVIRONNEMENT;
	
	public void run( String[] args)throws OperandeTropPetitException, OperandeTropGrandeException, OperandeManquantException, DivivionParZeroException {
		SaiSieRPN saisie = new SaiSieRPN();
		saisie.ihm();
	}
	
	public static void main( String[] args ) throws OperandeTropPetitException, OperandeTropGrandeException, OperandeManquantException, DivivionParZeroException{
		ENVIRONNEMENT.run(args);
		
	}

}
