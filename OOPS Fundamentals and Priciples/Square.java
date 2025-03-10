class Square implements Shape
{
	private double s;
	
	public Square(double s)
	{
		this.s=s;
	}
	public void area()
	{
		System.out.println("Area Of Suare = "+s);
	}
	public void perimeter()
	{
		System.out.println("Perimeter Of Square = "+(4*s));
	}
	public void printS()
	{
		System.out.println("S = "+s);
	}
}