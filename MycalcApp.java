package Ehandling;

import java.util.Scanner;

public class MycalcApp 
{

	public static void main(String[] args)
	{
		int result = 0;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		Calculator c = new Calculator();
		try
		{
			result= c.caldouble(k);
		}
		catch(MyArithException m)
		{
			System.out.println(m);
		}
		System.out.println(result);
		System.out.println("Done");
	}

}
