package abstractClass;

import java.util.Scanner;
abstract class BankAccount
{
	abstract void deposit();
	abstract void withdraw();
}
class SavingsAccount extends BankAccount
{
	Scanner sc =new Scanner(System.in);
	int d;
	int s;
	public void deposit()
	{
		System.out.println("Enter deposite Amount for SavingsAccount: ");
		int d=sc.nextInt();
		this.d=d;
		System.out.println("Your amount is deposited successfuly: "+d);
		System.out.println("Enter choice(2)for checking withdrwal: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 2:this.withdraw();
		break;
		default :System.out.println("Invalid number restart please..");
		break;
		}
	}
	public void withdraw()
	{
		System.out.println("Enter withdrwal Amount for SavingsAccount: ");
		int s=sc.nextInt();
		this.s=s;
		System.out.println("Your amount withdrwal is successfuly done: "+s);
	}
}
class CurrentAccount extends BankAccount
{

	Scanner sc =new Scanner(System.in);
	int d;
	int s;
	public void deposit()
	{
		System.out.println("Enter deposite Amount for CurrentAccount: ");
		int d=sc.nextInt();
		this.d=d;
		System.out.println("Your amount is deposited successfuly: "+d);
		System.out.println("Enter choice(2)for checking withdrwal: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 2:this.withdraw();
		break;
		default :System.out.println("Invalid number restart please..");
		break;
		}
	}
	public void withdraw()
	{
		System.out.println("Enter withdrwal Amount for CurrentAccount: ");
		int s=sc.nextInt();
		this.s=s;
		System.out.println("Your amount withdrwal is successfuly done: "+s);
	}
}
public class BankingDetails 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		BankAccount a1 = new SavingsAccount();
		a1.deposit();
		
		BankAccount a2 = new CurrentAccount();
		a2.deposit();
	}

}
