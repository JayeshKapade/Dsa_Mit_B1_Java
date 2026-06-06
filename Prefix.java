import java.util.*;
public class Prefix {
    public static void main(String[] args){
        int[] arr = new int[]{3,-2,5,-1,2,-3,6,-2,4};
        int k = 7;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, max = 0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
                sum += arr[i];
                if(map.containsKey(sum-k)){
                    int len = i - map.get(sum-k);
                    max = max<len?len:max;
                }
                if(!map.containsKey(sum)){
                    map.put(sum, i);    
                }
        System.out.println(max);
            }   

        }
}
