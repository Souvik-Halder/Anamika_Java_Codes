import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfeEachElementInArray {
    public static void main(String[] args) {
        int[] arr={10,5,10,15,10,5};
        //expected output   -> 10  3
	 //5  2
     //15  1
        Map<Integer,Integer> hasMap=new HashMap<>();
        for(int a:arr){
            hasMap.put(a, hasMap.getOrDefault(a, 0)+1);
        }
        for (Integer a : hasMap.keySet()){
            Integer key=a;
            Integer value=hasMap.get(a);
            System.out.println(key+" "+value);
        }
    }
}
