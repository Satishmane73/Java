class B extends A
{
	int y;
	B()
	{
		y=60;
		System.out.println("Y is initialized with 60");
	}
	public String toString()
	{
		return "x = "+x+"\nY = "+y;
	}
}