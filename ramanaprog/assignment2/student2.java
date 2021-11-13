package assignments2;

public class student2 {
    int roll_no;
	String name;
	String address;
    public static void main(String[] args) {
		student2 obj=new student2();
		student2 obj1=new student2();
		obj.roll_no=2;
		obj.name="john";
		obj.address="1-3/5,new street,texas,usa";
		obj.perform();
		obj1.name="sam";
		obj1.roll_no=3;
		obj1.address="1-23/4,oldstreet,california,usa";
		obj1.perform();
    }


    void perform() {
         System.out.println(roll_no+ " "+ name+" "+address);
    }
    
}
