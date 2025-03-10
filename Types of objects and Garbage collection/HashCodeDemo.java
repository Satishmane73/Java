class HCExample
{
	
}
class HashCodeDemo
{
	public static void main(String [] argsd)
	{
		HCExample e1=new HCExample();
		HCExample e2=new HCExample();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode()==e2.hashCode());
	
		HCExample e3=e2;
		System.out.println(e2==e3);
		System.out.println(e2.equals(e3));
		System.out.println(e2.hashCode()==e3.hashCode());
		
		Student s1=new Student(1,"Hari",12);
		Student s2=new Student(1,"Hari",12);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
	}
}