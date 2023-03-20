package old;

public class Bankpin 
{
private int pin;
public void set(int pin)
{
	this.pin=pin;
}
public void validPin()
{
	if(pin==1234||pin==4567||pin==4321)
	{
		System.out.println("Valid");
	}
else
{
	System.out.println("Invalid Pin");
}
}
}