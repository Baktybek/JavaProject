package technicalTasks;

public class findTheElementWithoutNegativePair {
    public static void main(String[] args) {
      int[] arr = {1,2,6,3,-3,-1,-2,6,-5,-4,4,5};
      int result = 0;
      for(int i = 0; i < arr.length; i++){
          for(int x = 0; x < arr.length; x++){
              if(x == i){
                  continue;
              }
              else if(arr[i] == arr[x]){
                  result = arr[i];
              }
          }
      }
        System.out.println(result);
    }
}
