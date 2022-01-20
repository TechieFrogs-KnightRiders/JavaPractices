package AssignmentArrayLIstCoding;

import java.util.ArrayList;
class CustomizedObj{
    String Property;
    public CustomizedObj(String p){
        Property=p;
    }
    public String getProperty(){
       return Property;
    }
}
public class Prog4 {
    public static void main(String[] args) {
        ArrayList<CustomizedObj> Cobj=new ArrayList<CustomizedObj>();
        Cobj.add(new CustomizedObj("Delhi"));
        Cobj.add(new CustomizedObj("MP"));
        Cobj.add(new CustomizedObj("AP"));
        Cobj.add(new CustomizedObj("TN"));
        Cobj.sort(((o1,o2) -> o1.getProperty().compareTo(o2.getProperty())) );
    for(CustomizedObj c: Cobj){
        System.out.println(c.getProperty());
    }
    }
}
