
class Calculator{
  int a=19;
  public int add(int a,int b){
    int c=a+b;
    return c;

  }
}

public class StackHeapExample {
  public static void main(String[] args) {
    int num=10;
    Calculator cal=new Calculator();
    int a=10;
    int b=20;
    System.out.println(num);
    int d=cal.add(a, b);
    System.out.println(d);
  }
}
