class Calculator{
    int a;
    int b;
    Calculator(){

    }
    Calculator(int a,int b){
    this.a=a;
    this.b=b;
    }
    public  int add(int a , int b){
        return a+b;
    }
    
    public int average(int a , int b){
       // you can call by this way if the method will be static int c=add(a,b)/2;
        int c=this.add(a,b)/2;
        return c;
    }
       
    }
    // Whenever you wants to call the elements present in the same class itself then we need to use
       // this keyword
    
    
    
    class ThisKeywordExample{
        public static void main (String args[]){
    
            Calculator cal =new Calculator();
        Calculator cal1 =new Calculator();
            int a=7;
            int b=8;
            cal.average(7,8);
            int c=6;
            int d=5;
            int f=cal1.average(c,d);
            System.out.println(f);
         Calculator cal3=new Calculator(4,5);
    
        }
    } 