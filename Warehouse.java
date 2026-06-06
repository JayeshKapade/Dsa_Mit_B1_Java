import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int restockCount = 0;
        int totalRequiredStock = 0;

        for (int i = 1; i <= n; i++) {
            int currentStock = sc.nextInt();
            int minStock = sc.nextInt();

            if (currentStock < minStock) {
                int requiredStock = minStock - currentStock;

                System.out.println("Restock needed for product " + i);

                restockCount++;
                totalRequiredStock += requiredStock;
            }
        }

        System.out.println("Total products that need restocking: " + restockCount);
        System.out.println("Total required stock: " + totalRequiredStock);

        sc.close();
    }
}