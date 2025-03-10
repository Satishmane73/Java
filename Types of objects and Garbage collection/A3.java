class A3
{
	static void m1(Object obj)
	{
		Class cls=obj.getClass();
		String name=cls.getName();
		
		
		System.out.println("The passes object is of type "+name);
	}
}