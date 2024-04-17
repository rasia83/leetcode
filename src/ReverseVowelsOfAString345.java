public class ReverseVowelsOfAString345 {

    public static String reverseVowels(String s) {

        // V1 it's mine, this one was in comments.
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (start < end) {
            // Move start pointer until it points to a vowel
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }

            // Move end pointer until it points to a vowel
            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }

            // Swap the vowels
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }

        return new String(word);
    }

    /* V1
    public static String reverseVowels(String s) {

        int last = s.length()-1;
        char[] changed = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {

            if(isVowel(s.charAt(i))){
                // check backward 
                for (int j = last; j > i; j--) {
                    if (isVowel(s.charAt(j))){
                        //found
                        char temp = s.charAt(i);
                        changed[i] = s.charAt(j);
                        changed[j] = temp;
                        last = --j;
                        break; // break "j" for
                    }
                }
            }
            
        }

        return new String(changed);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    */

    public static void main(String[] args) {
        // System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(reverseVowels("aeiou"));

    }
}
