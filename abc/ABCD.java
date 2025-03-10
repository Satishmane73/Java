import java.util.Scanner;
class ABCD
{
	public static void m1()
	{
		Scanner scr=new Scanner(System.in);
		int a;
		int b=10;
		
		System.out.println("Enter first value");
		a=scr.nextInt();
		
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String []are)
	{
		m1();
	}
}