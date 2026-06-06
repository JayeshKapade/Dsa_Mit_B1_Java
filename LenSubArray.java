public class LenSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 1, 0, 3};
        int k = 4;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                count += arr[j];
                if (count == k) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        System.out.println(max);

    }
}
