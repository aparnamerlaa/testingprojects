package old;

public class Variables
{
	
	static int a=10;
	static int b=20;
    static int sub;
    int c=45;
    
   public void add()
	{
	   int d=40;
		int Sum=c+d;
		System.out.println(Sum);
		
	}
   public static void sub()
{
  sub=a-b;
  System.out.println(sub);
	
}
  public static void main(String[] args) 
{
		
Variables ob=new Variables();
ob.add();
sub();





	}

}
