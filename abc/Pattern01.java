class Pattern01
{
	public static void main(String [] args)
	{
		for(int i=0;i<7;i++)
		{
			int k=65;
			for(int j=0;j<13;j++)
			{
				
				if(j>=i && j<=12-i)
				{
					if(i%2==0 && j%2==0)
					{
							System.out.print((char)k++);
					}
					else
					{
						if(i%2!=0 && j%2!=0)
						{
							System.out.print((char)k++);
						}
						else
							System.out.print("\s");
					}
				}
				else
				{
					System.out.print("\s");
				}
				
			}
			
			System.out.println();
		}
	}
}