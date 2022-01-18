public class Triangle {
 int a,b,c,s;
 double area(){
 
  return Math.pow("(s*(s-a)*(s-b)*(s-c)");
}
double perimeter(){
  return s=(a+b+c)/2;
}
  public static void main(String[] args){
      Triangle t= new Triangle();
      t.a=2;
      t.b=5;
      t.c=6;
      System.out.println(t.area());
      System.out.println(t.perimeter());
  }
}
