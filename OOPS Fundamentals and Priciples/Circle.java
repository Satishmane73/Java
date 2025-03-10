public class Circle implements Shape
{
	public static final float pi=3.14f;
	private double r;
	public Circle(double r)
	{
		this.r=r;
	}
	public void area()
	{
		System.out.println("Area of Square = "+pi*r*r);
	}
	public void perimeter()
	{
		System.out.println("perimeter of circel = "+2*pi*r);
	}
	public void printR()
	{
		System.out.println("radius = "+r);
	}
}