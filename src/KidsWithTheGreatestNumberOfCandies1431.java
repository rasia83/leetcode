import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies1431 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = 0;

        for (int c : candies){
            // total = c>total?c:total;
            max = Math.max(c, max);
        }

        // for (int i = 0; i < candies.length; i++) {
        for(int c : candies){
            result.add(c + extraCandies >= max);
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3},3));
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2},1));
        System.out.println(kidsWithCandies(new int[]{12,1,12},10));
        /*
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false]
Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]
         */
    }
}
