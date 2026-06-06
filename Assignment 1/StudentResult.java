import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        boolean fail = false;

        for(int i = 0; i < 5; i++) {
            int mark = sc.nextInt();

            if(mark < 33)
                fail = true;

            sum += mark;
        }

        double avg = sum / 5.0;

        if(fail)
            System.out.println("Fail");
        else if(avg >= 75)
            System.out.println("Distinction");
        else if(avg >= 60)
            System.out.println("First Class");
        else if(avg >= 50)
            System.out.println("Second Class");
        else
            System.out.println("Pass");

        sc.close();
    }
}