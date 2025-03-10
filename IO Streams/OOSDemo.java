import java.io.*;
class OOSDemo
{
	public static void main(String [] args)throws Exception
	{
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Files//Demo01.ser"));
		B b=new B();
		b.x=70;
		b.y=80;
		
		System.out.println("X y values are changed to 70 80");
		
		oos.writeObject(b);	
	}
}