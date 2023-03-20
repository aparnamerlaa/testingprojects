package old;

public class Throw
{
	public static void validate(int age)
	{
	if(age<18)
	{
		throw new ArithmeticException("person not eligible to vote");
	}
	else
	{
		System.out.println("Eligible for vote");
	}
	}
	

	public static void main(String[] args) 
	{
		validate(50);
		System.out.println("Remaining code");
	}

}
