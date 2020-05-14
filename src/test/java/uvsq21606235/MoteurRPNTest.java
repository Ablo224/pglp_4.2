package uvsq21606235;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

import uvsq21606235.exception.OperandeManquantException;
import uvsq21606235.exception.OperandeTropGrandeException;
import uvsq21606235.exception.OperandeTropPetitException;

public class MoteurRPNTest {

	@Test
	  public void testMoteurRPN() {
	    MoteurRPN temp = new MoteurRPN();
	    assertNotNull(temp);
	  }

	

	  @Test()
	  public void resultatOperationAvecCalcul() throws OperandeManquantException, EmptyStackException,
      OperandeTropGrandeException, OperandeTropPetitException  {
	    MoteurRPN moteurRPN = new MoteurRPN();
	    Operation plus = Operation.PLUS;
	    double x, y, result;
	    x = 5;
	    y = 5;
	    result = x + y;
	    moteurRPN.enregistrerNb(2);
	    moteurRPN.enregistrerNb(3);
	    assertTrue(plus.eval(x, y) == result);

	  }

}
