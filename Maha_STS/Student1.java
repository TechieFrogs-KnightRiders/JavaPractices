package Assignment1;

public class Student1 {
	int rno,phonenub;
    String address,name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 obj1=new Student1(1,25252,"Sam","Hyd");
        Student1 obj2=new Student1(2,3232,"Jhon","banglore");
       System.out.println(obj1.rno); 
       System.out.println(obj2.name);
    }
	Student1(int r,int ph,String n,String add){

    System.out.println(+r+"\t " +ph+" " +n +add);
    System.out.println("my name is: " +n);
	}
}
