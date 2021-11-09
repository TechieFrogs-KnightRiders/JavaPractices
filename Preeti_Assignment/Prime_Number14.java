public class Prime_Number14 {
    public static void main(String[] args) {
        int num = 75;
        System.out.println("Prime nos are : " + 2);
        boolean flag = false;
        for(int i = 3; i <= num; i++)
        {
            for(int j = 2; j < i; j++)
            {
                if(i%j == 0 )
                {
                    flag = true;
                    break;
                }
                else
                    flag = false;
            }
            if(!flag)
                System.out.println(i);
        }
        
    }
    
}
