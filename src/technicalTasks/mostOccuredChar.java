package technicalTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class mostOccuredChar {

    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'c', 'c', 'b', 'c', 'a'};
        Set<Character> set = new HashSet<>();
        for (char a: arr){
            set.add(a);
        }

        char most = ' ';
        int max = 0;
        for (char s: set){
            int count = 0;
            for (int k = 0; k < arr.length; k++){
                if(s == arr[k]){
                    count++;
                }
            }
            if(count > max){
                max = count;
                most = s;
            }
        }

        System.out.println("The most frequent element is: "+ most);

    }
}
