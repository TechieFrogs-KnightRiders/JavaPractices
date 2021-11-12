public class Average {

    int num1;
    int num2;
    int num3;

    public static void main(String[] arg) {

        Average aObj = new Average(2,4,6);
        aObj.calculate();
    }
    Average (int num1,int num2,int num3){
this.num1 = num1;
this.num2 = num2;
this.num3 = num3;
    }

    void calculate() {
        int sum = num1 + num2 + num3;
        int avg = sum / 3;
        System.out.println("Average of three numbers :" + avg);
    }
}
