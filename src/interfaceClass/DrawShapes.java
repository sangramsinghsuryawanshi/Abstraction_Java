package interfaceClass;
interface Drawable 
{
	public void draw();
}
class Circle1 implements Drawable
{
	public void draw()
	{
		System.out.println("Drwaing a Circle");
	}
}
class Rectangle2 implements Drawable
{
	public void draw()
	{
		System.out.println("Drwaing a Rectangle");
	}
}
class Triangle1 implements Drawable
{
	public void draw()
	{
		System.out.println("Drwaing a Triangle");
	}
}
public class DrawShapes 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Drawable d = new Circle1();
		d.draw();
		Drawable d1 = new Rectangle2();
		d1.draw();
		Drawable d2 = new Triangle1();
		d2.draw();
		
	}

}
