package old;

public class ParameterizedConstructor 
{
	ParameterizedConstructor()
	{
		System.out.println("Default constructor");
	}
	ParameterizedConstructor(int a){
		this();
		System.out.println("parameterized constructor");
	}
	

	public static void main(String[] args)
	{
		ParameterizedConstructor ob=new ParameterizedConstructor(90);
	
	}

}
