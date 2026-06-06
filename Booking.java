public class Booking {
    public static void main(String[] args) {
        int arr[] = {1,0,0,0,1,0,0,0,0};
        int max = 0, curr=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                curr++;
            }
            else{
                if(i>0 && arr[i-1]!=0)
                max = curr > max ? curr : max;
                curr = 0;
            }
        }
        max = curr > max ? curr : max;
        System.out.println(max);

    }
}
