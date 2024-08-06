package abstractClass;
abstract class Employee
{
	abstract void calculateSalary();
	abstract void displayInfo();

}
class manager extends Employee
{
	 void calculateSalary()
	 {
		int sal=50000,bonus=5000;
		System.out.println("manager sal is:"+(sal+bonus));

		
		
	 }
	 void displayInfo()
	 {
		String name="ABC"; 
	System.out.println("name of employee:"+name); 
	 }
	
}
class programmer extends Employee
{
	 void calculateSalary()
	 {
		int sal=30000,bonus=2500;
		 System.out.println("Programmer sal is:"+(sal+bonus));

	 }
	 void displayInfo()
	 {
		 String name="HP";
		 System.out.println("name of programmer:"+name);
	 }
}
public class CalculateSphere 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee E=new manager();
		E.displayInfo();
		E.calculateSalary();
		Employee E1=new programmer();
		E1.displayInfo();
		E1.calculateSalary();
	
	}

}
