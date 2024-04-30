public class MaximumAverageSubarray643 {

    public static double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        for(int i = 0; i < k; i ++)
            sum += nums[i];

        int maxSum = sum;
        for(int i = k; i < nums.length; i ++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum / k;

        /* First try I didn't understand that I needed to test ALL sub array possibilities

        int length = nums.length;
        if(length == 1)
            return (double) nums[0];

        int exclude = length - k;
        if(exclude % 2 != 0 ) {
            exclude++;
            length++;
        }
        exclude /= 2;

        length -= exclude;

        int total = 0;
        for (int i = exclude; i < length ; i++) {
            // System.out.println("total "+ total + " + " + nums[i]);
            total += nums[i];
        }
        // System.out.println("*** "+ total );
        return (double) total /k;
        */
    }

    public static void main(String[] args) {

        int[] nuns = new int[]{1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nuns, 4));
        // Output: 12.75000
        // Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

        nuns = new int[]{5};
        System.out.println(findMaxAverage(nuns, 1));

        nuns = new int[]{1,0,1,4,2};
        System.out.println(findMaxAverage(nuns, 4));

        nuns = new int[]{0,4,0,3,2};
        System.out.println(findMaxAverage(nuns, 1));

        nuns = new int[]{-6662,5432,-8558,-8935,8731,-3083,4115,9931,-4006,-3284,-3024,1714,-2825,-2374,-2750,-959,6516,
                9356,8040,-2169,-9490,-3068,6299,7823,-9767,5751,-7897,6680,-1293,-3486,-6785,6337,-9158,-4183,6240,
                -2846,-2588,-5458,-9576,-1501,-908,-5477,7596,-8863,-4088,7922,8231,-4928,7636,-3994,-243,-1327,8425,
                -3468,-4218,-364,4257,5690,1035,6217,8880,4127,-6299,-1831,2854,-4498,-6983,-677,2216,-1938,3348,4099,
                3591,9076,942,4571,-4200,7271,-6920,-1886,662,7844,3658,-6562,-2106,-296,-3280,8909,-8352,-9413,3513,
                1352,-8825};
        System.out.println(findMaxAverage(nuns, 90));
    }
}
