import java.io.*;
class PrintStreamDemo
{
	public static void main(String [] sgerz)throws FileNotFoundException
	{
		PrintStream p=new PrintStream("Files//Test03.txt");
		p.print("A");
		p.print("B");
		p.println("c");
		p.println("c");
		
	}
