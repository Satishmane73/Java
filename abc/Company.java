import java.util.Scanner;
public class Company
{
	Employee []e=new Employee[5];
	static int count=0;
	static Scanner scr=new Scanner(System.in);
	public static void main(String [] args)
	{
		Company c=new Company();
		int ch;
		do
		{
			System.out.println("1 : Enter Employee");
			System.out.println("2 : Display All Employee");
			System.out.println("3 : Update Employee by id");
			System.out.println("4 : Delet Employee by Id");
			System.out.println("5 : Exit");
			System.out.println("Enter Your Choice");
			ch=scr.nextInt();
			switch(ch)
			{
				case 1:
						c.addEmployee();
					break;
					
				case 2:
						c.showEmployee();
					break;
					
				case 3:
						c.updateEmployee();
					break;
					
				case 4:
						c.deletEmployee();
					break;
				
				case 5:
						System.exit(0);
					break;
					
				default:
					System.out.println("Wrong Input");
			}
		}
		while(true);
	}
	public void addEmployee()
	{
		int id;
		String name;
		String email;
		double salary;
		
		e[count]=new Employee();
		System.out.println("Enter Employee Id");
		id=scr.nextInt();
			
		System.out.println("Enter Employee Name");
		scr.nextLine();
		name=scr.nextLine();
		
		System.out.println("Enter Employee email");
		email=scr.nextLine();
			
		System.out.println("Enter Employee Salary");
		salary=scr.nextDouble();
		e[count].setId(id);
		e[count].setName(name);
		e[count].setEmail(email);
		e[count].setSalary(salary);	
					
		count++;
	}
	public void showEmployee()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println("Id = "+e[i].getId()+"\nName = "+e[i].getName()+
				"\nemail = "+e[i].getEmail()+"\nSalary = "+e[i].getSalary()+"\n");
		}
	}
	public void updateEmployee()
	{
		System.out.println("Enter id to update Employee");
		int uid=scr.nextInt();
		
		for(int i=0;i<count;i++)
		{
			if(uid == e[i].getId())
			{
				int id;
				String name;
				String email;
				double salary;
				System.out.println("Enter Updaten id");
				id=scr.nextInt();
				
				System.out.println("Enter Updated name");
				scr.nextLine();
				name=scr.nextLine();
				
				System.out.println("Enter Updated email");
				email=scr.nextLine();
				
				System.out.println("Enter Salary");
				salary=scr.nextDouble();
				
				e[i].setId(id);
				e[i].setName(name);
				e[i].setEmail(email);
				e[i].setSalary(salary);
				
			}
			else
			{
				System.out.println("Enter Valid employee id");
			}
				
		}
	}
	public void deletEmployee()
	{
		System.out.println("Enter id to Delet Employee");
		int did=scr.nextInt();
		for(int i=0;i<count-1;i++)
		{
			if(did==e[i].getId())
			{
				e[i]=e[i+1];
			}
		}
		count--;
	}
}