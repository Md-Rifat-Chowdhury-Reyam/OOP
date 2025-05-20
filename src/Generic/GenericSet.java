package Generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static java.lang.System.out;

public class GenericSet {
    public static void main(String[] args) {

        // create an instance of Set using
        // generics
        Set<Integer> setList = new HashSet<Integer>();
        setList.add(3);
        //another way to add
        setList.add(Integer.valueOf(5));

        // Iterate  using for-each loop
        for (Integer data : setList)
        {
            System.out.println("Integer values : " + data);
        }

        Set<String> stringList = new HashSet<String>();
        stringList.add("Md ");
        stringList.add("Rifat");

        // Iterate using iterator
        Iterator<String> itr = stringList.iterator();
        while(itr.hasNext())
        {
            out.println("Strings : " + itr.next());
        }



    }
}
