package review;

public class VarialbleMAin
{
	int a,b;
	static int c;
	VarialbleMAin(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a+b;
		
		System.out.println("constructor");
		
	
	}
public static int  add(int a,int b)
{
	int sum=a+b;
	return sum;
}
	public static void main(String[] args) 
	{
		VarialbleMAin ob=new VarialbleMAin(20,600);
		int result=c;
		System.out.println(result);
		
		System.out.println(add(30,10));

	}

}
