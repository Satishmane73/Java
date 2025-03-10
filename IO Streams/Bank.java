public class Bank implements java.io.Serializable
{
	static double minBal=5000;
	
	private long accNo;
	private String accHName;
	private String userName;
	private transient String password;
	private transient double balance;
	
	public void setAccNo(long accNo)
	{
		this.accNo=accNo;
	}
	public long getAccNO()
	{
		return accNo;
	}
	public void setAccHName(String accHName)
	{
		this.accHName=accHName;
	}
	public String getAccHName()
	{
		return accHName;
	}
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return "acc No = "+accNo+
			"\nAcc H Name = "+accHName+
			"\nuser Name = "+userName+
			"\npassword = "+password+
			"\nBalance = "+balance+
			"\nmin  Balance = "+minBal;
	}
}