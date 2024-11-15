class Calculator{
    private int id=10;
    public int getId(){
        return id;
    }
    public void setId(int a){
        id=a;
    }
    
    }
    
    class GetterSetter{
    public static void main(String args[]){
        Calculator cal=new Calculator();
        int d=cal.getId();
        int b=17;
        cal.setId(b);
       
        System.out.println(d);
    }
    }