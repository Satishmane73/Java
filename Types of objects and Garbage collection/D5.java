class A4
{
	int p=5;
}
class B5
{
	int q=6;
}
class C5
{
	int r=7;
	A4 a=new A4();
}
class D5 extends C5 implements Cloneable
{
	int s=8;
	B5 b=new B5();
	//public String toString()
	//{
		//return "P = "+p+"\nQ = "+q+"\nR = "+r+"\nS = "+s;
	//}
	public static void main(String [] args)throws CloneNotSupportedException
	{
		D5 d=new D5();
		D5 d1=(D5)d.clone();
		
		System.out.println(d.a==d1.a);
		System.out.println(d.b==d1.b);
		
		d.a=new A4();
		d.b=new B5();
		
		System.out.println(d.a==d1.a);
		System.out.println(d.b==d1.b);
	}
}
