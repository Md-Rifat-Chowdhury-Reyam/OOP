package Interface.MethodReferance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceMethodOfArbitatyObject {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Rifat");
        stringList.add("Vicky");
        stringList.add("Poonam");
        stringList.add("Sachin");

        Collections.sort(stringList, String :: compareToIgnoreCase);

        stringList.forEach(System.out :: println);
    }
}
