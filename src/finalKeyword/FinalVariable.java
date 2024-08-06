package finalKeyword;

final class ClassFinal
{
	public final void finalMethod()
	{
		System.out.println("FinalClass Cannot Inherits..");
		System.out.println("FinalMethod we cannot override it..");
	}
}
public class FinalVariable 
{
	final int a=10;
	int b=20;
	void main()
	{
		System.out.println("Final keyword: "+a);
		System.out.println("Instance variable: "+b);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FinalVariable f =new FinalVariable();
		ClassFinal f1=new ClassFinal();
		f1.finalMethod();
		f.main();
	}

}
