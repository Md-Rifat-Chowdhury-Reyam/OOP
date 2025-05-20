package Generic;

import java.util.HashMap;
import java.util.Map;

public class GenericMap {
    public static void main(String[] args) {

        String[] name = { "gfg",  "code",    "quiz",   "program",
                "code", "website", "quiz",   "gfg",
                "java", "gfg",     "program" };
        // to count the frequency of a string and store it
        // in the map
        Map <String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++)
        {
            if(map.containsKey(name[i]))
            {
                int count = map.get(name[i]);

                map.put(name[i], count + 1);
            }
            else {
                map.put(name[i], 1);
            }
        }

        System.out.println(map.get("java"));
        System.out.println(map.get("Rifat"));
    }
}
