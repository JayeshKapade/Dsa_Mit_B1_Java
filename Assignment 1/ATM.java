import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int withdraw = sc.nextInt();

        if(balance < withdraw)
            System.out.println("Insufficient Balance");
        else if(balance - withdraw < 1000)
            System.out.println("Transaction Failed: Minimum balance violation");
        else
            System.out.println("Transaction Successful");

        sc.close();
    }
}