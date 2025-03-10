
public class Address implements Cloneable {
    
	static long pin=431503l;
	int flat = 10;
    String colony = "Surbhi";
    String city = "Pune";

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone(); 
    }
	public String toString()
    {
    	return ""+flat+"\s"+colony+"\s"+city+"\s"+pin;
    }
}