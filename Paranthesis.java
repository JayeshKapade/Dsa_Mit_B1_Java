import java.util.*;

public class Paranthesis {
    public static void main(String args[]) {
        String s = "{[()]}";
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                st.push(c);
            else {
                if (st.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }

                char t = st.pop();

                if ((c == ')' && t != '(') ||
                    (c == '}' && t != '{') ||
                    (c == ']' && t != '[')) {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }

        if (st.isEmpty())
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}