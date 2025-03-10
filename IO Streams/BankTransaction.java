import java.io.*;
class BankTransaction
{
	public static void main(String [] agrs)throws Exception
	{
		Bank b=new Bank();
		b.setAccNo(01);
		b.setAccHName("Mane");
		b.setUserName("SatishMane");
		b.setPassword("Mane7350");
		b.setBalance(10000);
		
		System.out.println(b);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Files//ObjData.ser"));
		
		oos.writeObject(b);
	}
}