package technicalTasks;

import java.util.*;

public class MergeNames {

    
    public static String[] uniqueNames(String[] names1, String[] names2) {

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, names1);
        Collections.addAll(list1, names2);

        Set<String> set = new TreeSet<>();
        for(String s: list1){
            set.add(s);
        }
        String[] myArray = new String[set.size()];
        set.toArray(myArray);

        return myArray;

    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia", "Amir"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma", "Ava"};

        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
