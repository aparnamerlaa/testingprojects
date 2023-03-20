package old;
//Exception not occurs

public class Finally {

	public static void main(String[] args) 
	{
		try {
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
