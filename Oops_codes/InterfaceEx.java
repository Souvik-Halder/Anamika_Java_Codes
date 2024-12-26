interface Honda{
    void drive();
    default void defaultMethod(){
        System.out.println("I am default method");
    }
}

class InterfaceEx {
   public static void main(String[] args) {
    Honda hondaobj=new Honda() {
        public void drive(){
            System.out.println("Driving");
        }
    };
    hondaobj.drive();
   }
}
