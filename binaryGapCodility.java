package technicalTasks;

import java.util.ArrayList;
import java.util.List;

/**
*This is my own solution to binaryGap from Codility and LeetCode.
*The time complexity of my solution is not be optimized but it can be.
*Author: Bek Uson
**/

public class binaryGap {

        public int solution(int N) {
            // write your code in Java SE 8
            String strBinary = Integer.toBinaryString(N);
            System.out.println("Binary value of "+N+" is "+strBinary);
            //int binary = Integer.parseInt(strBinary);
            char[] arr = strBinary.toCharArray();
            List<Character> list = new ArrayList<>();
            for(char c: arr){
                list.add(c);
            }
            List<Integer> iL = new ArrayList<>();
            for(int i = 0; i < list.size(); i++){
                if(list.get(i) == '1'){
                    if(i==0){
                        i = 1;
                        iL.add(i);
                    }
                    iL.add(i);
                }
            }

            int max = 0;

            if(iL.isEmpty() == true){
                return 0;
            }
            else{
                for(int j = 0; j < iL.size()-1; j++){
                    if((iL.get(j+1)-iL.get(j))>max){
                        max = (iL.get(j+1)-iL.get(j));
                    }
                }
                if(max == 1){
                    max = 0;
                }
            }
            return max;
        }

    public static void main(String[] args) {

            binaryGap bin = new binaryGap();
            System.out.println(bin.solution(529));

    }

}
