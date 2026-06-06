import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentFloor = sc.nextInt();
        int request1 = sc.nextInt();
        int request2 = sc.nextInt();

        if(request1 > currentFloor)
            System.out.println("Next Stop = " + request1);
        else
            System.out.println("Next Stop = " + request2);

        sc.close();
    }
}