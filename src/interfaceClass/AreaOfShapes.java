package interfaceClass;
interface shape
{
	public void getarea();
}
class Rectangle implements shape
{
	public void getarea()
	{
		int l=4,w=7;
		System.out.println("Area of rectangle is: "+(l*w));
	}
}
class Circle implements shape
{
	public void getarea()
	{
		double pi=3.14;
		int r=5;
		System.out.println("Area of circle is: "+(pi*(r*r)));
	}
}
class Traingle implements shape
{
	public void getarea()
	{
		int b=3,h=8;
		System.out.println("Area of circle is: "+(0.5*(b*h)));
	}
}
public class AreaOfShapes 
{
	public static void main(String[] args) 
	{
		Rectangle r =new Rectangle();
		r.getarea();
		Circle c =new Circle();
		c.getarea();
		Traingle t =new Traingle();
		t.getarea();
	}
}
