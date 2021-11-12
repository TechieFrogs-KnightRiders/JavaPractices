public class StudentNameDisplay {

    int rollnumber ;
    int phoneNumber;
    String address;
    String name;

    public static void main(String[] args) {

        StudentNameDisplay sObj = new StudentNameDisplay(2,1234567891 ,"newyork street","sam");

        sObj.display();

        StudentNameDisplay sObj2 = new StudentNameDisplay(4,1234567890 ,"newjersey street","john");

        sObj2.display();

    }

    StudentNameDisplay(int rollnumber, int phoneNumber,String address,String name){

        this.rollnumber = rollnumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.name = name;
    }

    void display() {


        System.out.println(rollnumber);
        System.out.println(phoneNumber);
        System.out.println(address);
        System.out.println(name);
    }
}
