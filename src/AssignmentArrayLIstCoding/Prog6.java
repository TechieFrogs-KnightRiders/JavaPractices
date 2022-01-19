package AssignmentArrayLIstCoding;

import java.util.ArrayList;
import java.util.Scanner;
public class Prog6 {
    public static void main(String[] args) {
        /*Scanner sobj=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=sobj.nextInt();//number of rows
        ArrayList<ArrayList<Integer>> rows=new ArrayList<>();
        for(int i=0;i<n;i++){
            int nubOfInt=sobj.nextInt();
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<nubOfInt;j++) {
                row.add(new Integer(sobj.nextInt()));
            }
            rows.add(row);
            sobj.nextLine();
        }
        System.out.println("Enter num of querries" );
         int q=sobj.nextInt();//number of querries
        for(int k=0;k<q;k++) {
            int x = sobj.nextInt() - 1;
            int y = sobj.nextInt() - 1;

            if (x < rows.size() && y < rows.get(x).size())
            {
                System.out.println(rows.get(x).get(y));
            }
            else
            {
                System.out.println("Error!");
            }
        }*/

        Scanner sc = new Scanner(System.in);
        int numLines = Integer.parseInt(sc.nextLine());
        ArrayList<ArrayList> listArray = new ArrayList<ArrayList>();
        for(int i = 0;i<numLines;i++){
            int numOfIntegers = sc.nextInt();
            ArrayList<Integer> intArrayList =  new ArrayList<Integer>();
            /*for(int j=0;j<numOfIntegers;j++){
                intArrayList.add(new Integer(sc.nextInt()));
            }*/
            listArray.add(intArrayList);
            sc.nextLine();
        }
        int numQueries = Integer.parseInt(sc.nextLine());
        for(int i=0;i<numQueries;i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            sc.nextLine();
            if(x<listArray.size() && y<listArray.get(x).size()){
                System.out.println(listArray.get(x).get(y));
            }else{
                System.out.println("ERROR!");
            }
        }
    }
}
