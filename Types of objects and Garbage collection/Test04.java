class Test04 implements Cloneable
{
	int y=20;
	int x=10;
	
	public String toString()
	{
		return "x = "+x+"\ny = "+y;
	}
	public static void main(String [] a) throws CloneNotSupportedException
	{
		Test04 t1=new Test04();
		Test04 t2=(Test04)t1.clone();
		
		t1.x=50;
		System.out.println(t1);
		System.out.println(t2);
	}
}