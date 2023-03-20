package old;

public class VariableParameterised
{
	static int sub;
int add(int a,int b)
{
	int sum=a+b;
	return sum;
	
}
static int sub(int c,int d)
{
	sub=c-d;
	return sub;
	
}
public static void main(String args[])
{
	VariableParameterised ob=new VariableParameterised();
	//int result=ob.add(50,30);
	//sub(50,20);
	System.out.println(ob.add(50,30));
	// int q=sub;
	System.out.println(sub(50,100));

	}
}
