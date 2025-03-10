class Pattern02
{
	public static void main(String [] args)
	{
		int  count=6;
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(j<10/2)
				{
					count--;
					if(j<=i)
					{
						System.out.print(count+" ");
					}
					else if(j<=8-i)
					{
						System.out.print(count+" ");
					}
					else if(j>=i)
					{
						System.out.print(count+" ");
					}
					
				}
				if(j>=10/2)
				{
					count++;
					System.out.print(count+" ");
				}
				
			}
			count=6;
			System.out.println();
		}
		
		
	}
}