package interfaceClass;
interface Animal
{
	public String bark();
}
class Dog implements Animal
{
	public String bark()
	{
		return "Dog is barking";
	}
}
public class AnimalSound 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dog d = new Dog();
		String s=d.bark();
		System.out.println(s);
	}

}
