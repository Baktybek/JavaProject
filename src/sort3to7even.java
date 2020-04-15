import java.util.Arrays;
import java.util.List;

public class sort3to7even {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 7, 3, 3, 3, 4, 5, 6, 2, 1);

        numbers.stream().filter(x->x%2==0).filter(x->x>3 && x<7).forEach(System.out::println);

    }
}
