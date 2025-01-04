import java.util.Scanner;
class ArrayDemo
{
	public static void main(String [] args)
	{
		Scanner scr=new Scanner(System.in);
		int []a=new int[5];
		System.out.println("enter Array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scr.nextInt();
		}
		
		System.out.println("Display array elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\s");
		}
	}
}