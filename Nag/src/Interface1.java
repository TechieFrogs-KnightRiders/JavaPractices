public interface Interface1 {
    int i = 20;
    void display();

    private void display1(){

    }

    public static void main(String[] args) {
        Interface1 intObj = new Interface1() {

            @Override
            public void display() {
                // TODO Auto-generated method stub
                
            }
            
        };
        intObj.display1();
    }
}


