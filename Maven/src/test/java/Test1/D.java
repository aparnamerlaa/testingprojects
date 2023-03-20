package Test1;

public class D extends C
{
	void show()
	{
	
	System.out.println("Showing");
	}
	

public static void main(String args[])
{
	D ob=new D();
	ob.add();
	ob.mul();
	ob.show();
	ob.cal();
System.out.println(ob.a);

System.out.println(ob.c);


}
}