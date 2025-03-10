import java.util.Scanner;
class MergeArray extends ArrayOperation
{
	public static void main(String [] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=scr.nextInt();
		
		System.out.println("Enter First Array");
		int []a=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=scr.nextInt();
		}
		System.out.println("Enter Second Array");
		int []b=new int[size];
		for(int i=0;i<a.length;i++)
		{
			b[i]=scr.nextInt();
		}
		ArrayOperation ao=new ArrayOperation();
		ao.setArray(a,b);
		
		
		int c[]=new int[ao.a.length+ao.b.length];
		int k=0;
		for(int i=0,j=ao.b.length-1;i<ao.a.length||j>=0; )
		{
			if(k%2==0)
			{
				c[k]=ao.a[i];
				i++;
				k++;
			}
			else
			{
				c[k]=ao.b[j];
				j--;
				k++;
			}
		}
		System.out.println("\nArray After Merge");
		System.out.println("\nArrray After Merge");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"\t");
		}
	}
}