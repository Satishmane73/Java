class Cleark
{
	public static void main(String [] args)throws InvalidAmountException,InsufficientFundException
	{						
		BankAccount acc1=new BankAccount(1,5000,"Hari","Krishna");
		BankAccount acc2=new BankAccount(2,10000,"Rama","Krishna");
		acc1.deposite(5000);
		
		//acc1.deposite(500);
		acc1.withdraw(10000);
		System.out.println(acc1);
	}
}