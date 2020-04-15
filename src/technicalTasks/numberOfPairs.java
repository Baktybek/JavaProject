package technicalTasks;

import java.util.Arrays;

public class numberOfPairs {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4};
        int n = sockMerchant(arr);
        System.out.println(n);

    }

    static int sockMerchant(int[] ar) {

        int x = 0;
        int count = 0;
        Arrays.sort(ar);
        for(int i = 0; i < ar.length-1; i++){
            if(ar[i]==ar[i+1]){
                count++;
                i++;
            }
//            else{
//                count = 0;
//            }
//            x = x + count/2;
        }
        return count;
    }
}
