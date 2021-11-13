package assignments2;

public class student1{
    int roll_no;
	String name;
	String address;
	

	public static void main(String[] args) {
		student1 obj=new student1();
		obj.roll_no=2;
		obj.name="john";
		obj.address="1-3/5,new street,texas,usa";
		obj.perform();
    }
	void perform() {
		
		System.out.println(roll_no+ " "+ name+" "+address);
	}

}