import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroes283 {

    public static void moveZeroes(int[] nums) {
        int zize = nums.length;
        if (zize <= 1) return;

        int nonZeroIndex = 0;

        for (int i = 0; i < zize; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        // Fill the remaining positions with zeros
        while (nonZeroIndex < zize) {
            nums[nonZeroIndex++] = 0;
        }

        /* V2
        int zeros = 0;
        int size = nums.length;

        if(size < 2)
            return;

        for (int i = 0; i < size; i++) {

            if (nums[i] == 0) {
                zeros++;
            }
            else if(zeros > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i-zeros] = temp;
            }

        } */

        /* V1
        int zeros = 0;
        int size = nums.length;

        if(size < 2)
            return;

        for (int i = 0; i < size; i++) {

            while (nums[i] == 0) {
                zeros++;

                for (int j = i; j < size - zeros; ) {
                    nums[j] = nums[++j];
                }
            }

            if(i + zeros >= size) {
                for (int j = size - zeros; j < size; j++) {
                    nums[j] = 0;
                }
                break;
            }
        }
        */
    }

    public static void main(String[] args) {

        int[] nums = new int[]{0,1,0,3,12};

        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0};

        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0,0,0,1,5,9,0,0,0};

        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0,0};

        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
