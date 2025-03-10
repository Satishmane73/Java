class HollowPyramidStarPattern
{
	public static void main(String [] srgs)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(j==4-i || j==4+i || i==4)
					System.out.print("*");
				else
					System.out.print("\s");
			}
			System.out.println();
		}
	}
}
