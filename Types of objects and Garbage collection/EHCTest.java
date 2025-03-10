class EHCTest
{
	public static void main(String [] args)
	{
		Student s1=new Student(2,"Hari",9);
		Student s2=new Student(2,"Hari",9);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
	}
}