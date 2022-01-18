public class Students {
    int roll; 
    int phone;
    String address; 
    String name;
    public static void main(String[] args) {
        Students studentsObj = new Students();
        studentsObj.name = "Sam";
        studentsObj.roll = 44;
        studentsObj.phone = 985645784;
        studentsObj.address = "India";
        System.out.println("Name is "+studentsObj.name+" & Roll_No is "+studentsObj.roll+" Phone Number : "+studentsObj.phone+" Address "+studentsObj.address);
        Students studentsObj1 = new Students();
        studentsObj1.name = "John";
        studentsObj1.roll = 84;
        studentsObj1.phone = 784564218;
        studentsObj1.address = "india";
        System.out.println("Name is "+studentsObj1.name+" & Roll_No is "+studentsObj1.roll+" Phone Number : "+studentsObj1.phone+" Address "+studentsObj1.address);
    }

    
}
