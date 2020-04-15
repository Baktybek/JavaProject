package technicalTasks;

import java.util.Hashtable;
import java.util.Scanner;

public class hashTable {

    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable1 = new Hashtable<>();
        hashtable1.put(1, "Bishkek");
        hashtable1.put(2, "Naryn");
        hashtable1.put(3, "Osh");
        hashtable1.put(4, "Batken");

        Hashtable<Integer, String> hashtable2 = new Hashtable<>();
        hashtable2.put(5, "Moscow");
        hashtable2.put(6, "Chicago");
        hashtable2.put(7, "NYC");
        hashtable2.put(8, "Los Angeles");

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.putAll(hashtable2);
        hashtable.putAll(hashtable1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the key for the city: ");
        int key = scanner.nextInt();

        Boolean bool = hashtable.containsKey(key);
        System.out.println(bool);
        System.out.println(hashtable.get(key));

        System.out.println(hashtable);



    }
}
