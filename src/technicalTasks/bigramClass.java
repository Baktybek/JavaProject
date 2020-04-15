package technicalTasks;

import com.sun.org.apache.bcel.internal.generic.AllocationInstruction;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class bigramClass {

    /**
     * This class will take the text and convert it into an ArrayList
     * then import the elements from the List into Set to get rid of duplicate
     * adjacent words in order to loop through the List to find the bigrams
     * and printing its histogram.
     */

    public static void main(String[] args) throws Exception {

        String data = readFileAsString("/Users/bakmac/Desktop/bigramText.txt");
        String[] arr = data.split("[|/, ?!:;'.@]+");
        List<String> list1 = Arrays.asList(arr);
        List<String> res = new ArrayList<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();

        for (int i = 0; i < list1.size() - 2; i++) {
            String setStr = (list1.get(i) + " " + list1.get(i + 1)).toLowerCase();
            set.add(setStr);
        }

        for (String setS: set) {
            int count = 0;
            for (int j = 0; j < list1.size() - 2; j++) {
                String r2 = (list1.get(j) + " " + list1.get(j + 1)).toLowerCase();
                if (setS.equalsIgnoreCase(r2)) {
                    count++;
                    res.add(setS);
                }
            }
            map.put(setS, count);
        }
        map.forEach((k,v) -> System.out.println("\"" + k + "\" " + v));
    }

    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

}

