public class ReverseWordsInAString151 {

    public static String reverseWords(String s) {

        String[] split = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = split.length-1; i >= 0; i--) {
            if(split[i].isBlank()) {
                continue;
            }
            sb.append(split[i]).append(" ");
        }

        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(reverseWords("the sky is blue"));

        System.out.println(reverseWords("  hello world  "));
        // Your reversed string should not contain leading or trailing spaces.

        System.out.println(reverseWords("a good   example"));
        // You need to reduce multiple spaces between two words to a single space in the reversed string.

    }
}
