public class findDigits {

    public static void main(String[] args) {

        int n = 123456789;

        int temp = n;
        int temp1;
        int count = 0;

        while(temp != 0){
            temp1 = temp % 10;
            if(temp1 == 0){

            }
            else if(n % temp1 == 0) {
                count++;
            }
            temp1 = 0;
            temp = temp / 10;
        }
        System.out.println(count);
    }
}
