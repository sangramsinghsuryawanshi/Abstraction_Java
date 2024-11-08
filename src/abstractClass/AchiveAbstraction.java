package abstractClass;
abstract class Achived
{
	public Achived(int a) 
	{
		System.out.println(a);
	}
	abstract void add();
}
public class AchiveAbstraction extends  Achived
{
	public AchiveAbstraction() 
	{
		super(5);
	}
	public void add()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) 
	{
		AchiveAbstraction a = new AchiveAbstraction();
		a.add();
	}
}
