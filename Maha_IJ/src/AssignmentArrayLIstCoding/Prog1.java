package AssignmentArrayLIstCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        ArrayList<Character> CharArr=new ArrayList<Character>();
        CharArr.add('c');
        CharArr.add('o');
        CharArr.add('d');
        CharArr.add('i');
        CharArr.add('n');
        CharArr.add('g');
        CharArr.add('c');
        System.out.println("Frequency of particular char " +Collections.frequency(CharArr,'c'));
    /*   Scanner Sobj = new Scanner(System.in);
       int size =Sobj.nextInt();
        ArrayList<Character> CArr=new ArrayList<Character>();
      for(int i=0;i<size;i++){
          CArr=Sobj.next();

        }
            System.out.println("Enter Characters");

            while(!Sobj.hasNext()) {
                System.out.println("not a valid String");
                Sobj.next();
            }
            CArr=Sobj.next();
        System.out.println("Given Input is "+CArr);
*/
    }
}
