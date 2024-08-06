package abstractClass;

abstract class Animal
{
	abstract void sound();
}
class lion extends Animal
{
	void sound()
	{
		System.out.println("Abstract class method Lion roar..");
	}
}
class Tiger extends Animal
{
	void sound()
	{
		System.out.println("Abstract class method Tiger growl..");
	}
}
public class AnimalSound 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		lion l = new lion();
		l.sound();
		Tiger t = new Tiger();
		t.sound();
		
		
	}
}
