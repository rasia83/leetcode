public class NumberOfStepsToReduceANumberToZero1342 {

    public static int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0){
            steps++;
            if((num & 1) == 0) { // Before we used num % 2
                num >>= 1; // Before we used num /= 2
                continue;
            }
            num--;
        }

        return steps;
    }

    public static int numberOfSteps2(int num) {
        int steps = 0;

        while (num > 0){
            steps++;
            if(num % 2 == 0) {
                num /= 2;
                continue;
            }
            num--;
        }

        return steps;
    }

    public static void main(String[] args) {

        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps2(14));
    }

}
