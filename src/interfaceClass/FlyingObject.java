package interfaceClass;
interface Flyable
{
	public void flyObj();
}
class Spacecraft implements Flyable
{
	public void flyObj()
	{
		System.out.println("Spacecraft implements Flyable with flyObj method in interface");
	}
}
class Airplane implements Flyable
{
	public void flyObj()
	{
		double pi=3.14;
		int r=5;
		System.out.println("Airplane implements Flyable with flyObj method in interface");
	}
}
class Helicopter  implements Flyable
{
	public void flyObj()
	{
		int b=3,h=8;
		System.out.println("Helicopter implements Flyable with flyObj method in interface");
	}
}
public class FlyingObject 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable f = new Spacecraft();
		f.flyObj();
		
		Flyable f1 = new Airplane();
		f1.flyObj();
		
		Flyable f2 = new Helicopter();
		f2.flyObj();
	}

}
