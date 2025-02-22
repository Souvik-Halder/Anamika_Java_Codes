class SmallestNumberInArray{
    public static void main(String[] args) {
        int[] arr = {1324,232,3864,5278,9026,787};
         int smallNum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
           smallNum=Math.min(arr[i],smallNum);
        }    
        System.out.println("The small num is " + smallNum);
    }
}