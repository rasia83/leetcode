import java.util.List;
import java.util.ArrayList;

public class FizzBuzz412 {


    public static List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            String element = "";
            if (i % 3 == 0) {
                element += "Fizz";
            }
            if (i % 5 == 0) {
                element += "Buzz";
            }
            if(element.isEmpty()){
                element += Integer.toString(i);
            }
            result.add(element);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> result = fizzBuzz(15);
        System.out.println(result);
    }
}
