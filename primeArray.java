import java.util.Arrays;

public class primeArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 9, 12, 5, 7, 8, 21, 47, 63, 189};//given elements in an array
        int[] pArr = new int[6];//this empty array is to store the found prime numbers

        int count = 0;//this is to keep count for the prime numbers in an index

        for(int i = 0; i < arr.length; i++){
            int j = 2;
            for( ;j < arr[i]; j++){
                if(arr[i] % j == 0)
                    break;
                }
            if(arr[i] == j) {
                pArr[count] = arr[i];
                count++;
            }
        }
        System.out.println("Prime numbers are: " + Arrays.toString(pArr));
    }
}
