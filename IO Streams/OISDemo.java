import java.io.*;
class OISDemo
{
	public static void main(String [] args)throws Exception
	{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Files//Demo01.ser"));
		B b=(B)ois.readObject();
		System.out.println(b);
	}
}