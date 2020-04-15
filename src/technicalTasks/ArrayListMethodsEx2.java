package technicalTasks;

import java.util.*;
public class ArrayListMethodsEx2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Jane");
        names.add(0, "Thomas");
        names.add(1, "Robin");
        names.add("David");
        names.add("Becky");

        // print the list
        System.out.println(names);
        //check is Empty
        System.out.println(names.isEmpty());
        //use contains
        System.out.println(names.contains("Thomas"));
        //use contains
        System.out.println(names.contains("Baha"));
        //indexOf
        System.out.println(names.indexOf("Jane"));
        //use subList()
        System.out.println(names.subList(1,4));
        //delete
        names.removeAll(names);
        //check isEmpty
        System.out.println(names.isEmpty());
        // print all
        System.out.println(names);


    }
}
