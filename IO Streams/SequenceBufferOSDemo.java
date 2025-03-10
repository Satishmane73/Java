import java.io.*;
class SequenceBufferOSDemo
{
	public static void main(String [] arg)throws Exception
	{
		FileInputStream f=new FileInputStream("Files//Test.txt");
		FileInputStream f1=new FileInputStream("Files//Test01.txt");
		
		SequenceInputStream s=new SequenceInputStream(f,f1);
		
		int data;
		while((data=s.read())!=-1)
		{
			System.out.print((char)data);
		}
		
	}
}