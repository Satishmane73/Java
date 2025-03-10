class HalfDiamondStarPattern
{
	public static void main(String [] args)
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j<=i && j<=8-i)
					System.out.print("*");
				else
					System.out.print("\s");
			}
			System.out.println();
		}
	}
}