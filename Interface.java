interface A{
    void pay();
    default void display(){
        System.out.println("This is a default method in interface A");
    }
}
interface B{
    void pay();
    default void display(){
        System.out.println("This is a default method in interface B");
    }
}
class UPI implements A,B{
    public void pay(){
        System.out.println("Paying through UPI");
    }
    public void display(){
        System.out.println("HI from UPI");
        A.super.display();
        B.super.display();
    }
}
public class Interface {
    public static void main(String[] args) {
       B user= new UPI();
         user.pay();
         user.display();
    }
}
