package practice;

public class Student {
	int rollno;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1 = new Student("Adwik", 10);
		S1.Display();

	}
	Student(String s , int i ){
		rollno = i;
		name = s;
		
		
	}
	void Display() {
		System.out.println("Student :"+name+ " "+rollno );
	}

}
