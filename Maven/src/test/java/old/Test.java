package old;

public class Test
{
int a=10;
static int b=20;
Test()
{
	this(10,20);
	System.out.println("Constructor");	
}
Test(int a, int b)
{
	this.a=a;
	this.b=b;
	int f=a+b;
	System.out.println(f);
	
}
void print()
{
	int c=80;
	System.out.println(c);
}
static void show() 
{
	System.out.println("static method");
	
}
static int display(int a,int b)
{
	int e=a+b;
	return e;
}
public static void main(String args[])
{
	
	Test ob=new Test();
	//Test ob1=new Test(10,20);
	System.out.println(ob.a);
	System.out.println(b);
	ob.print();
	show();
	int result=display(20,20);
	System.out.println(result);
	
	//System.out.println(display(20,20));
}
}
