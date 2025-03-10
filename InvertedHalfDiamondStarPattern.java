class InvertedHalfDiamondStarPattern
{
	public static void main(String [] args)
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j>=4-i && j>=i-4)
					System.out.print("*");
				else
					System.out.print("\s");
			}
			System.out.println();
		}
	}
}