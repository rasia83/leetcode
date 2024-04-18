import java.util.Arrays;

public class StringCompression443 {

    public static int compress(char[] chars) {

        int i = 0;
        int res = 0;
        while (i < chars.length) {
            int j = 1;
            while (i + j < chars.length && chars[i + j] == chars[i]) {
                j++;
            }
            chars[res++] = chars[i];
            if (j > 1) {
                for (char c : Integer.toString(j).toCharArray()) {
                    chars[res++] = c;
                }
            }
            i += j;
        }
        return res;

        // Two pointers: i, first index of current group; j processed indexs
        // Move j until non repeating char, copy i, copy j, move i to j and repeat

        // TC: O(n)
        // SC: O(1)

        /* V2
        int c=1;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<chars.length;i++)
        {

            if(i+1<chars.length && chars[i]==chars[i+1] )
            {
                c++;
            }
            else
            { sb.append(chars[i]);
                if(c>1)
                {
                    sb.append(c);
                }
                c=1;
            }
        }
        System.out.print(sb);
        char[] compressedChars = sb.toString().toCharArray();
        System.arraycopy(compressedChars, 0, chars, 0, compressedChars.length);
        return sb.length();
        */

        /* can't handle {'a','a','a','b','b','a','a'}, I need to change to an array copy strategy
        if(chars.length == 1)
            return 1;
        
        int count = 1;
        int size = 0;

        for (int i = 0; i < chars.length; i++) {

            if (i+1 < chars.length && chars[i] == chars[i+1]) {
                count++;
                continue;
            }

            if(count > 1) {
                int position = i + 2 - count;
                for (int j = 0; j < Integer.toString(count).length(); j++) {
                    chars[position] = Integer.toString(count).charAt(j);
                    size++;
                    position++;
                }
            }

            count = 1;
            size++;
        }

        return size; */
    }


    public static void main(String[] args) {
        char[] test = new char[]{'a','a','b','b','c','c','c'};
        int result = compress(test);
        System.out.println("Size: " + result + " " + Arrays.toString(Arrays.copyOf(test, result)));
        // Output: Return 6, and the first 6 characters of the input array should be: ['a','2','b','2','c','3']
        // Explanation: The groups are 'aa', 'bb', and 'ccc'. This compresses to 'a2b2c3'.

        test = new char[]{'a'};
        result = compress(test);
        System.out.println("Size: " + result + " " + Arrays.toString(Arrays.copyOf(test, result)));
        // Output: Return 1, and the first character of the input array should be: ['a']
        // Explanation: The only group is 'a', which remains uncompressed since it's a single character.

        test = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        result = compress(test);
        System.out.println("Size: " + result + " " + Arrays.toString(Arrays.copyOf(test, result)));
        // Output: Return 4, and the first 4 characters of the input array should be: ['a','b','1','2'].
        // Explanation: The groups are 'a' and 'bbbbbbbbbbbb'. This compresses to 'ab12'.


        test = new char[]{'a','a','a','b','b','a','a'};
        result = compress(test);
        System.out.println("Size: " + result + " " + Arrays.toString(Arrays.copyOf(test, result)));
        // Expected ["a","3","b","2","a","2"
    }
}
