package ArrayQuestions;

import java.util.Enumeration;
import java.util.HashSet;

public class LongestConsecutiveInteger {
    public static void main(String[] args) {
        int[] arrayElements = {2,20,4,10,3,4,5};
        int a = longestConsecutiveInteger(arrayElements);
        System.out.println("a :" + a);
    }

    private static int longestConsecutiveInteger(int[] arrayElements) {
        HashSet<Integer> elements = new HashSet<>(arrayElements.length);
        int conLength = 0;
        for(int i: arrayElements){
            elements.add(i);
        }
        for(int check: elements){
            System.out.println("check: " + check);
            if(!elements.contains(check-1)){
                System.out.println("I am here");
                int currentSeq = 1;
                while (elements.contains(check+currentSeq)){
                currentSeq++;
            }
                conLength = Math.max(conLength, currentSeq);
        }
        //System.out.println("Final Length: " + conLength);
    }
        return conLength;
    }

}
