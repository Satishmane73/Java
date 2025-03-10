import java.io.*;
class DataInputStreamtest
{
	public static void main(String [] args)throws Exception
	{
		FileInputStream f1=new FileInputStream("Files//Data.txt");
		DataInputStream d=new DataInputStream(f1);
		int i=d.readInt();
		float f=d.readFloat();
		char ch=d.readChar();
		String s=d.readUTF();
		
		System.out.println(i);
		System.out.println(ch); 
		System.out.println(f);
		System.out.println(s);
	}
}