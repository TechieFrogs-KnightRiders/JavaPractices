package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListScanner {    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int n,n1;
        
        System.out.println("Enter Number of Elements");
        
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter The values ");
        for(int i=0; i<n;i++){
            list.add(sc.nextInt());
        }
        
        System.out.println("Plz enter Last Number");
        n1 = Integer.parseInt(sc1.nextLine());
        list.add(list.size(), n1);
        for (Integer values : list) {
            System.out.println(values);
        }
        


    }
    
}
