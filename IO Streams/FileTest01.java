import java.io.*;
class FileTest01
{
	public static void main(String [] args)throws FileNotFoundException,IOException
	{
		FileInputStream f=new FileInputStream("Files\\Test.txt");
		int i;
		while((i=f.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}