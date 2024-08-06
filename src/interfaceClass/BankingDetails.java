package interfaceClass;

import java.util.Scanner;

interface Account
{
	public void deposit();
	public void withdraw();
	public void calculateInterest();
	public void viewBalances();
}
class BankAccount implements Account
{
	Scanner sc =new Scanner(System.in);
	int d;
	int s;
	public void deposit()
	{
		System.out.println("Enter deposite Amount for BankAccount: ");
		int d=sc.nextInt();
		this.d=d;
		System.out.println("Your amount is deposited successfuly: "+d);
		System.out.println("Enter choice(1)(2)for checking calculateInterest/withdrwal: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:this.calculateInterest();
		break;
		case 2:this.withdraw();
		break;
		default :System.out.println("Invalid number restart please..");
		break;
		}
	}
	public void withdraw()
	{
		System.out.println("Enter withdrwal Amount for BankAccount: ");
		int s=sc.nextInt();
		this.s=s;
		System.out.println("Your amount withdrwal is successfuly done: "+s);
		System.out.println("Enter choice(1)for checking viewBalances: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:this.viewBalances();
		break;
		default :System.out.println("Invalid number restart please..");
		break;
		}
	}
	public void calculateInterest()
	{
		System.out.println("Enter Principal amount (the beginning balance): ");
		long b =sc.nextLong();
		System.out.println("Enter  R = Interest rate (usually per year, expressed as a decimal): ");
		double d =sc.nextDouble();
		System.out.println("Enter T = Number of time periods (generally one-year time periods): ");
		int t =sc.nextInt();
		double si=(b*d*t)/100;
		System.out.println("Your simple intrest is: "+si);
		System.out.println("Enter choice(1)for checking viewBalances: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:this.viewBalances();
		break;
		default :System.out.println("Invalid number restart please..");
		break;
		}
	}
	public void viewBalances()
	{
		int c=this.d-=this.s;
		System.out.println("Your BankAccount balance is: "+c);
		System.out.println("Enter choice(1)(0)for checking calculateInterest/exit the BankAccount : ");
		int ch=-1;
		while(ch!=0)
		{
			ch = sc.nextInt();
		switch(ch)
		{
		case 1:this.calculateInterest();
		break;
		default :System.out.println("Invalid number restart please..");
		break;
		}
		}
	}
}
class SavingsAccount implements Account
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
		System.out.println("Enter choice(1)(2)for checking calculateInterest/withdrwal: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:this.calculateInterest();
		break;
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
		System.out.println("Enter choice(1)for checking viewBalances: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:this.viewBalances();
		break;
		default :System.out.println("Invalid number restart please..");
		break;
		}
	}
	public void calculateInterest()
	{
		System.out.println("Enter Principal amount (the beginning balance): ");
		long b =sc.nextLong();
		System.out.println("Enter  R = Interest rate (usually per year, expressed as a decimal): ");
		double d =sc.nextDouble();
		System.out.println("Enter T = Number of time periods (generally one-year time periods): ");
		int t =sc.nextInt();
		double si=(b*d*t)/100;
		System.out.println("Your simple intrest is: "+si);
		System.out.println("Enter choice(1)for checking viewBalances: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:this.viewBalances();
		break;
		default :System.out.println("Invalid number restart please..");
		break;
		}
	}
	public void viewBalances()
	{
		int c=this.d-=this.s;
		System.out.println("Your SavingsAccount balance is: "+c);
		System.out.println("Enter choice(1)(0)for checking calculateInterest/exit the SavingsAccount : ");
		int ch=-1;
		while(ch!=0)
		{
			ch = sc.nextInt();
		switch(ch)
		{
		case 1:this.calculateInterest();
		break;
		default :System.out.println("Invalid number restart please..");
		break;
		}
		}
	}
}
class CurrentAccount implements Account
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
		System.out.println("Enter choice(1)(2)for checking calculateInterest/withdrwal: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:this.calculateInterest();
		break;
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
		System.out.println("Enter choice(1)for checking viewBalances: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:this.viewBalances();
		break;
		default :System.out.println("Invalid number restart please..");
		break;
		}
	}
	public void calculateInterest()
	{
		System.out.println("Enter Principal amount (the beginning balance): ");
		long b =sc.nextLong();
		System.out.println("Enter  R = Interest rate (usually per year, expressed as a decimal): ");
		double d =sc.nextDouble();
		System.out.println("Enter T = Number of time periods (generally one-year time periods): ");
		int t =sc.nextInt();
		double si=(b*d*t)/100;
		System.out.println("Your simple intrest is: "+si);
		System.out.println("Enter choice(1)for checking viewBalances: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:this.viewBalances();
		break;
		default :System.out.println("Invalid number restart please..");
		break;
		}
	}
	public void viewBalances()
	{
		int c=this.d-=this.s;
		System.out.println("Your CurrentAccount balance is: "+c);
		System.out.println("Enter choice(1)(0)for checking calculateInterest/exit the CurrentAccount : ");
		int ch=-1;
		while(ch!=0)
		{
			ch = sc.nextInt();
		switch(ch)
		{
		case 1:this.calculateInterest();
		break;
		default :System.out.println("Invalid number restart please..");
		break;
		}
		}
	}
}
public class BankingDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new BankAccount();
		a.deposit();
		
		Account a1 = new SavingsAccount();
		a1.deposit();
		
		Account a2 = new CurrentAccount();
		a2.deposit();
	}

}
