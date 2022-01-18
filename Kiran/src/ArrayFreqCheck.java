public class ArrayFreqCheck {
    public static void main(String[] args) throws NumberFormatException {
        String inStr = "aaabbbbcccddddee";
        char ctr[] = inStr.toCharArray();
        String Str = "";
        int count = 0;

        for(int i=0;i<ctr.length;i++){
            for(int j=i;j<ctr.length;j++){
                if(i != ctr.length-1){
                    if(ctr[i] == ctr[j]){
                        count = count+1;
                    }else{
                        i = j-1;
                        Str = Str+count+ctr[j-1];
                        count = 0;
                        break;
                    }
                }
                    else{
                        if(count == 0){
                            count = 1;
                        }
                        Str = Str+count+ctr[j]; 
                    }
            }
        }

            

        int find = 2;
        char test[] = Str.toCharArray();
        boolean present =false;

        for(int k=0;k<test.length;k++){
           

            if(Character.isDigit(test[k])){
                
                if(find == Integer.parseInt(String.valueOf(test[k]))){
                   
                    System.out.println("Frequency of Char :  "+test[k+1]);
                    present =true;                   
                 }
            }
           
           
            
        }

        if(present !=true){
           System.out.println("Oops ! Not present ........");
        }


    }
    
}
