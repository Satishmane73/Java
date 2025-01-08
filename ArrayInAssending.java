//Arrrenge Array In Assending Order

import java.util.Scanner;
class ArrayInAssending
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
		
		System.out.println("Array Before Assending");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\s");
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array After Assending");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\s");
		}
	}
}