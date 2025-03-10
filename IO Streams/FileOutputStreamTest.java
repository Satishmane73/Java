import java.io.*;
import java.util.*;
class FileOutputStreamTest
{
	public static void main(String [] args)throws Exception
	{
		System.out.println("Enter Data In File");
		FileOutputStream f=new FileOutputStream("Files\\Test01.txt");
		char ch=' ';
		Scanner scr=new Scanner(System.in);
		while(ch!='0')
		{
			ch=scr.next().charAt(0);
			f.write(ch);
		}
	}
}