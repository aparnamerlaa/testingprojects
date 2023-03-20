package Test;

public class A
{
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=40;
	public void add()
	{
		
		System.out.println("adding");
	}
	private void sub()
	{
		System.out.println("Substracting");
	}
   protected void mul()
   {
   System.out.println("Multiplication");
   }
   void div()
   {
	 System.out.println("Division"); 
   }

public static void main(String args[])
{
	A ob=new A();
	ob.add();
	ob.sub();
	ob.mul();
	ob.div();
	System.out.println(ob.a); 
	System.out.println(ob.b); 
	System.out.println(ob.c); 
	System.out.println(ob.d); 
}
}
