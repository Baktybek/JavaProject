package technicalTasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
---This code will take a String from the user and returns a String
---with the number of Characters in it.
 */
public class showCountOfChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input;

        System.out.println(returnCountOfChars(input = scanner.nextLine()));
    }

    public static String returnCountOfChars(String str){

        String res = "";

        Set<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            set.add(str.charAt(i));
        }

        for(char c: set){
            int count = 0;
            for(int x = 0; x < str.length(); x++){
                if(c == str.charAt(x)){
                    count++;
                }
            }
            res += String.valueOf(c) + Integer.toString(count) + " ";
        }

        return res;
    }
}
