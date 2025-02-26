import java.util.Scanner;
class ReverseAnArray{
    public static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputString =sc.nextLine();
        System.out.println(inputString);
        String[] strarray=inputString.split(" ");
        int[] inputArray= new int[strarray.length];
        for (int i=0;i<strarray.length;i++){
            
            inputArray[i]=Integer.parseInt(strarray[i]);
        }
        int[] arr=inputArray;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            swap(arr, left, right);
            left++;
            right--;
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}