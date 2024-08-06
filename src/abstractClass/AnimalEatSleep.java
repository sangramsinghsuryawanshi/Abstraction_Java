package abstractClass;
abstract class Animal12
{
	abstract void eat();
	abstract void sleep();
}
class lion12 extends Animal12
{
	void eat()
	{
		System.out.println("Abstract class method Lion eating..");
	}
	void sleep()
	{
		System.out.println("Abstract class method Lion sleeping..");
	}
}
class Tiger12 extends Animal12
{
	void eat()
	{
		System.out.println("Abstract class method Tiger eating..");
	}
	void sleep()
	{
		System.out.println("Abstract class method Tiger sleeping..");
	}
}
class Deer12 extends Animal12
{
	void eat()
	{
		System.out.println("Abstract class method Deer eating..");
	}
	void sleep()
	{
		System.out.println("Abstract class method Deer sleeping..");
	}
}
public class AnimalEatSleep 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		lion12 l = new lion12();
		l.eat();
		l.sleep();
		Tiger12 t = new Tiger12();
		t.eat();
		t.sleep();
		Deer12 d = new Deer12();
		d.eat();
		d.sleep();
	}

}
