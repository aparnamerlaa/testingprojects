package Test1;
import Test.A;

public class C extends A
{
protected void  cal()
{
	System.out.println("Calculation");
}
public static void main(String args[])
{
	C ob=new C();
	ob.add();
	ob.mul();
	ob.cal();
	System.out.println(ob.a);
    System.out.println(ob.c);
	
	
}

}