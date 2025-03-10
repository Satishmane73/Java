class Example01
{
	static int a=10;
	int b=20;
	private int c=30;
	
	class A1
	{
		public static void main(String [] args)
		{
			System.out.println(Example01.a);
			
			Example01 e=new Example01();
			System.out.println(e.b);
			System.out.println(e.c);
			
		}
	}
}