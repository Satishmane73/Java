class Rectangle implements Shape
{
	private double l;
	private double b;
	
	
	public Rectangle(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
	public void area()
	{
		System.out.println("Rectangle Area = "+(l*b));
	}
	public void perimeter()
	{
		System.out.println("Rectangle Perimeter = "+(2*(l+b)));
	}
	public void printLB()
	{
		System.out.println("Length = "+l);
		System.out.println("Breadth = "+b);
	}
}