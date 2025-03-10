class Test
{
	static Test t1;
	static Test t2;
	
	Test t3;
	Test t4;
	
	int x=10;
	int y=20;
	
	public static void main(String [] args)
	{
		Test t5;
		Test t6;
		
		Test t7=new Test();
		
		System.out.println(t1);
		System.out.println(t2);
		
		//System.out.println(t3);
		//System.out.println(t4);
		
		//System.out.println(t5);
		//System.out.println(t6);
		
		System.out.println(t7);
		System.out.println(t7.toString());
		
		//System.out.println(t1);
		//System.out.println(t1.toStri	 b ng());
		
		t1=new Test();
		t1.t3=new Test();
		t1.t3.t4=new Test();
		
		System.out.println(t1);
		System.out.println(t1.t3);
		System.out.println(t1.t3.t4);
		System.out.println(t1.t3.t4.t4);
		System.out.println(t1.t3.t4.t3);
		
		
		
	}
}