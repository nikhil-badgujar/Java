package Ehandling;

public class Calculator
{
	public int caldouble(int k) throws MyArithException
	{
		if(k<=0)
		{
			throw new MyArithException("zero and negative not allowed");
		}
		return k*2;
	}
	
}
