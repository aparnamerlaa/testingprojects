package Test;

public class Astatic 
{
	public static int a=10;
	private static  int b=20;
	protected static int c=30;
	static int d=40;
	public static void add()
	{
		
		System.out.println("adding");
	}
	private static void sub()
	{
		System.out.println("Substracting");
	}
   protected static void mul()
   {
   System.out.println("Multiplication");
   }
   static void div()
   {
	 System.out.println("Division"); 
   }

	public static void main(String[] args) {
		Astatic ob=new Astatic ();
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
		System.out.println(a); 
		System.out.println(b); 
		System.out.println(c); 
		System.out.println(d); 
		// TODO Auto-generated method stub

	}

}
