class StudentTest
{
	public static void main(String [] args)
	{
		Student s1=new Student(1,"Hari",12);
		Student s2=new Student(2,"Krishna",12);
		Student s3=new Student(1,"Hari",12);
		Student s4=s2;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println();
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println();
		
		System.out.println(s2==s4);
		System.out.println(s2.equals(s4));
		System.out.println();
		
	}
}