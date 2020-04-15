package technicalTasks;

public class reverseArrayReturnInt {

    /**
     * This class will take an array and reverses it into integer
     * It can only reverse the integers from {1-10}
     * @author Baha Uson
     */

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        reverseArrayReturnInt arrayReturnInt = new reverseArrayReturnInt();
        System.out.println(arrayReturnInt.reverseArrToInt(arr));

    }

    public long reverseArrToInt(int[] ar){

        long res = 0;
        for(int i = ar.length-1; i >= 0; i--){
            res = (res  * 10) + ar[i];
        }

        return res;
    }
}
