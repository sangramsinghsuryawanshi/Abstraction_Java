package interfaceClass;

import java.util.Scanner;

interface Resizable
{
	public void resizeWidth(int width);
	public void resizeHeight(int height);
}
class Rectangle1 implements Resizable
{
	public void resizeWidth(int width)
	{
		System.out.println("Rectangle width before resize is: 4");
		System.out.println("Rectangle width after resize is: "+width);
	}
	public void resizeHeight(int height)
	{
		System.out.println("Rectangle height before resize is: 7");
		System.out.println("Rectangle height after resize is: "+height);
	}
}
public class ResizeInterface 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width for rectangle: ");
		int width=sc.nextInt();
		System.out.println("Enter height for rectangle: ");
		int height=sc.nextInt();
		Rectangle1 r = new Rectangle1();
		r.resizeHeight(height);
		r.resizeWidth(width);
	}
}
