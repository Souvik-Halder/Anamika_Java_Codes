

class CalSum{
int a;
int b;
public int add(int a,int b){
    return a+b;
}
}

class CalAverage extends CalSum{
int c;
int d;

public int average(int c,int d){
System.out.print(super.a);
int e =super.add(c,d)/2;
 return e;
}

}
class SuperKeywordExample{
public static void main(String args[]){
    CalAverage cal=new CalAverage();
    int first_num=4;
    int second_num=5;
   int f= cal.average(first_num,second_num);
    System.out.print(f);
    
    }
}



// super() -> By using this you can refer to the constructor of instant  parent class


