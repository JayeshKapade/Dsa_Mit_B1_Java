class A{
    void greet(){
        System.out.println("Hello from Class A");
    }
}
class B extends A{
    void greet(){
        System.out.println("Hello from Class B");
        super.greet();
    }
}
public class Poly2 {
    public static void main(String[] args) {
        A b = new B();
        b.greet();
        
    }
}
