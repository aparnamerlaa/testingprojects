package old;

public class Variable2
{
	static int a=10;//static variable
	int b=30;//instance variable
	
	static void display()//static method
	{
		System.out.println("the static variable is:"+a);//calling static variable
	}

	void get()//instance method
	{
		int c=40;
		System.out.println("the instance variable is:"+b);//calling instance variable
		System.out.println("the local variable is"+c);
	}
	public static void main(String[] args)
	{
		Variable2 ob=new Variable2();
		ob.get();//calling instance method
		display();//calling static method
				
	}

}
