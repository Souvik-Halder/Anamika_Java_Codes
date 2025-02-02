public class Test {
    public static void main(String[] args) {
        try{
            int age =12;
            if (age<18){
                throw new ArithmeticException("Age can't be less than 18");
            }
            else{
                System.out.println(age);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
