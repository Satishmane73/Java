class CloneTest
{
	public static void main(String [] args)throws Exception
	{
		CloneExample e1=new CloneExample();
		CloneExample e2=(CloneExample)e1.clone();
		
		System.out.println(e1.x+"  "+e1.y);
		System.out.println(e2.x+"  "+e2.y);
	}
}