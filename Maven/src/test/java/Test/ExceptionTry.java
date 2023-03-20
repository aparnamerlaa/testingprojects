package Test;

public class ExceptionTry 
{
public static void main()
{
	try
	{
		int d=50/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	System.out.println("Remaining code");
}
}
