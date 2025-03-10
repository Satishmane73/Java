class Example05
{
	static{
		System.out.println("Outer Class Loaded");
	}
	static class A05
	{
		static{
			System.out.println("inner Class Loaded");
		}
		public static void main(String [] args)
		{
			System.out.println("Inner Class Main Methos");
		}
	}
	public static void main(String [] srgs)
	{
		System.out.println("Outer Class Main Methos");
	}
}