import java.util.Scanner;

public class AntiCheat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tabSwitch = sc.nextInt();
        int idleTime = sc.nextInt();

        if(tabSwitch > 3 || idleTime > 5)
            System.out.println("Cheating Suspected");
        else
            System.out.println("Normal Activity");

        sc.close();
    }
}