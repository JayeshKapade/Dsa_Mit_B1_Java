public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};
        int target = 9;
        int result = linearSearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1;
    }
    
}