package Collections;

import java.util.TreeSet;


    class BooksT implements Comparable<BooksT>{
        String typeBook,Name;
        int nubOfB,Series;
      public  BooksT(String typeBook,String Name,int nubOfB,int Series){
           this.typeBook=typeBook;
           this.Name=Name;
           this.nubOfB=nubOfB;
           this.Series=Series;
        }
        public int compareTo(BooksT b) {
            if (nubOfB > b.nubOfB) {
                return 1;
            } else if (nubOfB < b.nubOfB) {
                return -1;
            } else {
                return 0;
            }
        }
    }
public class TreeBook {
    public static void main(String[] args) {
        TreeSet<BooksT> tB=new TreeSet<>();
        BooksT b= new BooksT("fiction","inventions",5,1234);
        BooksT b1=new BooksT("Non-fiction","reality",2,123);
        BooksT b2=new BooksT("Science","facts",6,12345);
        tB.add(b);
        tB.add(b1);
        tB.add(b2);
        for(BooksT oB:tB){
            System.out.println(oB.typeBook+ "  " +oB.Name+ "  "+oB.nubOfB+ "  "+oB.Series);//Tree set will print inapropriate order
        }

    }
}
