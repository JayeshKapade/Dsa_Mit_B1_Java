public class LongestSubarrayHW2 {
    public static void main(String[] args) {
        int[] arr = {3, -2, 5, -1, 2, -3, 6, -2, 4};
        int k = 7;

        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        System.out.println("Longest Length = " + maxLen);
    
    }
    
}
