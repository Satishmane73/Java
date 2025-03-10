class BankAccount
{
	private long accNo;
	private double bal;
	private String user;
	private String pass;
	
	public BankAccount(long accNo,double bal,String user,String pass)
	{
		this.accNo=accNo;
		this.bal=bal;
		this.user=user;
		this.pass=pass;
	}
	public void deposite(double amt)throws InvalidAmountException
	{
		if(amt<=0)
		{
			throw new InvalidAmountException();
		}
		else
		{
			bal=bal+amt;
		}
	}
	public double withdraw(double amt) throws InsufficientFundException
	{
		if(bal<amt)
		{
			throw new InsufficientFundException();
		}
		else
		{
			bal=bal-amt;
			return amt;
		}
	}
	public String toString()
	{
		return "Account No: "+accNo+"\nBalance : "+bal+"\nUser Name : "+user+"\nPassword : "+pass;
	}
}