import java.util.Scanner;

class TwoDimensional_Array{
    public static void main(String[] args) {
        int[][] arr=new int[4][3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Printing values which are");
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}