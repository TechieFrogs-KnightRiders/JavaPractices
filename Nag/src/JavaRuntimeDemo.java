import java.io.IOException;

public class JavaRuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runObj = Runtime.getRuntime();
        runObj.exec("Control Panel");
        System.out.println("Total Memory: "+runObj.totalMemory());
        System.out.println("Free Memory: "+runObj.freeMemory());
        for(int i=0;i<10000;i++){
            new JavaRuntimeDemo();
        }
        System.out.println("Free Memory after creating objects: "+runObj.freeMemory());
        runObj.gc();
        System.out.println("Free Memory after garbage collecting objects: "+runObj.freeMemory());
        System.out.println("All available processors: "+runObj.availableProcessors());
    }
}
