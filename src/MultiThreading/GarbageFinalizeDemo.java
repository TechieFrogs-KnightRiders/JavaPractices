package MultiThreading;

public class GarbageFinalizeDemo {
    public void finalize(){//finalize method is from obj class
        System.out.println("My finalize method");
    }

    public static void main(String[] args) throws  InstantiationException   {
        GarbageFinalizeDemo obj1= new GarbageFinalizeDemo();
        try{//this is one way to create obj by using .class.newInstance();
            GarbageFinalizeDemo obj2= GarbageFinalizeDemo.class.newInstance();
            obj2=null;
        }catch (Exception e){
            e.printStackTrace();
        }


     obj1=null;
        //obj2=null;
     System.gc();//gc will call internally finalize method. how many obj u have that many times finalize method will execute

    }

}
