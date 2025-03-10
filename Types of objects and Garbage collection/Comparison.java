class Comparison
{
	public static void main(String [] a)
	{
		int x=10;
		int y=20;
		int z=10;

		System.out.println("Veriable Comparison");
		System.out.println(x==y);
		System.out.println(x==z);
		//System.out.println(y==z);
		
		Test01 t1=new Test01(); 
		Test01 t2=new Test01(); 
		Test01 t3=t2;
		System.out.println("\nObject Comparison using ==");
		System.out.println(t1==t2);
		System.out.println(t2==t3);
		
		System.out.println("\nObject Comparison using equals() method");
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t3));
	}
}