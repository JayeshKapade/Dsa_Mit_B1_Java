import java.util.Scanner;

public class LoginLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correct = "admin";
        int count = 0;

        while(count < 3) {
            String pass = sc.next();

            if(pass.equals(correct)) {
                System.out.println("Login Successful");
                sc.close();
                return;
            }

            count++;
        }

        System.out.println("Account Locked");

        sc.close();
    }
}