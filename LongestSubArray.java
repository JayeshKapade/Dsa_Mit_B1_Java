import java.util.*;
public class LongestSubArray {
    public static void main(String[] args){
        int[] arr = new int[]{3,-2,5,-1,2,-3,6,-2,4};
        int k = 7;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        map.put(0, 1);
        for(int i=0;i<arr.length;i++){
                sum += arr[i];
                if(map.containsKey(sum-k)){
                    count += map.get(sum-k);
                }
                map.put(sum, map.getOrDefault(sum, 0) + 1);    
                }
        System.out.println(count);
            }   

        }
