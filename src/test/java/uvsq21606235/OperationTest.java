package uvsq21606235;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import uvsq21606235.exception.DivivionParZeroException;



public class OperationTest {

  double x, y;

  @Before
  public void setUp() {

    x = 5;
    y = 2;
  }

  @Test
  public void testPlus() {
    Operation op = Operation.PLUS;
    assertNotNull(op);
  }

  @Test
  public void testSymbAddition() {
    Operation op = Operation.PLUS;
    assertTrue(op.getOperation() == '+');
  }

  @Test
  public void testMoins() {
    Operation op = Operation.MOINS;
    assertNotNull(op);
  }

  @Test
  public void testSymbSoustraction() {
    Operation op = Operation.MOINS;
    assertTrue(op.getOperation() == '-');
  }

  @Test
  public void testMult() {
    Operation op = Operation.MULT;
    assertNotNull(op);
  }

  @Test
  public void testSymbMult() {
    Operation op = Operation.MULT;
    assertTrue(op.getOperation() == '*');
  }

  @Test
  public void testDiv() {
    Operation op = Operation.DIV;
    assertNotNull(op);
  }

  @Test
  public void testSymbDivision() {
    Operation op = Operation.DIV;
    assertTrue(op.getOperation() == '/');
  }

  @Test
  public void testModulo() {
    Operation op = Operation.MOD;
    assertNotNull(op);
  }

  @Test
  public void testSymbModulo() {
    Operation op = Operation.MOD;
    assertTrue(op.getOperation() == '%');
  }

  @Test
  public void testEvalPlus() {
    Operation op = Operation.PLUS;
    assertEquals(x + y, op.eval(x, y), 0);
  }

  @Test
  public void testEvalMoins() {
    Operation op = Operation.MOINS;
    assertEquals(x - y, op.eval(x, y), 0);

  }

  @Test
  public void testEvalDiv() {
    Operation op = Operation.DIV;
    assertEquals(x / y, op.eval(x, y), 0);
  }

  @Test
  public void testEvalMult() {
    Operation op = Operation.MULT;
    assertEquals(x * y, op.eval(x, y), 0);
  }

  @Test
  public void testEvalMod() {
    Operation op = Operation.MOD;
    assertEquals(x % y, op.eval(x, y), 0);
  }

  @Test(expected = ArithmeticException.class)
  public void testDivisionParZero() throws ArithmeticException {
    Operation op = Operation.DIV;
    assertNotEquals(1, op.eval(7, 0));
  }



}