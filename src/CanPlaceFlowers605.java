public class CanPlaceFlowers605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int space = 1;

        for(int bed:flowerbed){
            if(bed == 0)
                space++;
            else
                space = 0;

            if(space == 3){
                n--;
                space = 1;
            }
        }

        if(space == 2)
            n--;

        return n < 1;
    }

    public static void main(String[] args) {

        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 1));  // true
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2));  // false
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,0,0,1}, 2));  // true
        System.out.println(canPlaceFlowers(new int[]{1,0,1,0,1,0,1}, 1));  // false
        System.out.println(canPlaceFlowers(new int[]{0,0,1,0,1}, 1));  // true
        System.out.println(canPlaceFlowers(new int[]{0,0,1,0,0}, 2));  // true
    }
}
