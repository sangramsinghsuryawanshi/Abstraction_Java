package abstractClass;
abstract class shape3D
{
	abstract void calculateVolume();
	abstract void calculateSurfaceArea();

	
}
class sphere extends shape3D
{
	 void calculateVolume()
	 {
		int r=5;
		double result=(4/3)*(3.14)*r*r*r;
		System.out.println("volume of sphere is:"+result);
	 }
	 void calculateSurfaceArea()
	 {
		int r=6;
		double result=4*(3.14)*r*r;
	System.out.println("surface of sphere is:"+result);

	 }

}
class cube extends shape3D
{
	 void calculateVolume()
	 {
		 int v=6;
		 int result=v*v*v;
		 System.out.println("volume of cube is:"+result);
	 }
	 void calculateSurfaceArea()
	 {
		 int sa=3;
		 int result=6*sa*sa;
 System.out.println("surface of cube is:"+result);

	 }

}
public class EmployeeAbstract 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		shape3D s=new sphere();
		s.calculateVolume();
		s.calculateSurfaceArea();
		System.out.println("------------------");
		shape3D s1=new cube();
		s1.calculateVolume();
		s1.calculateSurfaceArea();
	}

}
