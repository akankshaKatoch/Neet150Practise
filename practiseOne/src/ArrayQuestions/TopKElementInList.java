package ArrayQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKElementInList {
    public static void main(String[] args) {
        //int [] num = {0,0,4,4,1,2,2,3,3,3};
        int [] num = {3,0,1,0};
        int k = 1;
        int[] list = getTopKElementInList(num, k);
        System.out.println(Arrays.toString(list));

    }

    private static int[] getTopKElementInList(int[] num, int k) {
        int[] topElements = new int[k];
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int n: num){
         if(!myMap.containsKey(n)){
             myMap.put(n, 1);
         }
         else{
             int value = (int) myMap.get(n);
             myMap.put(n, value+1);
         }
        }
        System.out.println(myMap.entrySet());
        for(int i = 0; i<= k-1; i++){
            topElements[i] = 0;
            int lastHighestValue = 0;
            for(Map.Entry<Integer, Integer> myMap1 : myMap.entrySet()){
                System.out.println(myMap1.getKey());
                if(lastHighestValue < myMap1.getValue()){
                    topElements[i] = myMap1.getKey();
                    lastHighestValue = myMap1.getValue();
                }
            }
            myMap.remove(topElements[i]);


        }
        return topElements;
    }
}
