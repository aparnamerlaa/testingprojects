package old;

import java.util.Scanner;

public class BankMain
{

	public static void main(String[] args)
	{
		Bankpin ob=new Bankpin();
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the pin:");
		String input= S.nextLine();
		ob.set(1234);
		ob.validPin();
	}

}
