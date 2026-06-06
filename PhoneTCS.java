import java.util.Scanner;

class Phone
{
    int phoneId;
    String os;
    String brand;
    int price;

    Phone(int phoneId, String os, String brand, int price)
    {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId()
    {
        return phoneId;
    }

    public String getOs()
    {
        return os;
    }

    public String getBrand()
    {
        return brand;
    }

    public int getPrice()
    {
        return price;
    }
}

public class PhoneTCS
{
    public static int findPriceForGivenBrand(Phone[] p, String brand)
    {
        int sum = 0;

        for(int i = 0; i < p.length; i++)
        {
            if(p[i].getBrand().equalsIgnoreCase(brand))
            {
                sum = sum + p[i].getPrice();
            }
        }

        return sum;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] p, String os)
    {
        for(int i = 0; i < p.length; i++)
        {
            if(p[i].getOs().equalsIgnoreCase(os)
                    && p[i].getPrice() >= 50000)
            {
                return p[i];
            }
        }

        return null;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Phone[] p = new Phone[n];

        for(int i = 0; i < n; i++)
        {
            int phoneId = sc.nextInt();
            sc.nextLine();

            String os = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();

            p[i] = new Phone(phoneId, os, brand, price);
        }

        String brand = sc.nextLine();
        String os = sc.nextLine();

        int ans = findPriceForGivenBrand(p, brand);

        if(ans > 0)
        {
            System.out.println(ans);
        }
        else
        {
            System.out.println("The given Brand is not available");
        }

        Phone ph = getPhoneIdBasedOnOs(p, os);

        if(ph != null)
        {
            System.out.println(ph.getPhoneId());
        }
        else
        {
            System.out.println("No phones are available with specified os and price range");
        }

        sc.close();
    }
}