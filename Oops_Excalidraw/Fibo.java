public class Fibo{
    public static void main(String[] args){

        int n=15,a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int sum=0;
        for(int i =0;i<n-2;i++)
{
    sum = a+b;
System.out.println(sum);
    a=b;
    b=sum;
}

        }    }