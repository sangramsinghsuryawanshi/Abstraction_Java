package interfaceClass;
abstract interface A12
{
	void a();
	default void is()
	{
		System.out.println("d");
	}
}
public class AchiveAbigutyError implements A12
{
	public void a() {
		System.out.println("a");
		
	}
	
	A12 a1 = new A12() {

		@Override
		public void a() {
			// TODO Auto-generated method stub
			
		}
		
		
	};
	
	public static void main(String[] args) {
		AchiveAbigutyError s = new AchiveAbigutyError();
		s.a();
	}
}


