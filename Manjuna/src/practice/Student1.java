package practice;

public class Student1 {
	int rollno;
	int phno;
	String name;
	String address; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 S1= new Student1("John",4,76543829,"hyd");
		Student1 S2 = new Student1("Sam",5,345766586,"KKD");
		S1.Display();
		S2.Display();

	}
	 Student1(String n,int r,int p,String a ){
		 rollno = r;
		 name = n;
		 phno = p;
		 address = a;
		 
		
	}
	 void Display() {
		 System.out.println("Student name :"+name+" Rollno: "+rollno+" phno: "+phno+" Address :"+address);
	 }
	
	

}
