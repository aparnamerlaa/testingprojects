package old;

public class Account
{
private long accountno;
private String name;
private String email;
private int amount;
public long getaccountno()
{
	return accountno;
}
public String getName()
{
	return name;
}
public String getemail()
{
	return email;
}
public int getamount()
{
	return amount;
}
public long setAccountno(long accountno)
{
	this.accountno=accountno;
	return accountno;
}
public String setName(String name)
{
	this.name=name;
	return name;
}
public String setemail(String email)
{
	this.email=email;
	return email;
}
public int setamount(int amount)
{
	this.amount=amount;
	return amount;
}
}

