package normalPartice;

import java.util.HashMap;

public class maximumCharacterHackerRank {
    public static void main(String[] args) {
        String s = "helloWrold";
        char a = maxOccuringChar(s);
        System.out.println( a);

    }

    private static char maxOccuringChar(String s) {
        char a = 0;
        int maxC =0;
        HashMap<Character, Integer> charOccurance = new HashMap<>();
        for(char n : s.toCharArray()){
            Integer count;
           if(charOccurance.containsKey(n)){
               count = charOccurance.get(n)+1;
               charOccurance.put(n,count+1);
           }
           else {
               count = 1;
               charOccurance.put(n,count);
           }
           if(maxC < charOccurance.get(n)){
               maxC = charOccurance.get(n);
               a= n;
           }
        }
return a;
    }
}
