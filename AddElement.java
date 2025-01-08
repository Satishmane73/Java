//Insert Element on Specific index

import java.util.Scanner;
class AddElement
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
		
		System.out.println("array beforer insert element elements\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\s");
		}
		
		System.out.println("\nEnter index to enter Element\n");
		int index=scr.nextInt();
		
		if(index>0 && index<=a.length)
		{
			int []temp=a;
			a=new int[a.length+1];
			
			for(int i=0;i<a.length;i++)
			{
				if(index==i)
				{
					System.out.println("Enter Value on that index");
					a[i]=scr.nextInt();
				}
				else
				{
					a[i]=temp[i-1];
				}
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+"\t");
			}
		}
	}
}