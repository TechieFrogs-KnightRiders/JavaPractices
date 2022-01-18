public class Arrayassign22 {
    //to find the difference of 2 matrices
    public static void main(String[] args) {
        int rows,cols;
        int a[][]= {{4,2,3},{6,7,8},{4,6,5}};
        int b[][]= {{2,1,3},{1,4,3},{2,3,2}};

        rows=a.length;                                //find the no of rows n columns in matrix
        cols=a[0].length;
        int diff[][] = new int [rows][cols];
        for(int i=0;i<rows;i++)
          {
              for(int j=0;j<cols;j++)
                {
                    diff[i][j] = a[i][j] - b[i][j];
                }
          }
          System.out.println("Differnce of two matrices:");

          for(int i=0;i<rows;i++)
          {
              for(int j=0;j<cols;j++)
                {
                    System.out.print(diff[i][j] + " ");
                }System.out.println();

    }
    
    }
}
