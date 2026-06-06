import java.util.Scanner;

class TravelAgencies{
    private int regNo;
    private String agencyName;
    private String pakageType;
    private int price;
    private boolean flightFacility;

    TravelAgencies(int regNo, String agencyName, String pakageType, int price, boolean flightFacility){
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.pakageType = pakageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    int getRegNo(){
        return this.regNo;
    }
    void setRegNo(int regNo){
        this.regNo = regNo;
    }
    String getAgencyName(){
        return this.agencyName;
    }
    void setAgencyName(String agencyName){
        this.agencyName = agencyName;
    }
    String getPakageType(){
        return this.pakageType;
    }
    void setPakageType(String pakageType){
        this.pakageType = pakageType;
    }
    int getPrice(){
        return this.price;
    }
    void setPrice(int price){
        this.price = price;
    }
    boolean isFlightFacility(){
        return this.flightFacility;
    }
    void setFlightFacility(boolean flightFacility){
        this.flightFacility = flightFacility;
    }
}

public class Tcsipa1 {

    static int findAgencywithHighestPackagePrice(TravelAgencies[] arr){
        int max = 0;
        for(TravelAgencies agency : arr){
            if(agency.getPrice() > max){
                max = agency.getPrice();
            }
        }
        return max;   
    }

    static TravelAgencies agencyDetailsforGivenIdAndType(TravelAgencies[] arr, int regNo, String pakageType){
        for(TravelAgencies agency : arr){
            if (agency.isFlightFacility() && agency.getRegNo() == regNo && agency.getPakageType().equalsIgnoreCase(pakageType)) {
                return agency;
            }
        }
        return null;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         TravelAgencies[] arr = new TravelAgencies[n];
            for(int i = 0; i < n; i++){
                int regNo = sc.nextInt();
                sc.nextLine();
                String agencyName = sc.nextLine();
                String pakageType = sc.nextLine();
                int price = sc.nextInt();
                boolean flightFacility = sc.nextBoolean();

                TravelAgencies agency = new TravelAgencies(regNo, agencyName, pakageType, price, flightFacility);
                arr[i] = agency;
            }
            int regno = sc.nextInt();
            sc.nextLine();
            String pakageType = sc.next();

            System.out.println("-----------------------\nOutput\n-----------------------");
            int maxPrice = findAgencywithHighestPackagePrice(arr);
            TravelAgencies agency = agencyDetailsforGivenIdAndType(arr, regno, pakageType);
            System.out.println(maxPrice);
            if(agency != null)
            System.out.println(agency.getAgencyName() + " " + agency.getPrice());
        sc.close();
    }
}

