package interfaceClass;
interface A
{
	public void disp();
}
interface B
{
	public void disp();
}
interface A1
{
	default void disp1()
	{
		System.out.println("Default method..");
	}
}
interface B1
{
	static void disp()
	{
		System.out.println("Static method..");
	}
}
class C implements A,B,A1,B1
{
	int b=1;
	public void disp()
	{
	
		System.out.println("Class c implements interface A,B,A1,B1..");
	}
	public void disp(int a)
	{
		System.out.println(a+" "+b);
		this.disp();
		a-=b;
		
	}
}
public class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		C c1 = new C();
		B1.disp();
		c1.disp(10);
		c1.disp1();
	}

}
