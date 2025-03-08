import java.util.Scanner;

class CheckPallindromeInARange{
    
    public static void main (String args[]){
    
        // for Input
      Scanner sc = new Scanner(System.in);
      String inputStr = sc.nextLine(); // "10 30"
      String[] inputStrArr= inputStr.split(" "); //["10","30"]
      int[] inputArr = new int[inputStrArr.length];
      for(int i=0;i<inputStrArr.length; i++){
        inputArr[i]=Integer.parseInt(inputStrArr[i]);
       }
       int min = inputArr[0];
       int max= inputArr[1];
       
          // for Input taking 
       
       // Run a loop between max and min 
        for( int i=min; i<=max;i++){
            boolean test=checkPallindromeOrNot(i);
           if(test){
                System.out.print(i+" ");
           }
        }
        
    }
    public static boolean checkPallindromeOrNot(int num){ //1221
        int rev = 0; 
        int temp= num;
        while(temp>0){
            int digit = temp%10;
            rev= rev*10+digit;
            temp=temp/10;
        }
        if(rev==num){
            return true;
        }else{
            return false;
        }
    }

}