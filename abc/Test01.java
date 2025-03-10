import java.util.Scanner;
class Test01
{
	public static void main(String [] args)
	{
		Scanner scr=new Scanner(System.in);
		int a1,a2,a3;
		System.out.println("Enter Trea Angles of trigle");
		a1=scr.nextInt();
		a2=scr.nextInt();
		a3=scr.nextInt();
		
		if((a1+a2+a3) == 180)
		{
			System.out.println("Tringle is valid");
		}
		else	
		{
			System.out.println("Tringle is Invalid");
		}
	}
}
									
