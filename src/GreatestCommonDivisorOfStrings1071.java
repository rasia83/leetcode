public class GreatestCommonDivisorOfStrings1071 {

    public static String gcdOfStrings(String str1, String str2) {
        String out = "";

        // return out;
        if (!(str1+str2).equals(str2+str1))  return "";

        int gcdVal = gcd(str1.length() , str2.length());
        return str2.substring(0, gcdVal);
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC","ABC"));
        System.out.println(gcdOfStrings("ABABAB","ABAB"));
        System.out.println(gcdOfStrings("LEET","CODE"));
        System.out.println(gcdOfStrings("ABAB","ABABABABABABABABAB"));
    }
}
