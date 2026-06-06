abstract class Animal{
    int no_of_legs;
    String color;
    String modes_of_food;

    void eat(){
        System.out.println("Eating Time....Don't Disturb me");   
    }
    void sleep(){
        System.out.println("Sleeping Time....Don't Disturb me");   
    }
    abstract void speak();
}
abstract class Bird extends Animal{

    void fly(){
        System.out.println("Bird is flying");
    }
    void migrate(){
        System.out.println("Bird is migrating");
    }
    abstract void displayName();
}
class Rabbit extends Animal{
    void speak(){
        System.out.println("Rabbit says: Squeak");
    }
    void jump(){
        System.out.println("Rabbit is jumping");
    }    
}
class koyal extends Bird{
    void speak(){
        System.out.println("Koyal says: Koo Koo");
    }
    void displayName(){
        System.out.println("I am a Koyal");
    }
}
public class Abstract1 {
    public static void main(String[] args) {
    Rabbit chiku = new Rabbit();
    chiku.jump();
    chiku.eat();
    chiku.color = "White with Black Patches";
    System.out.println(chiku.color);

    Bird K = new koyal();
    K.speak();
    K.fly();
    K.displayName();
        
    }
    
}
