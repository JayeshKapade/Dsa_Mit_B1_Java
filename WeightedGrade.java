import java.util.Scanner;

public class WeightedGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weightedAvg = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            double marks = sc.nextDouble();

            System.out.print("Enter weight for Subject " + i + " (0 to 1): ");
            double weight = sc.nextDouble();

            weightedAvg += marks * weight;
        }

        System.out.println("Weighted Average = " + weightedAvg);

        if (weightedAvg >= 90)
            System.out.println("Grade A");
        else if (weightedAvg >= 80)
            System.out.println("Grade B");
        else if (weightedAvg >= 70)
            System.out.println("Grade C");
        else if (weightedAvg >= 60)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");

        sc.close();
    }
}