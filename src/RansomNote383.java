import java.util.HashMap;

public class RansomNote383 {

    public static boolean canConstruct2(String ransomNote, String magazine) {
        // V3
        if(magazine.length() < ransomNote.length())
            return false;

        HashMap<Character,Integer> magChars = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            magChars.put(magazine.charAt(i),(magChars.getOrDefault(magazine.charAt(i),0)) +1 );

        }

        for (int i = 0; i < ransomNote.length(); i++) {

            char r = ransomNote.charAt(i);
            if(!magChars.containsKey(r) || magChars.get(r) == 0)
                return false;

            magChars.put(r,(magChars.get(r)-1));
        }

        return true;

        /* V2
        if(magazine.length() < ransomNote.length())
            return false;

        HashMap<Character,Integer> magChars = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            magChars.put(magazine.charAt(i),(magChars.getOrDefault(magazine.charAt(i),0)) +1 );

        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            int count = magChars.getOrDefault(r,0);

            if(count == 0)
                return false;

            magChars.put(r,count-1);
        }

        return true;
        */
    }


    public static boolean canConstruct(String ransomNote, String magazine) {

        for (int i = 0; i < ransomNote.length(); i++) {

            int index = magazine.indexOf(ransomNote.charAt(i));
            if(index == -1){
                return false;
            }
            magazine = magazine.substring(0,index) + magazine.substring(index+1);
            //magazine = magazine.replaceFirst(String.valueOf(magazine.charAt(index)), "0");
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a","b"));
        System.out.println(canConstruct2("aa","ab"));
        System.out.println(canConstruct2("aa","aab"));
        System.out.println(canConstruct2("aab","baa"));
    }
}
