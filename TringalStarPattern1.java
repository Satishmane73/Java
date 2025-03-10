class TringalStarPattern1
{
	public static void main(String [] srgs)
	{
		for (int i=0;i<5 ;i++ )
		{
			for(int j=0;j<5;j++)
			{
				if(j>=4-i)
					System.out.print("*");
				else
					System.out.print("\s");
			}
			System.out.println();
		}
	}
}