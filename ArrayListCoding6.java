import java.util.*;
public class ArrayListCoding6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>>rows = new ArrayList<>();
        for(int i=0;i<n;i++)
          {
              int x = sc.nextInt();
              ArrayList<Integer>row = new ArrayList<>();
              for(int j=0;j<x;j++)
                {
                   row.add(sc.nextInt());
                }
                rows.add(row);
          }
          
    }
    
}
