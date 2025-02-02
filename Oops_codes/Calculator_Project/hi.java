class hi{
    public static void main(String args[]){
       int i=9;
       int j=0;
        try{
        int ans =i/j;
        int[] arr={1,2};
        System.out.println(arr[3]);
        String str=null;
         System.out.println(str.length());
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.print("Exception Occured" + ex);
        }
        catch( ArithmeticException ex){
            System.out.print(" Exception occured" +ex);
        }
        catch(Exception ex){
            System.out.print(" Exception occured" +ex);
        }
        System.out.println("finish line");
    }
}