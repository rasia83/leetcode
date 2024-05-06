public class FindTheHighestAltitude1732 {

    /**
     There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
     The biker starts his trip on point 0 with altitude equal 0.

     You are given an integer array gain of length n
     where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n).
     Return the highest altitude of a point.
     */
    public static int largestAltitude(int[] gain) {

        int highest = 0;
        int current = 0;

        for (int a : gain) {

            current += a;
            if (current > highest)
                highest = current;

        }

        return highest;
    }

    public static void main(String[] args) {

        int[] gain = new int[]{ -5,1,5,0,-7 };
        System.out.println(largestAltitude(gain));

        gain = new int[]{ -4,-3,-2,-1,4,3,2 };
        System.out.println(largestAltitude(gain));

    }
}
