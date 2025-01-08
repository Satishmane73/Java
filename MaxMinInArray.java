//Find Small And Max element

import java.util.Scanner;
class MaxMinInArray
{
	public static void main(String [] args)
	{
		Scanner scr=new Scanner(System.in);
		int size;
		System.out.println("Enter size of Array");
		size=scr.nextInt();
		int []a=new int[size];
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
		int max=a[0],min=a[0];
		
		for (int i=0;i<a.length ;i++)
		{
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
		}
		System.out.println("Max Element in array = "+max);
		System.out.println("Max Element in array = "+min);
	}
}