import java.util.Arrays;

public class RichestCustomerWealth1672 {


    public static void main(String[] args) {
        int[][] nums = new int[][]{{2, 4, 10}, {5, 15, 13}};
        System.out.println(maximumWealth(nums));
    }



    public static int maximumWealth(int[][] accounts) {

        // v3 slow
        int biggest = 0;
        for (int[] costumer:accounts) {
            int total = Arrays.stream(costumer).sum();
            if(biggest < total)
                biggest = total;
        }
        return biggest;


        /* v2
        int biggest = 0;

        for (int i = 0; i < accounts.length; i++) {
            int total = accounts[i][0];
            for (int j = 1; j < accounts[i].length; j++) {
                total += accounts[i][j];
            }
            if(biggest < total)
                biggest = total;
        }

        return biggest;
*/
        /* v1
        int[] total = new int[accounts.length];

        for (int i = 0; i < total.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                total[i] += accounts[i][j];
            }
        }

        int biggest = total[0];

        for (int i = 1; i < total.length; i++) {
            if(biggest < total[i])
                biggest = total[i];
        }

        return biggest;
        */
    }
}
