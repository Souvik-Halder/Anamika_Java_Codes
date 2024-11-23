import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][];
        arr[0]=new int[5];
        arr[1]=new int[2];
        arr[2]=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Printing the values which are");
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
