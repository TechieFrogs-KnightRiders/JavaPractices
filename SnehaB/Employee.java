public class Employee {
   String name;
   int yearOfJoining;
   int salary;
   String address;
   public static void main(String[] arg){

      Employee detailsObj = new Employee("Robert",1994," 64C- WallsStreat");
      detailsObj.display();

      Employee detailsObj2 = new Employee("Sam", 2000,"68D- WallsStreat");
      detailsObj2.display();

      Employee detailsObj3 = new Employee("John", 1999,"26B- WallsStreat");
      detailsObj3.display();

    }
Employee(String name , int yearOfJoining, String address){
      this.name = name;
      this.yearOfJoining = yearOfJoining;
      this.salary = salary;
      this.address = address;


}

void display(){
    System.out.println("name:"+ name + "  yearOfJoining:"+ yearOfJoining+ "  address:"+ address);

}
}
