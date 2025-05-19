package Interface.MethodReferance;

import java.util.Arrays;

public class Example1 {
    static void print(String s)
    {
        System.out.println(s);
    }

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Charlie"};
        // Using method reference to print each name
        Arrays.stream(names).forEach(Example1 ::print);
    }
}
