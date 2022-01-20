public class LoopingConstructs {
    public static void main(String[] args) {
        int j = 1;
        outerLoop:
        /*for(int i =1; i < 5 ; i++ ){ // outer loop
            innerLoop:
            for(j = 1; j < 5; j++){  // inner loop
                System.out.println("j = "+j);
                
                nestedLoop:
                for(int k = 1; k < j; k++){
                    System.out.println(k);
                    if(j == 3){
                        break outerLoop;
                    }
                }
                
                
            }
           // break nestedLoop;
        }*/

        do{
            System.out.println("In do while");
        }while (false);

      /*  while(false){
            System.out.println("In while");
        }

        for(;false;){
            System.out.println();
        }*/

        if(j == 10){
            System.out.println("In if");
           // break;
           // continue;
        }
    }

     LoopingConstructs(){
        System.out.println("In looping constructor");
    }
}
