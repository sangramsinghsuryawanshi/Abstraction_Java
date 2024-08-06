package interfaceClass;
interface Playable  
{
	public void play();
}
class Football implements Playable
{
	public void play()
	{
		System.out.println("Playing a Football");
	}
}
class Volleyball implements Playable
{
	public void play()
	{
		System.out.println("Playing a Volleyball");
	}
}
class Basketball  implements Playable
{
	public void play()
	{
		System.out.println("Playing a Basketball");
	}
}
public class PlayableSports 
{
	public static void main(String[] args) 
	{
		Playable d = new Football();
		d.play();
		Playable d1 = new Volleyball();
		d1.play();
		Playable d2 = new Basketball();
		d2.play();
	}
}
