class ReverseWord extends StringReverse
{
	public void reverseWord(String s)
	{
		char []ch=s.toCharArray();
		
		int start=0,end=0;
		char []ch1=new char[10];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				ch1[i]=ch[i];
			}
			else
			{
				start=end+1;
				end=i;
				break;
			}
		}	
		for(int i=start,j=0;j<ch1.length;i++,j++)
		{
			ch[i]=ch1[j];
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
	}
	public static void main(String [] args)
	{
		String s="The sky is blue";
		ReverseWord rw=new ReverseWord();
		rw.reverseWord(s);
	}
}