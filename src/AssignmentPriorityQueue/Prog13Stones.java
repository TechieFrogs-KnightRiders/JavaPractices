package AssignmentPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Prog13Stones {
    public void Stones(int[] stone){
        PriorityQueue<Integer> prQ=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<stone.length;i++){
            prQ.add(stone[i]);
        }
        while(prQ.size()>1){
            int x=prQ.poll();
            int y= prQ.poll();
            if (x!=y)prQ.add(x-y);
        }
        System.out.println(prQ.isEmpty()?0:prQ.poll());
    }

    public static void main(String[] args) {
        Prog13Stones obj=new Prog13Stones();
        obj.Stones(new int[]{2,7,4,1,8,1});
    }
}
