public class IsSubsequence392 {

    /*
    A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
    of the characters without disturbing the relative positions of the remaining characters.
    (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     */
    public static boolean isSubsequence(String s, String t) {
        int index = 0;

        for(char c:s.toCharArray()){
            int newIndex = t.indexOf(c, index);
            if(newIndex == -1)
                return false;

            index = newIndex+1;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isSubsequence("abc","ahbgdc"));

        System.out.println(isSubsequence("axc","ahbgdc"));

        System.out.println(isSubsequence("aaaaaa","bbaaaa"));

    }
}
