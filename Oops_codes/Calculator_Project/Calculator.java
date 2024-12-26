import java.util.Scanner;

class CalculatorProj{
    public int add(int a, int b)
    {
        int c = a+b;
        return c;
    }
    public int subtract(int a, int b)
    {
        int c = a-b;
        return c;
    }
    public int multiplication(int a, int b)
    {
        int c = a*b;
        return c;
    }
    public int division(int a, int b)
    {
        int c = a/b;
        return c;
    }
    public int power(int a, int b)
    {
        int c = a;
        for(int i = 0 ; i<(b-1);i++){
            c = c*a;
        }
        return c;
    }
    public double percentage(int a, int b)
    {
        double c = (double) (a*b)/100;
        return c;
    }
    public double percentage(double a, double b)
    {
        double c = (a*b)/100;
        return c;
    }




}
class Calculator{
    public static void main(String args[])
    {
        CalculatorProj cal = new CalculatorProj();
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();

        char ch=sc.next().charAt(0);
        int a=sc.nextInt();
        switch(ch){
            case '+':
            int sum=   cal.add(a, c);
            System.out.println(sum);
            break;
            case '-':
            int subtract= cal.subtract(c, a);
            System.out.println(subtract);
            break;
            case '*':
            int multiplication = cal.multiplication(c,a);
            System.out.println(multiplication);
            break;
            case '/':
            int division = cal.division(c,a);
            System.out.println(division);
            break;
            case '^':
            int power = cal.power(c,a);
            System.out.println(power);
            break;
            case '%':
            double percentage = cal.percentage((double) c,(double)a);
            System.out.println(percentage);


        }


    }
}