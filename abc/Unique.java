import java.util.Scanner;
class Unique extends ArrayOperation
{
	public static void main(String [] args)
	{
		Scanner scr=new Scanner(System.in);
		ArrayOperation ao=new ArrayOperation();
		
		System.out.println("Enter Array Size");
		int size=scr.nextInt();
		System.out.println("Enter Elements in Array");
		int []a=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=scr.nextInt();
		}
		ao.setArray(a);
		for(int i=0;i<ao.a.length;i++)
		{
			for(int j=0;j<ao.a.length-1;j++)
			{
				if(ao.a[i]<ao.a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
				}
			}
		}
		System.out.println("Array After Shorting");
		for(int i=0;i<ao.a.length;i++)
		{
			System.out.print(ao.a[i]+"\t");
		}
		System.out.println("\nUnique Elements");
		
		
		for(int i=0;i<ao.a.length;i++)
		{
			boolean flag=true;
			
			for(int j=i+1;j<ao.a.length;j++)
			{
				if(ao.a[i]==ao.a[j])
				{
					flag=false;
					i++;
					break;
				}
			}
			if(flag)
			{
				System.out.print(a[i]+"\t");
			}
		}
	}
}