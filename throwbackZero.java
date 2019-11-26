import java.util.Arrays;

public class throwbackZero {
    public static void main(String[] args) {
        int[] arr = {1,3,0,4,0,3,0,0,7};
        System.out.println("The given array: "+Arrays.toString(arr));
        int[] arr2 = new int[arr.length];
         int countZero = 1;
         int countNonZero = 0;

         for(int i = 0; i <= arr.length-1; i++){
             if(arr[i] == 0){
                 arr2[arr2.length-countZero] = arr[i];
                 countZero++;
             }
             else {
                 arr2[countNonZero] = arr[i];
                 countNonZero++;
             }
         }
        System.out.println("The new array with 0\'s thrown in the back: "+Arrays.toString(arr2));
    }
}
