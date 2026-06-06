import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pass = sc.next();

        boolean upper = false;
        boolean digit = false;
        boolean special = false;

        for(char ch : pass.toCharArray()) {
            if(Character.isUpperCase(ch))
                upper = true;
            else if(Character.isDigit(ch))
                digit = true;
            else if(!Character.isLetterOrDigit(ch))
                special = true;
        }

        if(pass.length() >= 8 && upper && digit && special)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");

        sc.close();
    }
}