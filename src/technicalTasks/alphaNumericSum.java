package technicalTasks;

/*** FIND THE SUM OF ALL THE DIGITS(INTEGERS, NUMBERS) FROM GIVEN ALPHA-NUMERIC STRING ***/

public class alphaNumericSum {

    public static void main(String[] args) {

        String s = "a2e3df5gkd8";
        char[] sChar = s.toCharArray();//converting this string to char array
        int sum = 0;

//***********************************************************************
        //Solution #1
        char[] c = new char[]{'1','2','3','4','5','6','7','8','9'};

        for(int i = 0; i < sChar.length; i++){
            for (int k = 0; k < c.length; k++){

                if(c[k] == sChar[i]){

                    sum += Integer.parseInt(String.valueOf(c[k]));
                }
            }
        }
        System.out.println(sum);
//***********************************************************************
//       Solution #2
//        for(int i = 0; i < sChar.length; i++){
//
//            if(Character.isDigit(sChar[i])){
//                sum += Integer.parseInt(String.valueOf(sChar[i]));
//            }
//        }
//        System.out.println(sum);

//*************************************************************************
        //Solution #3
//        for(int i = 0; i < s.length(); i++) {
//            if(Character.isDigit(s.charAt(i))){
//                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
//
//            }
//        }
//        System.out.println(sum);

//*************************************************************************
//        for(int i = 0; i < s.length(); i++) {
//            if(Character.isDigit(s.charAt(i))){
//                sum += s.charAt(i) - '0';//Because all the numbers in ASCII table come after zero
//                //that's why if you subtract the value of '0' from any digit will give you actual
//                //difference in ASCII table value
//
//            }
//        }
//        System.out.println(sum);
    }
}
