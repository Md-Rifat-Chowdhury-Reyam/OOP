package Interface.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSAMForFiltering {
    public static void main(String[] args) {

        //create a string list
        List<String> str = Arrays.asList("Rifat", "Md", "Chowdhury","occean");

        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (s )-> s.startsWith("R");

        //Iterate through the list
        for(String st : str)
        {
            if(p.test(st))
            {
                System.out.println(st + "\n");
            }
        }
    }
}
