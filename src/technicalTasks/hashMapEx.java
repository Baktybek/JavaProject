package technicalTasks;
import java.util.*;

import java.util.HashMap;

public class hashMapEx {

    public static void main(String[] args) {

        Map<String, String> domains = new HashMap<>();

        domains.put("de", "Germany");
        domains.put("sk", "Slovakia");
        domains.put("us", "United States");
        domains.put("ru", "Russia");
        domains.put("hu", "Hungary");
        domains.put("pl", "Poland");
        domains.put("kgz","Kyrgyzstan");
        domains.put("kz","Kazakhstan");
        domains.put("uz","Uzbekistan");

        System.out.println(domains.values());

        System.out.println(domains.get("kgz"));
        System.out.println(domains.get("kz"));
        System.out.println(domains.get("uz"));

        domains.put("uk", "United Kingdom");
        domains.put("sw", "Switzerland");

        Map<String, String> domains2 = new HashMap<>();
        domains2.put("de", "Gruzia");
        domains2.put("kl", "Kuala Lumpur");

        domains.putAll(domains2);

        System.out.println(domains.keySet());
        System.out.println(domains.values());
        System.out.println(domains.entrySet());
        for(Map.Entry<String, String> entry: domains.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
