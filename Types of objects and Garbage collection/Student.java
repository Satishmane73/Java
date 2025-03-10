public class Student
{
	private int sno;
	private String name;
	private int witchclass;
	
	public Student(int sno,String name,int witchclass)
	{
		this.sno=sno;
		this.name=name;
		this.witchclass=witchclass;
	}
	public boolean equals(Object obj)
	{
		if(this==obj)
		{	
			return true;
		}
		else
		{
			if(obj instanceof Student)
			{
				Student s=(Student)obj;
				
				return this.sno==s.sno && this.name.equals(s.name) && this.witchclass==s.witchclass;
			}
			else
			{
				return false;
			}
		}
	}
	public int hashCode()
	{
		return (sno+name.length()+witchclass);
	}
	public String toString()
	{
		return "Student No = "+sno+"\nStudent Name = "+name+"\nClass = "+witchclass;
	}
}
