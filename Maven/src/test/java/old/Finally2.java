package old;
//Exception occurs but handled by catch block
public class Finally2 {

	public static void main(String[] args)
	{
		try
		{
			System.out.println("Try block");
			int d=5/0;
			System.out.println(d);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("Remaining code");
	}

}
