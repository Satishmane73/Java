
public class Student01 implements Cloneable {

    int sno = 1;
    String name = "Satish";
    String course = "Java";
    double fee = 1000;
    Address add = new Address();

    public Student01 clone() throws CloneNotSupportedException {
        Student01 s = (Student01) super.clone();
        s.add = (Address) this.add.clone(); 
        return s;
    }

    public static void main(String[] args) throws CloneNotSupportedException{
            Student01 s1 = new Student01();
            Student01 s2 = s1.clone();
			
            System.out.println(s1);
			
			s2.add.pin=400100l;
            System.out.println(s2);
			System.out.println(s1);
    }
    public String toString() {
    	return "\nStudent No = "+sno+"\nName = "+name+"\ncource = "+course+"\nfee = "+fee+"\nAdd = "+add;
    }
}