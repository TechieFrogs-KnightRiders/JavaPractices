package Collections;

import java.util.LinkedList;
import java.util.List;

class Books{
    String Name,Aurthor,Publisher;
    int Quantity;
    Books(int Quantity,String Name,String Aurthor,String Publisher){
        this.Quantity=Quantity;
        this.Name=Name;
        this.Aurthor=Aurthor;
        this.Publisher=Publisher;

    }
}
public class ListBooks {
    public static void main(String[] args) {
        Books b1=new Books(101,"Bird By Bird","Anne Lamott","Sony");
        Books b2=new Books(102,"WaterShip Down","Richard","Sony");
        Books b3=new Books(103,"Adam bede","George","Sony");
        List<Books> BList=new LinkedList<>();
        BList.add(b1);
        BList.add(b2);
        BList.add(b3);
        for(Books b:BList) {
            System.out.println(b.Quantity + " " + b.Name+" "+b.Aurthor+" "+b.Publisher);
        }


    }
}
