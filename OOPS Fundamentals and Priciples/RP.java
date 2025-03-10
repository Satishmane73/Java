public class RP
{
	public static void main(String [] args)
	{
		Shape s;
		callAP(new Rectangle(10,20));
		callAP(new Square(10));
		callAP(new Circle(10));
	}	 
	public static void callAP(Shape s)
	{
		s.area();
		s.perimeter();
		
		if(s instanceof Rectangle)
		{
			((Rectangle)s).printLB();
		}
		if (s instanceof Square)
		{
			((Square)s).printS();
		}
		if (s instan ceof Circle)
		{
			((Circle)s).printR();
		}
	}
}