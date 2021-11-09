public class Swap_Num3 {
    public static void main(String[] args) {
        int x = 37, y = 74;
        x+=y;
        y = x-y;
        x-=y;
        System.out.println("Swapped no  x : " + x + ", y : " + y);
    }
}
