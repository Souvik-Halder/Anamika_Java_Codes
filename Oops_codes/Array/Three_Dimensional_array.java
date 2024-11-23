import java.util.Scanner;

public class Three_Dimensional_array {
    public static void main(String[] args) {
        int[][][] arr=new int[3][4][2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                for(int k=0;k<arr[0][0].length;k++){
                    arr[i][j][k]=sc.nextInt();

                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                for(int k=0;k<arr[0][0].length;k++){
                    System.out.println(arr[i][j][k]);

                }
            }
        }
    }
}
