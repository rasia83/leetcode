public class MergeStringsAlternately1768 {

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();

        /* V1
        StringBuilder sb = new StringBuilder();

        // int l = (word1.length() > word2.length()?word1.length():word2.length());
        // int l = (Math.max(word1.length(), word2.length()));

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            try {
                sb.append(word1.charAt(i));
            } catch (Exception e) {}

            try {
                sb.append(word2.charAt(i));
            } catch (Exception e) {}
        }

        return sb.toString();
        */
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
        System.out.println(mergeAlternately("ab","pqrs"));
        System.out.println(mergeAlternately("abcd","pq"));
    }
}
