package slidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutDuplicates {
    public static void main(String[] args) {
        String s = "xyzdxyz";
        int length = findLongestSubString(s);
        System.out.println(length);


    }

    private static int findLongestSubString(String s) {
        int l = 0;
        int len = 0;
        HashSet<Character> charSet = new HashSet<>();
        for(int r = 0; r<s.length(); r++){
            System.out.println("r :: "+ r);
            while(charSet.contains(s.charAt(r))){
                System.out.println("l :: "+ l);
                charSet.remove((s.charAt(l)));
                l++;
            }
            charSet.add(s.charAt(r));
            len = Math.max(len, (r-l+1));
        }

        return len;
    }
}
