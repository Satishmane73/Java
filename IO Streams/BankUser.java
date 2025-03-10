import java.io.*;
class BankUser
{
	public static void main(String [] args)throws Exception
	{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Files//ObjData.ser"));
		
		Bank b=(Bank)ois.readObject();
		
		System.out.println(b.getAccHName()+" Details");
		System.out.println(b);
	}
}