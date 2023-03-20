package old;
//try catch sample program
public class Try {

	public static void main(String[] args) {
		try
		{
			int d=50/0;
		}
		catch(ArithmeticException e)
		{
			
			//System.out.println(e);
			System.out.println("Remaining code");
		}
		
	}

}
