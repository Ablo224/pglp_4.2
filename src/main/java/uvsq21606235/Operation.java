package uvsq21606235;

import uvsq21606235.exception.*;

public enum Operation {
	
	PLUS('+')
	{
		@Override
		public double eval(double op1,double op2){
			return op1 + op2;
		}
	},
	
	MOINS('-')
	{
		@Override
		public double eval(double op1,double op2) {
			return op1 - op2;
		}
		
	},
	
	MULT('*')
	{
		@Override
		public double eval(double op1,double op2) {
			return op1 * op2;
		}
		
	},
	
	MOD('%')
	{
		@Override
		public double eval(double op1,double op2) {
			return op1 % op2;
		}
		
	},
	
	DIV('/')
	{
		@Override
		public double eval(double op1,double op2)throws ArithmeticException {
			if(op2 == 0) {
				throw new ArithmeticException();
			}else {
				return op1 / op2;
			}
		}
		
	};
	
	private char _symbole;
	
	
	
	Operation(char symbole)
	{
		_symbole = symbole;
	}
	
	public abstract double eval(double op1,double op2);
	
	public char getOperation()
	{
		return _symbole;
	}

}
