package old;

public class Method1 
{
	static int a=10;
	static int b=25;
	int c=40;
	static int diff;
	int sum;
	

	public int add()
	{
		int d=3;
		int sum=c+d;
		return sum;
	}
	public static void sub()
	{
		diff=b-a;
	}
	public static void main(String[] args) 
	{
		Method1 ob=new Method1();
		//int result=ob.add()
		ob.add();
		sub();
		System.out.println("sum is "+ob.add());
		System.out.println("sub is "+diff);
		
		
	}

}
