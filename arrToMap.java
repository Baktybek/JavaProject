Question: Given an array and it needs to be converted into a Map using each element as a key and boolean
for the value and if the element occurs more than once then set value true.

import java.util.*;
public class arrayToMap {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "a", "a", "c"};
        List<String> arrList = new ArrayList<String>(Arrays.asList(arr));
        Set<String> arrSet = new HashSet<>(arrList);
        Boolean status = false;
        Map<String, Boolean> arrMap = new HashMap<>();

        for(String a: arrSet){
            int count = 0;
            status=false;
            for(String b: arrList){
                if(a.equalsIgnoreCase(b)){
                    count++;
                }
            }
            if(count > 1){
                status = true;
            }
            arrMap.put(a, status);
        }

        System.out.println(arrMap);

    }
}
