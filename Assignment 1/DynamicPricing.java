import java.util.Scanner;

public class DynamicPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        String demand = sc.next();
        String weekend = sc.next();

        if(demand.equalsIgnoreCase("High"))
            price = price + (price * 0.20);

        if(weekend.equalsIgnoreCase("Yes"))
            price = price + (price * 0.10);

        System.out.println("Final Price = " + price);

        sc.close();
    }
}