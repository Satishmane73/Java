public class ThreadApp09 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
//		AddThread ad=new AddThread();
//		ad.start();
		
		SubThread sb = new SubThread();
		sb.start();
		
		System.out.println("Main Existed");
	}

}
