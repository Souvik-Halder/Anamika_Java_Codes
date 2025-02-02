
public class MultipleException {
  
        public static void main(String[] args) {
            try {
                // Code that may throw multiple exceptions
                // String input = "abc";
                // int number = Integer.parseInt(input); // NumberFormatException
    
                int result = 10 / 0; // ArithmeticException
    
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            } 
            catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format.");
            } 
            catch (ArithmeticException e) {
                System.out.println("Error: Division by zero.");
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of bounds.");
            }
            catch(Exception ex){
                System.out.println("Exception Occured.");
            }
            
            System.out.println("Program continues after handling exceptions.");
        }
    
    
}
