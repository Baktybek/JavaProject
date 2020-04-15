package technicalTasks;

import java.util.Scanner;

public class threeSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[] {-1, 1, 2, -4, 5, 3, 0, 4};
        String str = "";
        System.out.println("Please enter a number for target: ");
        int target = scanner.nextInt();

        for(int i = 0; i < nums.length-2; i++){
            int sum = nums[i] + nums[i+1] + nums[i+2];
            if(target == sum){
                str += Integer.toString(nums[i]) + Integer.toString(nums[i+1]) + Integer.toString(nums[i+2]);
            }
        }

        System.out.println(str);
    }
}
