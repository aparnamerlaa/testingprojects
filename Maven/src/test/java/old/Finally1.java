package old;
//Exception occurs but not handled by catch block
public class Finally1 {

	public static void main(String[] args) 
	{
		try
		{
		System.out.println("Try block");
		int d=50/10;
		System.out.println(d);
		}
		catch(NullPointerException e) 
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
