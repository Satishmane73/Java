import java.io.*;
class DataInoutStram
{
	public static void main(String [] args) throws Exception
	{
		FileOutputStream f=new FileOutputStream("Files//Data.txt");
		DataOutputStream dos=new DataOutputStream(f);
		
		dos.writeInt(97);
		dos.writeFloat(3.14f);
		dos.writeChar('a');
		dos.writeUTF("Hari");
		
	}
}