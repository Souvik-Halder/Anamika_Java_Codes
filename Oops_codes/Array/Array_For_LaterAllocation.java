package Array;

import java.util.Scanner;

public class Array_For_LaterAllocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];// Declaring the space for the array for later and initilaizing the space for later allocation
     
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
            //Traversing an array
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        } 
        sc.close();
    }
}
