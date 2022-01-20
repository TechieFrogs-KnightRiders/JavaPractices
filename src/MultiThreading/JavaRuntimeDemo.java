package MultiThreading;

import java.io.IOException;

public class JavaRuntimeDemo {

    public static void main(String[] args) throws IOException {
        Runtime runobj=Runtime.getRuntime();
       // Runtime.getRuntime().exec("Notepad");//we can open notepad
        runobj.exec("Notepad");//we can give path of file also and shutdown process also
        runobj.exec("paint");
        System.out.println("Free memory " +runobj.freeMemory());
        System.out.println(" Total memory " +runobj.totalMemory());
        for(int i=1;i<1000;i++){
            new JavaRuntimeDemo();
        }
        System.out.println("After crating 1000 obj the free memory " +runobj.freeMemory());
        System.gc();//System is a class gc()garbagecollection method will remove the unused obj

        System.out.println("After removing 1000 obj the free memory " +runobj.freeMemory());


    }
}
