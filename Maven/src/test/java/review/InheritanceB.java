package review;

public class InheritanceB extends InheritanceA
{
public void get()
{
	
	System.out.println("child get");
}
void set() 
{
	super.get();
     get();
}
}
