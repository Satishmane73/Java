//Calculate Sum of the Array

import java.util.Scanner;
class SumOfArray
{
	public static void main(String [] agr)
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
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		
		System.out.println("\nSum of All array elements = "+sum);
	}
}