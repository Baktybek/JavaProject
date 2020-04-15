package technicalTasks;


import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.*;

public class splitString {

    public static void main(String[] args) {

        String s = "Baha$$##12.4$$##has";
        char[] c = s.toCharArray();
        List<String> list = new ArrayList<>();
        String str = "";
        for (int i = 0; i < c.length; i++){

            if(Character.isLetter(c[i]) || Character.isDigit(c[i])){
                str += c[i];
            }
            else{
                break;
            }
            list.add(str);
        }

        System.out.println(list);
    }
}
